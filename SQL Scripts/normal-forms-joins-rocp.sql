DROP TABLE IF EXISTS avengers;

-- 0NF
CREATE TABLE avengers (
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	real_name VARCHAR(30),
	power_level INTEGER
);

--1NF
DROP TABLE IF EXISTS avengers;

CREATE TABLE avengers (
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	power_level INTEGER
);

--To Do, create primary key constraint for sup name and real name. 

ALTER TABLE avengers ADD PRIMARY KEY (superhero_name, first_name, last_name);

INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 2),
	('Hawkeye', 'plucky can-do attitude', 'Clint', 'Barton', 55); 

INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Sam', 'Willson', 2);
	
--2nd NF
DROP TABLE IF EXISTS avengers;

CREATE TABLE avengers (
	superhero_id SERIAL PRIMARY KEY,
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	power_level INTEGER
);

INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 2),
	('Hawkeye', 'plucky can-do attitude', 'Clint', 'Barton', 55);
	
INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 2);
	
--Not 3NF has transitive depency (address info dependent on home base)

DROP TABLE IF EXISTS avengers;

CREATE TABLE avengers (
	superhero_id SERIAL PRIMARY KEY,
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	power_level INTEGER,
	home_base VARCHAR(30),
	hb_address VARCHAR(30),
	hb_city VARCHAR(30),
	hb_state VARCHAR(30),
	hb_zip VARCHAR(30)
);

INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level, home_base, hb_address, hb_city, hb_state, hb_zip)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 2, 'Stark Tower', '123 Stark Ave', 'New York', 'NY', '10709'),
	('Hawkeye', 'plucky can-do attitude', 'Clint', 'Barton', 55, 'Stark Tower', '123 Stark Ave', 'New York', 'NY', '10709');
	
--3NF
DROP TABLE IF EXISTS avengers;
DROP TABLE IF EXISTS homes;

CREATE TABLE homes (
	home_base VARCHAR(30) PRIMARY KEY,
	hb_address VARCHAR(30),
	hb_city VARCHAR(30),
	hb_state VARCHAR(30),
	hb_zip VARCHAR(30)
);

CREATE TABLE avengers (
	superhero_id SERIAL PRIMARY KEY,
	superhero_name VARCHAR(30),
	superhero_power VARCHAR(30),
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	power_level INTEGER,
	home_base_fk VARCHAR(30) REFERENCES homes(home_base) --ON UPDATE CASCADE
);

INSERT INTO homes (home_base, hb_address, hb_city, hb_state, hb_zip)
	Values ('Stark Tower', '123 Tony Is Awesome Ave', 'New York', 'NY', '17028');

INSERT INTO homes (home_base, hb_address, hb_city, hb_state, hb_zip)
	Values ('Helicarrier', 'in the sky', 'somewhere', 'sure', 'whatever');


INSERT INTO avengers (superhero_name, superhero_power, first_name, last_name, power_level, home_base_fk)
	VALUES('Capt. America', 'Super Strong Frisbee', 'Steve', 'Rogers', 2, 'Stark Tower'),
	('Hawkeye', 'plucky can-do attitude', 'Clint', 'Barton', 55, null);

--joins
SELECT * FROM avengers JOIN homes ON home_base = home_base_fk;

SELECT * FROM avengers RIGHT JOIN homes ON home_base = home_base_fk;

SELECT * FROM avengers LEFT JOIN homes ON home_base = home_base_fk;

SELECT * FROM avengers FULL JOIN homes ON home_base = home_base_fk;




