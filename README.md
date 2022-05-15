# cassandra-demo

This repo consists of a sample SpringBootApplication which connects to a local instance of cassandra DB running on default port 9042.

Steps:
Install Cassandra on Mac: https://medium.com/@manishyadavv/how-to-install-cassandra-on-mac-os-d9338fcfcba4

Start cassandra instance and create keyspace with name as "main". Create sample table: 

Create TABLE UserData(id int PRIMARY KEY, name text, address text, age int);

Start SpringBootApplication : This will insert few records into UserData table and same can be visualised with endpoints:

http://localhost:8080/getUsersFilterByAge/40

http://localhost:8080/getAllUsers

