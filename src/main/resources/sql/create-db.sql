drop table user if exists;
create table user (
    id          integer primary key auto_increment,
    name        varchar(30),
    email       varchar(50),
    password    varchar(30)
);

drop table city if exists;
create table city (
    id      integer primary key auto_increment,
    name    varchar(30)
);

drop table hotel if exists;
create table hotel(
    id          integer primary key auto_increment,
    name        varchar(100),
    stars       integer,
    cityId      integer,
    foreign key (cityId) REFERENCES city(id) ON DELETE CASCADE
);
