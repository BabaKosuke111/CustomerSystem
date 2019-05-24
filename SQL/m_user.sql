CREATE TABLE customer_info_db.m_user(
	user_id VARCHAR(24) PRIMARY KEY,
	password VARCHAR(32) NOT NULL,
	user_name VARCHAR(20) UNIQUE NOT NULL,
	update_datetime TIMESTAMP NOT NULL
);