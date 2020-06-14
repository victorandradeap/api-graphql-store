--liquibase formatted sql

--changeset victorapa:2

INSERT INTO client (email, name)
VALUES ('a@a.com', 'Client A');
INSERT INTO client (email, name)
VALUES ('b@b.com', 'Client B');
INSERT INTO client (email, name)
VALUES ('c@c.com', 'Client C');

INSERT INTO product (name, price)
VALUES ('Cap', 25);
INSERT INTO product (name, price)
VALUES ('Ball', 120);
INSERT INTO product (name, price)
VALUES ('Sock', 60);
INSERT INTO product (name, price)
VALUES ('Shirt', 80);
INSERT INTO product (name, price)
VALUES ('Boot', 130);


