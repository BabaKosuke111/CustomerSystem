DROP TABLE customer_info_db.m_customer;

CREATE TABLE customer_info_db.m_customer(
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
	customer_name VARCHAR(50) NOT NULL,
	customer_name_kana VARCHAR(100),
	postal_code CHAR(8),
	address VARCHAR(150),
	update_datetime TIMESTAMP NOT NULL,
);