CREATE SCHEMA funcs;

DROP TABLE IF EXISTS funcs.orders; 

CREATE TABLE funcs.orders (
	order_id serial PRIMARY KEY,
	amount INTEGER,
	price NUMERIC(20, 2),
	total NUMERIC(20, 2),
	customer VARCHAR(25)
);

INSERT INTO funcs.orders (amount, price, total, customer)
	VALUES (500, 10.0, 5000.0, 'Sleepy'),
	(250, 1.50, 375, 'DOC'),
	(1000, 0.5, 500, 'sneezy');

--Scalar function
SELECT LOWER(customer) AS lower_customers FROM funcs.orders;

--Aggragate function
SELECT SUM(total) AS total_sum FROM funcs.orders WHERE price < 7;

--subquery (specificy "SELECT UPPER..." is the subquery within the query statement. 
SELECT COUNT(customer_upper) FROM 
(SELECT UPPER(customer) AS customer_upper FROM funcs.orders) AS upcust
WHERE customer_upper LIKE 'S%';