SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS news;




/* Create Tables */

CREATE TABLE news
(
	id int NOT NULL AUTO_INCREMENT,
	title varchar(255) CHARACTER SET utf-8 ,
	newsContent text CHARACTER SET utf-8 ,
	date varchar(20) CHARACTER SET utf-8 ,
	from varchar(100) CHARACTER SET utf-8 ,
	sort varchar(20) CHARACTER SET utf-8 ,
	discription varchar(255) CHARACTER SET utf-8 ,
	view varchar(20) CHARACTER SET utf-8 ,
	img varchar(255) CHARACTER SET utf-8 ,
	newsContentHref varchar(255) CHARACTER SET utf-8 ,
	PRIMARY KEY (id)
) ;



