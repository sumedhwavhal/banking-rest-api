use banking_rest_api;

CREATE TABLE customer_type(
	customer_type_code VARCHAR(15),
    customer_type_description VARCHAR(40),
    PRIMARY KEY	(customer_type_code)
);

CREATE TABLE customer(
	customer_id INT NOT NULL,
    customer_name VARCHAR(40),
    customer_phone VARCHAR(10),
    customer_email VARCHAR(40),
    date_of_birth DATE,
    date_of_joining DATE,
    customer_type_code VARCHAR(15),
    PRIMARY KEY (customer_id),
    FOREIGN KEY (customer_type_code) REFERENCES customer_type(customer_type_code)
);

CREATE TABLE account_type(
	account_type_code INT,
    account_type_description VARCHAR(40),
    PRIMARY KEY	(account_type_code)
);

CREATE TABLE account(
	account_id INT,
    account_type_code int,
    balance int,
    date_opened DATE,
    customer_id int,
    PRIMARY KEY (account_id),
    FOREIGN KEY (account_type_code) references account_type(account_type_code),
    FOREIGN KEY (customer_id) references customer(customer_id)
);

