SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS blog;
DROP TABLE IF EXISTS blogweb;
DROP TABLE IF EXISTS common;
DROP TABLE IF EXISTS news;




/* Create Tables */

CREATE TABLE blog
(
	-- 网站名字
	blog_webname varchar(100) COMMENT '网站名字',
	-- 标题选择器
	-- 
	blog_title varchar(255) COMMENT '标题选择器
',
	-- 正文
	blog_content text COMMENT '正文',
	-- 博客前面一些字
	blog_discription varchar(255) COMMENT '博客前面一些字',
	-- 博客分类
	blog_sort varchar(100) COMMENT '博客分类',
	-- 博客日期
	blog_date varchar(20) COMMENT '博客日期',
	-- 访问次数
	blog_view int COMMENT '访问次数',
	-- 主键
	blog_id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	web_id int NOT NULL,
	PRIMARY KEY (blog_id)
);


CREATE TABLE blogweb
(
	web_id int NOT NULL AUTO_INCREMENT,
	blog_title_selector varchar(255),
	blog_href_selector varchar(255),
	-- 分类
	blog_sort_selector varchar(50) COMMENT '分类',
	blog_discription_selector varchar(255),
	blog_webname varchar(100),
	blog_list_url varchar(255),
	blog_base_url varchar(255),
	blog_date_selector varchar(255),
	blog_view_selector varchar(255),
	PRIMARY KEY (web_id)
);


CREATE TABLE common
(
	-- 主键
	cid int NOT NULL AUTO_INCREMENT COMMENT '主键',
	-- 主键
	id int COMMENT '主键',
	commoncontent varchar(255),
	-- 评论时间
	commontime varchar(30) COMMENT '评论时间',
	PRIMARY KEY (cid)
);


CREATE TABLE news
(
	-- 主键
	id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	discription varchar(255),
	newscontent text,
	newscontenthref varchar(255),
	img varchar(255),
	view varchar(20),
	sort varchar(20),
	from varchar(100),
	date varchar(20),
	title varchar(100),
	PRIMARY KEY (id)
);



/* Create Foreign Keys */

ALTER TABLE blog
	ADD FOREIGN KEY (web_id)
	REFERENCES blogweb (web_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE common
	ADD FOREIGN KEY (id)
	REFERENCES news (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



