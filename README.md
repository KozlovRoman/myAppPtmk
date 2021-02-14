# myAppPtmk

Postgresql база данных. Я создал простую базу данных, которую назвал usersmanagement. 
В ней таблица: users. Пользователи имеют некоторые атрибуты.

CREATE DATABASE usersmanagement;

USE usersmanagement;
 
CREATE TABLE users (

    id SERIAL NOT NULL,
    nameSurname VARCHAR(20),
    birthDate CHAR(20),
    humanGender VARCHAR(20),
    PRIMARY KEY (id)
    
);
