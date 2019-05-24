DROP TABLE customer_info_db.t_inquiry;

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