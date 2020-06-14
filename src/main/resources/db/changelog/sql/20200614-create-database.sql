--liquibase formatted sql

--changeset victorapa:1

create table client
(
    id    bigint auto_increment primary key,
    name  varchar(255) null,
    email varchar(255) null
);

create table product
(
    id    bigint auto_increment primary key,
    name  varchar(255) null,
    price double       not null
);

create table purchase
(
    id         bigint auto_increment primary key,
    date       datetime null,
    amount     int      null,
    status     int      null,
    client_id  bigint   null,
    product_id bigint   null,
    constraint FK_PURCHASE_PRODUCT foreign key (product_id) references product (id),
    constraint FK_PURCHASE_CLIENT foreign key (client_id) references client (id)
);

