DROP TABLE customer_info_db.t_inquiry;
DROP TABLE customer_info_db.m_status;
DROP TABLE customer_info_db.m_item;
DROP TABLE customer_info_db.m_customer;
DROP TABLE customer_info_db.m_user;

CREATE TABLE customer_info_db.m_status(
	status_code CHAR(2) PRIMARY KEY,
	status_name VARCHAR(20) NOT NULL
);

CREATE TABLE customer_info_db.m_user(
	user_id VARCHAR(24) PRIMARY KEY,
	password VARCHAR(32) NOT NULL,
	user_name VARCHAR(20) UNIQUE NOT NULL,
	update_datetime TIMESTAMP NOT NULL
);


CREATE TABLE customer_info_db.m_item(
	item_id INT PRIMARY KEY AUTO_INCREMENT,
	item_name VARCHAR(50) NOT NULL,
	item_price INT NOT NULL
);


CREATE TABLE customer_info_db.m_customer(
	customer_id INT PRIMARY KEY AUTO_INCREMENT,
	customer_name VARCHAR(50) UNIQUE NOT NULL,
	customer_name_kana VARCHAR(100),
	postal_code CHAR(8),
	address VARCHAR(150),
	update_datetime TIMESTAMP NOT NULL
);

CREATE TABLE customer_info_db.t_inquiry(
	inquiry_id INT PRIMARY KEY AUTO_INCREMENT,
	customer_id INT NOT NULL,
	item_id INT NOT NULL,
	inquiry_datetime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	inquiry_contents VARCHAR(200),
	reply_contents VARCHAR(400),
	status_code CHAR(2) NOT NULL DEFAULT '00',
	update_datetime TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY(customer_id) REFERENCES customer_info_db.m_customer(customer_id),
	FOREIGN KEY(item_id) REFERENCES customer_info_db.m_item(item_id),
	FOREIGN KEY(status_code) REFERENCES customer_info_db.m_status(status_code)
);