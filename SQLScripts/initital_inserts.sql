use banking_rest_api;

insert into customer_type values("Indiviual", "For personal use");
insert into customer_type values("Joint", "For personal use");
insert into customer_type values("Company", "For personal use");

select * from customer_type;

insert into customer values(1, "Sumedh Wavhal", "8999651410", "sumedh@gmail.com", "1997-11-02", "2021-10-12", "Indiviual");
insert into customer values(2, "Kapoor and Sons", "8995651410", "preetam@gmail.com", "1984-01-06", "2021-10-12", "Joint");
insert into customer values(3, "Techyoda pvt ltd", "656262665", "techyoda@gmail.com", "2022-05-25", "2021-10-12", "Company");

select * from customer;

insert into account_type values(101, "Savings");
insert into account_type values(102, "Current");
insert into account_type values(103, "Salary");

select * from account_type;

insert into account values(1523, 103, 2000, "2021-10-12", 1);
insert into account values(6265, 101, 6000, "1984-01-06", 2);
insert into account values(9664, 102, 9000, "2021-10-12", 3);

select * from account;