create table course
(
    id bigint unique,
    name varchar(255) not null,
    author varchar(255) not null,
    primary key (id)
);