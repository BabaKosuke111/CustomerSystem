INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('00','���Ή�');
INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('50','�m�F�˗���');
INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('99','�Ή�����');

INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('yamamoto','yamamotopass','�R�{����');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('suzuki','suzukipass','��ؑ��Y');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('kobayashi','kobayashipass','���ђB��');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('satou','satoupass','�������D');

INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('���܂�����',1000000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('��',2500000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�`���h�P�[�X',3000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�`���h���[��',500);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�����M',24000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('���k�@',60000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('���X�@',90000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�d�؂��',560000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('���X�M',100000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('��p��',100546);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�t�@�����[�^�[',8000630);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('�_���o�[�T�[��',1005000);

INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('���w','�Ђ���','123-4567','��錧');
INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('�t���b�g','�ӂ����','123-7894','�_�ސ쌧');
INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('�p�i�g�j�b�N','�ςȂƂɂ���','123-4566','�����s');

INSERT INTO customer_info_db.t_inquiry(customer_id,item_id,inquiry_contents,reply_contents,status_code)
VALUES(1,1,'250�������肢���܂��B','','00');
