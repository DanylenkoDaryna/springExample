SET NAMES utf8;
DROP DATABASE IF EXISTS testdbspring;
CREATE DATABASE testdbspring CHARACTER SET utf8 COLLATE utf8_bin;
USE testdbspring;


DROP TABLE IF EXISTS cities;

CREATE TABLE cities(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    city_name VARCHAR(15) NOT NULL,
    population INT NOT NULL
);

INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Bratislava',432000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Budapest',1759000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Prague',1280000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Warsaw',1748000);

INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Los Angeles',3971000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'New York',8550000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Edinburgh',464000);
INSERT INTO cities(id, city_name, population) VALUES (DEFAULT,'Berlin',3671000);