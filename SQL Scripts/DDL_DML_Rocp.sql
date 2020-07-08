--DDL commands

DROP TABLE IF EXISTS avengers;

CREATE TABLE avengers (
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	real_name VARCHAR(30),
	power_level INTEGER
);

ALTER TABLE avengers ADD COLUMN active BOOLEAN; 

TRUNCATE avengers; 
--DML command INSERT

/*
 * Multiline comment
 */

INSERT INTO avengers (superhero_name, superhero_power, real_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve Rogers', 2),
	('Hawkeye', 'plucky can-do attitude', 'Clint Barton', 55); 

UPDATE avengers SET active = false WHERE superhero_name = 'Capt. America'; 
UPDATE avengers SET active = false WHERE superhero_name = 'Hawkeye'; 

DELETE FROM avengers WHERE superhero_name = 'Hawkeye';

--DQL

SELECT real_name FROM avengers WHERE superhero_name = 'Capt. America';

SELECT * FROM avengers WHERE power_level <5;

--Transaction

BEGIN;
INSERT INTO avengers (superhero_name, superhero_power, real_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve Rogers', 2),
	('Hawkeye', 'plucky can-do attitude', 'Clint Barton', 55); 
UPDATE avengers SET active = false WHERE superhero_name = 'Capt. America'; 
UPDATE avengers SET active = true WHERE superhero_name = 'Hawkeye'; 
COMMIT;

