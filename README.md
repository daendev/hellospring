# Tomcat-Maven-Spring-Hibernate Hello World
## Database setup
```
create user 'daendev'@'localhost' identified by 'secretpass';
grant select, create, update, delete, insert, drop on * . * to 'daendev'@'localhost';
flush privileges;
create schema hellospringdatabase;
create table hellospringdatabase.Greeting (
	id int(6) unsigned auto_increment primary key,
	greeting varchar(30) not null,
	address varchar(30) not null
);
insert into hellospringdatabase.Greeting values (
	0, "Hello", "World"
);
```

## Usage
Endpoint: http://localhost:8080/hellospring/data/hello
