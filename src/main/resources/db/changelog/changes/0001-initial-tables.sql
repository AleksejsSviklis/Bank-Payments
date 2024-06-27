--liquibase formatted sql

--changeset init:1


CREATE TABLE payment(
                        id                      UUID primary key,
                        amount                  NUMERIC(10, 2) not null,
                        debtorIban              varchar(255) not null,
                        creationTimestamp       timestamp not null
);