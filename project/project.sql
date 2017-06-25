SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS teacher;
DROP TABLE IF EXISTS team;




/* Create Tables */

CREATE TABLE project
(
	-- 主键
	-- 
	pid int NOT NULL AUTO_INCREMENT COMMENT '主键
',
	sid int NOT NULL,
	tid int NOT NULL,
	-- 年份
	theyear int COMMENT '年份',
	pname varchar(255),
	-- 项目类型
	ptype char COMMENT '项目类型',
	-- 项目等级
	prank char COMMENT '项目等级',
	begintime varchar(20),
	-- 结束时间
	endtime varchar(20) COMMENT '结束时间',
	-- 技术领域
	technology varchar(255) COMMENT '技术领域',
	-- 办公费用
	officecost double COMMENT '办公费用',
	-- 办公费用的说明
	officemark varchar(255) COMMENT '办公费用的说明',
	-- 材料
	materialcost double COMMENT '材料',
	-- 耗材说明
	materialmark varchar(255) COMMENT '耗材说明',
	-- 书籍资料费用
	bookcost double COMMENT '书籍资料费用',
	-- 书籍资料费说明
	bookmark varchar(255) COMMENT '书籍资料费说明',
	-- 邮费
	postcost double COMMENT '邮费',
	-- 邮费说明
	postmark varchar(255) COMMENT '邮费说明',
	-- 电话费
	phonecost double COMMENT '电话费',
	-- 电话费说明
	phonemark varchar(255) COMMENT '电话费说明',
	transportationcost double,
	-- 交通费说明
	transportationmark varchar(255) COMMENT '交通费说明',
	-- 维修费用
	maintaincost double COMMENT '维修费用',
	-- 维修说明
	maintainmark varchar(255) COMMENT '维修说明',
	-- 打印费
	-- 
	printcost double COMMENT '打印费
',
	-- 印刷费说明
	-- 
	printmark varchar(255) COMMENT '印刷费说明
',
	-- 项目简介
	pintroduction text COMMENT '项目简介',
	-- 项目背景
	pbackground text COMMENT '项目背景',
	-- 项目研究内容
	pcontent text COMMENT '项目研究内容',
	-- 项目实施方案
	pscheme text COMMENT '项目实施方案',
	-- 具备的条件
	pcondition text COMMENT '具备的条件',
	-- 项目的总目标
	ptarget text COMMENT '项目的总目标',
	-- 项目进度
	pprogress text COMMENT '项目进度',
	-- 是否是团队项目
	isteam int COMMENT '是否是团队项目',
	stu6 varchar(15),
	stu5 varchar(15),
	stu4 varchar(15),
	stu3 varchar(15),
	stu2 varchar(15),
	stu1 varchar(15),
	-- 变更到什么级别
	-- 
	torank char COMMENT '变更到什么级别
',
	-- 变更状态
	tostatus int COMMENT '变更状态',
	PRIMARY KEY (pid)
);


CREATE TABLE student
(
	sid int NOT NULL AUTO_INCREMENT,
	-- 学生姓名
	sname varchar(100) COMMENT '学生姓名',
	-- 学号
	snumber varchar(10) COMMENT '学号',
	-- 团队
	team varchar(100) DEFAULT '无' COMMENT '团队',
	-- 民族
	nation varchar(50) COMMENT '民族',
	-- 学院
	academy varchar(100) COMMENT '学院',
	-- 专业
	-- 
	major varchar(50) COMMENT '专业
',
	-- 班级
	clazz int COMMENT '班级',
	-- 手机号
	phone varchar(15) COMMENT '手机号',
	-- 邮箱
	email varchar(50) COMMENT '邮箱',
	-- qq
	qq varchar(15) COMMENT 'qq',
	-- 学生密码
	spassword varchar(100) COMMENT '学生密码',
	-- 男女
	sex int COMMENT '男女',
	bankcard varchar(20),
	PRIMARY KEY (sid)
);


CREATE TABLE teacher
(
	tid int NOT NULL AUTO_INCREMENT,
	-- 老师的名字
	tname varchar(50) COMMENT '老师的名字',
	-- 所属学院
	tacademy varchar(100) COMMENT '所属学院',
	-- 职称
	title varchar(50) COMMENT '职称',
	-- 教工号
	tnumber varchar(15) COMMENT '教工号',
	-- 密码
	-- 
	tpassword varchar(100) COMMENT '密码
',
	-- 手机号
	tphone varchar(15) COMMENT '手机号',
	-- 老师邮箱
	temail varchar(100) COMMENT '老师邮箱',
	-- 老师年龄
	tage int COMMENT '老师年龄',
	bankcard varchar(20),
	PRIMARY KEY (tid)
);


CREATE TABLE team
(
	-- 团队id
	tmid int NOT NULL AUTO_INCREMENT COMMENT '团队id',
	-- 团队名称
	tmname varchar(100) COMMENT '团队名称',
	PRIMARY KEY (tmid)
);



/* Create Foreign Keys */

ALTER TABLE project
	ADD FOREIGN KEY (sid)
	REFERENCES student (sid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE project
	ADD FOREIGN KEY (tid)
	REFERENCES teacher (tid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



