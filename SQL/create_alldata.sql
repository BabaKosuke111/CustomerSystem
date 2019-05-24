INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('00','未対応');
INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('50','確認依頼中');
INSERT INTO customer_info_db.m_status(status_code,status_name)VALUES('99','対応完了');

INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('yamamoto','yamamotopass','山本綾香');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('suzuki','suzukipass','鈴木太郎');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('kobayashi','kobayashipass','小林達也');
INSERT INTO customer_info_db.m_user(user_id,password,user_name)VALUES('satou','satoupass','佐藤詩織');

INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('たまご入れ',1000000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('扉',2500000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('チルドケース',3000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('チルドルーム',500);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('蒸発皿',24000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('圧縮機',60000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('製氷機',90000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('仕切り板',560000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('製氷皿',100000);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('冷却器',100546);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('ファンモーター',8000630);
INSERT INTO customer_info_db.m_item(item_name,item_price)VALUES('ダンバーサーモ',1005000);

INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('日指','ひさし','123-4567','茨城県');
INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('フラット','ふらっと','123-7894','神奈川県');
INSERT INTO customer_info_db.m_customer(customer_name,customer_name_kana,postal_code,address)VALUES('パナトニック','ぱなとにっく','123-4566','東京都');

INSERT INTO customer_info_db.t_inquiry(customer_id,item_id,inquiry_contents,reply_contents,status_code)
VALUES(1,1,'250個発注お願いします。','','00');
