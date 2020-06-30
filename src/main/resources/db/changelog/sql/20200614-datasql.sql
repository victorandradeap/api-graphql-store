--liquibase formatted sql

--changeset victorapa:2

INSERT INTO client (email, name)
VALUES ('a@a.com', 'Client A');
INSERT INTO client (email, name)
VALUES ('b@b.com', 'Client B');
INSERT INTO client (email, name)
VALUES ('c@c.com', 'Client C');
INSERT INTO client (email, name)
VALUES ('d@d.com', 'Client D');
INSERT INTO client (email, name)
VALUES ('e@e.com', 'Client E');

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



INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (1, 0, 1, 1, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (3, 0, 3, 3, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (1, 0, 1, 1, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (3, 0, 3, 3, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 0, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 1, 4, 4, current_date);

INSERT INTO purchase (amount, status, client_id, product_id, date)
VALUES (4, 1, 4, 1, current_date);
