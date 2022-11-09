cd D:\Spring Tool Suite\Youtube\rest-api\banking-rest-api

docker build --tag=banking-api:latest .

docker run -p 8080:8080 banking-api:latest