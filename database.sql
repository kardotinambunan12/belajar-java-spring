CREATE DATABASE `java-spring`;


show databases ;

use java-spring;


create table users
(
    username varchar(100) not null,
    password varchar(100) not null,
    name varchar(100) not null,
    token varchar(100) ,
    token_exipred_at bigint,
    PRIMARY KEY (username),
    unique (token)
) ENGINE InnoDB;


select * from users;

describe users;


create table contacts(
    id varchar(100) not null ,
    username varchar(100) not null ,
    first_name varchar(100) not null ,
    last_name varchar(100),
    phone varchar(100),
    email varchar(100),
    primary key (id),
    foreign key fk_users_contacts (username) references users(username)
)ENGINE InnoDB;


select * from contacts;

describe contacts;



create table addresses(
    id varchar(100) not null ,
    contact_id varchar(100) not null ,
    street varchar(100),
    city varchar(100),
    province varchar(100),
    country varchar(100) not null ,
    postal_code varchar(10),
    primary key (id),
    foreign key fk_contacts_addresses(contact_id)references contacts(id)

)ENGINE InnoDB;

select * from users;
select * from addresses;

describe addresses;

delete from addresses;

delete from contacts;


delete from users;

