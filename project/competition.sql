/*
SQLyog v10.2 
MySQL - 5.5.29 : Database - competition1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`competition1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `competition1`;

/*Table structure for table `academy` */

DROP TABLE IF EXISTS `academy`;

CREATE TABLE `academy` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `academyname` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `academycode` varchar(20) CHARACTER SET utf8 DEFAULT '     ' COMMENT '专业代码',
  `recommendNumber` int(11) DEFAULT '0' COMMENT '推优数量',
  `time` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`aid`),
  UNIQUE KEY `academycode` (`academycode`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

/*Data for the table `academy` */

insert  into `academy`(`aid`,`academyname`,`academycode`,`recommendNumber`,`time`) values (1,'电气信息工程学院','dqxxgcxy',5,NULL),(2,'数学与信息科学学院','sxyxxkxxy',3,NULL),(3,'商学院','sxy',3,NULL),(4,'法学院','fxy',3,NULL),(5,'文史学院','wsxy',3,NULL),(6,'外国语学院','wgyxy',3,NULL),(7,'管理学院','glxy',3,NULL),(8,'音乐舞蹈学院','yywdxy',3,NULL),(9,'设计艺术学院','sjysxy',3,NULL),(10,'学工部','xgb',3,NULL),(11,'计算机科学与工程学院','jsjkxygcxy',3,NULL),(12,'生物科学与工程学院','swkxygcxy',3,NULL),(13,'化学与化学工程学院','hxyhxgcxy',3,NULL),(14,'材料科学与工程学院','clkxygcxy',3,NULL),(15,'经济学院','jjxy',3,NULL),(16,'研究生处','yjsc',0,NULL),(17,'机电工程学院','jdgcxy',3,NULL),(18,'土木工程学院','tmgcxy',3,NULL),(19,'医学影像技术系','yxyxjsx',3,NULL),(20,'阿拉伯语学院','albyxy',3,NULL),(21,'预科教育学院','ykjyxy',3,NULL),(22,'马克思主义学院','mkszyxy',3,NULL),(23,'体育学院','tyxy',3,NULL),(24,'基础教育学院','jcjyxy',3,NULL),(25,'创新创业教育学院','cxcyjyxy',15,NULL);

/*Table structure for table `academyadmin` */

DROP TABLE IF EXISTS `academyadmin`;

CREATE TABLE `academyadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `admincode` varchar(100) NOT NULL COMMENT '管理员账号',
  `password` varchar(100) NOT NULL DEFAULT 'admin' COMMENT '密码',
  `academyname` varchar(255) NOT NULL COMMENT '学院名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `academyadmin` */

insert  into `academyadmin`(`id`,`admincode`,`password`,`academyname`) values (1,'jsjkxygcxy','123456','计算机科学与工程学院');

/*Table structure for table `applyreward` */

DROP TABLE IF EXISTS `applyreward`;

CREATE TABLE `applyreward` (
  `material` text COMMENT '证明材料',
  `cid` int(10) unsigned NOT NULL COMMENT '主键',
  `sid` int(10) unsigned NOT NULL COMMENT '学生主键',
  `teacherchack` text,
  `academycheck` text,
  `schoolcheck` text,
  `status` int(11) DEFAULT NULL,
  `rank` int(11) DEFAULT NULL COMMENT '等级',
  `rid` int(11) DEFAULT NULL COMMENT 'rewardid',
  PRIMARY KEY (`cid`,`sid`),
  KEY `sid` (`sid`),
  CONSTRAINT `applyreward_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `competition` (`cid`),
  CONSTRAINT `applyreward_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `applyreward` */

insert  into `applyreward`(`material`,`cid`,`sid`,`teacherchack`,`academycheck`,`schoolcheck`,`status`,`rank`,`rid`) values (NULL,2,38,'我真的不知道怎么说才好<br />',NULL,NULL,1,NULL,NULL),(NULL,3,38,'我没啥意见，这个孩子的确不错<br />','我也觉得不错<br />','sadsadasdasdasd<br />',3,NULL,NULL),('dsfsdfsd <br />',6,38,NULL,NULL,NULL,0,1,NULL);

/*Table structure for table `competition` */

DROP TABLE IF EXISTS `competition`;

CREATE TABLE `competition` (
  `cid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tid` int(10) unsigned NOT NULL COMMENT '主键',
  `serialnumber` varchar(50) DEFAULT NULL COMMENT '竞赛编号',
  `cname` varchar(100) NOT NULL COMMENT '竞赛名称',
  `hosttime` date NOT NULL COMMENT '举办日期',
  `sponsor` varchar(255) NOT NULL COMMENT '主办单位',
  `organizer` varchar(255) NOT NULL COMMENT '承办单位',
  `hostplace` varchar(100) NOT NULL DEFAULT '待定' COMMENT '举办地点',
  `aboutsubjects` varchar(100) NOT NULL DEFAULT '无' COMMENT '相关学科',
  `predictnumber` int(11) NOT NULL DEFAULT '0' COMMENT '预计人数',
  `guideteachernumber` varchar(20) NOT NULL COMMENT '指导老师教工号',
  `competitionLevel` char(1) NOT NULL COMMENT '比赛的等级',
  `teamnumbers` int(10) unsigned DEFAULT '1' COMMENT '参赛的最多的人数',
  `status` int(11) DEFAULT '0' COMMENT '审核进程(到那一关了)',
  `joinway` int(11) DEFAULT '0' COMMENT '参赛方式(0单人)（1多人）',
  `starTime` date DEFAULT NULL COMMENT '报名开始时间',
  `stopTime` date DEFAULT NULL COMMENT '报名截止时间',
  `applyTime` date DEFAULT NULL COMMENT '申请时间',
  `funds` double NOT NULL COMMENT '申请经费',
  `purpose` text COMMENT '竞赛的意义',
  `mission` varchar(255) DEFAULT NULL COMMENT '知道老师的任务',
  `content` text COMMENT '竞赛的内容',
  `program` text COMMENT '竞赛的流程',
  `studentsbenefit` text COMMENT '学生受益',
  `projectprocess` text COMMENT '竞赛的进程',
  `publicitycost` double NOT NULL COMMENT '宣传花费',
  `publicitymark` varchar(255) DEFAULT NULL COMMENT '宣传费用备注',
  `materialmark` varchar(255) NOT NULL COMMENT '材料花费备注',
  `materialcost` double NOT NULL COMMENT '材料花费',
  `travelcost` double NOT NULL COMMENT '差旅费用',
  `travelmark` varchar(255) NOT NULL COMMENT '差旅花费备注',
  `othercost` double DEFAULT NULL COMMENT '其他花费',
  `othermark` varchar(255) DEFAULT NULL COMMENT '其他花费备注',
  `joincost` double unsigned NOT NULL COMMENT '报名花费',
  `joinmark` varchar(255) NOT NULL DEFAULT '暂无' COMMENT '参加比赛花费备注',
  `issue` int(11) DEFAULT NULL COMMENT '暂存',
  `schoolchackidea` text,
  `academychackidea` text,
  PRIMARY KEY (`cid`),
  KEY `tid` (`tid`),
  CONSTRAINT `competition_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `competition` */

insert  into `competition`(`cid`,`tid`,`serialnumber`,`cname`,`hosttime`,`sponsor`,`organizer`,`hostplace`,`aboutsubjects`,`predictnumber`,`guideteachernumber`,`competitionLevel`,`teamnumbers`,`status`,`joinway`,`starTime`,`stopTime`,`applyTime`,`funds`,`purpose`,`mission`,`content`,`program`,`studentsbenefit`,`projectprocess`,`publicitycost`,`publicitymark`,`materialmark`,`materialcost`,`travelcost`,`travelmark`,`othercost`,`othermark`,`joincost`,`joinmark`,`issue`,`schoolchackidea`,`academychackidea`) values (1,6,'a20175281','sadsadsad','2014-07-07','das','sadsadassad','dsadsadas','sadasdasd',342,'20153333','a',NULL,2,1,NULL,'2017-06-30','2017-05-20',423,'243234423','asdasd','23423432','32423432','234234','3243243',4234,'23','234234',4234,324,'234324',23423,'234',4234234,'32432',0,'必须通过！支持','我很想你通过，怎么办'),(2,6,'b20175282','第三届网页设计大赛','2017-09-09','java团队','北方民族大学创新差ungyexueyuan','实验刘','97898797897',78979,'20153333','b',NULL,2,2,'2017-06-13','2017-06-24','2017-05-26',68967,'8987987978978','789879789','78987987','978978987978979','9879789789','9789879789',9797,'987987','79879',79879,9789,'978987',79887978,'97898798797',9789789,'789879',0,'撒扩大；阿斯克；&nbsp;','我真的不知道怎么说你的好'),(3,6,'','娃姐啊实打实了','2017-07-08','呃3324324','432423','第四范式地方','234',4324,'fsdf','a',NULL,-2,0,NULL,NULL,'2017-05-28',4324,'234324',NULL,'324234<hr />','324234','432423432423','43243244324',4324,'3243','432',432,432,'43',4324,'234234',32423,'4232',NULL,'sadsadasda','这个逼很牛'),(4,6,'b20175281','ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','b',NULL,1,0,NULL,NULL,'2017-05-28',23423,'4324',NULL,'432','32','432','432',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,'我也不想说太多，好吧','没意见'),(5,6,NULL,'ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','b',NULL,1,0,NULL,NULL,'2017-05-28',23423,'4324',NULL,'432','32','432','4324324',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,NULL,'我没意见'),(6,6,NULL,'ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','d',NULL,0,0,NULL,NULL,'2017-05-28',23423,'4324',NULL,'432','32','432','4324324',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,NULL,'你这个比真的牛逼啊'),(7,6,NULL,'ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','b',NULL,0,0,NULL,NULL,'2017-05-28',23423,'4324',NULL,'432','32','432','4324324',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,NULL,'请不要装逼'),(8,6,NULL,'ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','d',NULL,0,0,NULL,NULL,'2017-05-28',23423,'4324',NULL,'432','32','432','4324324',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,NULL,'不撞死就不会死'),(9,6,'e2017634','ewqe','2017-09-09','erwrew','wqeqe','ewrwe','324',423,'20153333','e',NULL,2,1,'2017-06-14','2017-06-30','2017-05-28',23423,'4324',NULL,'432','32','432','4324324',432,'234','234',324234,43,'234',234,'234',324,'423',NULL,'ewrewrewr','你这比'),(10,6,'c2017623','第三届网页设计大赛','2017-06-14','北方民族大学','java项目开发创新团队','实验六','啊大苏打',45,'fsdf','c',NULL,2,2,'2017-06-07','2017-06-22','2017-06-02',4353,'撒的撒旦',NULL,'的撒打算','的撒的','啊似的撒旦阿三','撒旦撒旦啊是多少阿的撒',4324,'额度发大水','分时段发生点',324,34,'房贷首付但是',32,'房贷首付但是',32424,'4234',NULL,'<p>学校支持</p>','<p>学院支持</p>');

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `mid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '专业id',
  `aid` int(11) NOT NULL,
  `majorname` varchar(50) NOT NULL COMMENT '专业名称',
  `majorcode` varchar(20) DEFAULT NULL COMMENT '专业代码',
  PRIMARY KEY (`mid`),
  UNIQUE KEY `majorcode` (`majorcode`),
  KEY `aid` (`aid`),
  CONSTRAINT `major_ibfk_1` FOREIGN KEY (`aid`) REFERENCES `academy` (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

/*Data for the table `major` */

insert  into `major`(`mid`,`aid`,`majorname`,`majorcode`) values (1,1,'信息工程','243235rf'),(2,1,'通信工程','uililo'),(3,1,'自动化','ioliuloi'),(4,1,'测控技术与仪器','liol8l,'),(6,1,'电气工程及其自动化','iulouilo'),(7,1,'电子信息工程','iuouio'),(13,2,'信息与计算科学','uioiuo'),(14,2,'数学与应用数学','iollo'),(15,2,'统计学','uyiuiu'),(16,2,'应用统计学','kiulou'),(17,3,'会计学','dsffsdf'),(18,3,'会计学（注册会计师）','asfqwer'),(19,3,'财务管理','dsgdfg'),(20,3,'电子商务','43543543'),(21,3,'工商管理','1423432'),(22,3,'物流管理','324234'),(23,4,'法学','4124234'),(27,5,'汉语言文学','vfb'),(28,5,'新闻学','21423432321'),(29,5,'新闻学（广告）','u'),(30,5,'广告学','tutyu'),(31,5,'汉语言文学（文秘）','43543v'),(32,5,'历史学','3453v'),(33,5,'传播学','er'),(34,6,'英语','etet43'),(35,6,'日语','345fr'),(36,6,'商务英语','34534tre'),(37,7,'旅游管理','345345t'),(38,7,'公共事业管理','34534rg'),(39,7,'人力资源管理','rwerwr'),(40,7,'行政管理','ewrwrr3'),(41,8,'音乐表演','ytutyu'),(42,8,'音乐学','fdgweer'),(43,8,'舞蹈学','32425342'),(44,8,'作曲与作曲技术理论','41265'),(45,9,'艺术设计（公共艺术设计）','3245645'),(46,9,'艺术设计（视觉传达）','dfds'),(47,9,'艺术设计（环境艺术设计）','rwert'),(48,9,'工业设计（产品造型设计）','wr'),(49,9,'绘画（中国画）','xdzcz'),(50,9,'艺术设计','vcb'),(51,9,'工业设计','fdsvcv'),(52,9,'绘画（油画）','dsfsdf'),(53,9,'动画','dsf'),(54,9,'雕塑','dfsf'),(55,9,'视觉传达设计','sdfsf'),(56,9,'环境设计','dsfdsfdsfds'),(57,9,'产品设计','34234'),(58,9,'绘画','346546'),(59,11,'计算机科学与技术','8768787'),(60,11,'网络工程','dsfdsf'),(61,11,'软件工程','sdfsdf'),(62,11,'信息管理与信息系统','2313'),(63,12,'生物工程','21321'),(65,12,'生物技术','45'),(67,12,'生物科学','ret'),(68,12,'食品科学与工程','ewrewf'),(69,13,'过程装备与控制工程','fdsfs'),(70,13,'化学工程与工艺','sfdsf'),(71,13,'制药工程','dfdsf'),(73,14,'材料科学与工程','786767'),(74,14,'高分子材料与工程','6876'),(75,14,'材料成型及控制工程','awrgfd'),(76,14,'新能源材料与器件','fdgfdg'),(77,15,'经济学','dgfdgfd'),(78,15,'国际经济与贸易','dfgdf'),(79,15,'金融学','d'),(80,15,'金融学（保险学）','dsafdgf'),(81,15,'金融学（证券投资）','dsawqe'),(82,15,'金融学（商业银行管理）','wqeqwe'),(83,17,'机械设计制造及其自动化','asdasd'),(84,18,'土木工程','as'),(85,19,'医学影像技术','78676'),(86,20,'阿拉伯语','87673'),(87,21,'预科（文）','3453'),(88,21,'预科（理）','543543'),(89,21,'预科（民）','da'),(91,21,'预科（基础）','sadas'),(92,21,'预科（管理）','dsa'),(93,22,'思想政治教育','asdadsa'),(94,23,'体育教育','3213');

/*Table structure for table `parentmeun` */

DROP TABLE IF EXISTS `parentmeun`;

CREATE TABLE `parentmeun` (
  `pid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '父菜单id',
  `role` int(11) NOT NULL COMMENT '哪个角色拥有它',
  `pmeunname` varchar(50) NOT NULL COMMENT '菜单名称',
  `pmorder` int(11) NOT NULL COMMENT '顺序',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pmorder` (`pmorder`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `parentmeun` */

insert  into `parentmeun`(`pid`,`role`,`pmeunname`,`pmorder`) values (1,2,'个人中心',21),(2,2,'发布中心',25),(3,2,'竞赛过程管理',23),(4,2,'竞赛前期管理',22),(5,2,'指导老师的权限',24),(6,3,'竞赛后期管理',33),(7,3,'初始化中心',34),(8,3,'个人中心',31),(9,4,'个人中心',41),(10,4,'竞赛前期管理',42),(11,4,'竞赛过程管理',43),(12,4,'竞赛后期管理',44),(13,4,'发布中心',45),(14,4,'初始化中心',46),(15,3,'竞赛前期管理',32),(16,1,'个人中心',11),(17,1,'我的竞赛',12);

/*Table structure for table `report` */

DROP TABLE IF EXISTS `report`;

CREATE TABLE `report` (
  `cid` int(10) unsigned NOT NULL COMMENT '主键',
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `academycheck` text,
  `schoolcheck` text,
  `status` int(11) DEFAULT NULL,
  `joincost` double DEFAULT NULL,
  `joinmark` varchar(255) DEFAULT NULL,
  `travelcost` double DEFAULT NULL,
  `travelmark` varchar(255) DEFAULT NULL,
  `othercost` double DEFAULT NULL,
  `othermark` varchar(255) DEFAULT NULL,
  `materialmark` varchar(255) DEFAULT NULL,
  `materialcost` double DEFAULT NULL,
  `publicitycost` double DEFAULT NULL,
  `publicitymark` varchar(255) DEFAULT NULL,
  `summary` text,
  `scaledeclare` text,
  `production` text,
  PRIMARY KEY (`rid`),
  KEY `cid` (`cid`),
  CONSTRAINT `report_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `competition` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `report` */

insert  into `report`(`cid`,`rid`,`academycheck`,`schoolcheck`,`status`,`joincost`,`joinmark`,`travelcost`,`travelmark`,`othercost`,`othermark`,`materialmark`,`materialcost`,`publicitycost`,`publicitymark`,`summary`,`scaledeclare`,`production`) values (5,1,NULL,NULL,0,2323,'234',4324,'324324',324,'32','4324',4324,432432,'44','wqewqewq','qwewqewqewqe','rwqerwqewqe'),(2,2,NULL,NULL,0,534543,'53453',435435,'54353',543534,'5435345','435435',435435,5435,'5435435','dfsfsdfsdfsd','dsardfd','gretreterte<img src=\"/competition/attached/image/20170602/20170602193830_464.jpg\" alt=\"\" />');

/*Table structure for table `reward` */

DROP TABLE IF EXISTS `reward`;

CREATE TABLE `reward` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `level` char(1) DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL,
  `rstudent` double DEFAULT NULL,
  `rteacher` double DEFAULT NULL,
  `isteam` int(11) DEFAULT NULL,
  `isart` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `reward` */

insert  into `reward`(`rid`,`level`,`category`,`rstudent`,`rteacher`,`isteam`,`isart`) values (1,'a','文理类学科',8000,5000,0,0),(2,'a','文理类学科',3000,100,1,0),(3,'a','音乐,舞蹈，美术和体',6000,4000,0,1),(4,'a','音乐,舞蹈，美术和体',2000,100,0,1);

/*Table structure for table `schooladmin` */

DROP TABLE IF EXISTS `schooladmin`;

CREATE TABLE `schooladmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `admincode` varchar(100) DEFAULT NULL COMMENT '管理猿账号',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `schooladmin` */

insert  into `schooladmin`(`id`,`admincode`,`password`) values (1,'admin','myadmin');

/*Table structure for table `sonmeun` */

DROP TABLE IF EXISTS `sonmeun`;

CREATE TABLE `sonmeun` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '子菜单id',
  `pid` int(10) unsigned NOT NULL COMMENT '父菜单id',
  `smeunname` varchar(50) NOT NULL COMMENT '子菜单名字',
  `meunurl` varchar(255) NOT NULL COMMENT '子菜单链接url',
  `sorder` int(11) NOT NULL COMMENT '子菜单顺序',
  `role` int(11) NOT NULL COMMENT '哪个角色拥有这个子菜单',
  PRIMARY KEY (`sid`),
  UNIQUE KEY `sorder` (`sorder`),
  KEY `pid` (`pid`),
  CONSTRAINT `sonmeun_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `parentmeun` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8;

/*Data for the table `sonmeun` */

insert  into `sonmeun`(`sid`,`pid`,`smeunname`,`meunurl`,`sorder`,`role`) values (1,9,'修改密码','scgoto/changepass.action',11,4),(2,10,'所有竞赛汇总','scgoto/competionList.action',21,4),(8,10,'正在举办的比赛','scgoto/chackcompetitionList.action',22,4),(9,10,'等待审核比赛','scgoto/chackcompetitionList.action',23,4),(10,11,'待审核结项报告','error/runerror.action',24,4),(16,11,'已审核结项报告','error/runerror.action',25,4),(17,11,'各竞赛报名情况','error/runerror.action',26,4),(18,12,'待审核奖励申请','scgoto/schoolCheckReward.action',27,4),(19,12,'已审核奖励申请','scgoto/showAfterCheckStudentApplyRewardList.action',28,4),(20,12,'年度信息统计','error/runerror.action',29,4),(21,12,'获奖人员统计','error/runerror.action',30,4),(22,12,'竞赛奖励统计','error/runerror.action',31,4),(23,13,'发布竞赛新闻','error/runerror.action',32,4),(30,13,'发布竞赛通知','error/runerror.action',33,4),(31,13,'发布文件汇编','error/runerror.action',34,4),(32,13,'发布下载中心','error/runerror.action',35,4),(33,13,'任务信息查看','error/runerror.action',36,4),(34,13,'联系我们','error/runerror.action',37,4),(35,14,'学院专业设置','academy/getAllAcademyAndMajor.action',38,4),(36,14,'学院管理员','scgoto/getAllAcademyAdmin.action',39,4),(37,14,'教师信息','teacher/list.html',40,4),(38,14,'学院推优项目设置','32432',41,4),(39,14,'学生信息','student/list.html',42,4),(40,14,'设置指导老师数量','error/runerror.action',43,4),(41,14,'奖励标准','3242423',44,4),(44,1,'基本信息','tgoto/showmessage.action',45,2),(45,1,'修改密码','tgoto/changepass.action',46,2),(48,4,'申请竞赛','tgoto/gotoapplycompetitiom.action',47,2),(49,4,'我的竞赛','tgoto/showmycompetitionList.action',48,2),(50,5,'审核报名学生','435435',49,2),(51,5,'正在指导的学生','/tgoto/showMyGuideStudent.action',50,2),(53,5,'获奖申请列表','tgoto/showStudentApplyRewardList.action',51,2),(54,5,'已审核获奖申请','tgoto/showAfterStudentApplyRewardList.action',52,2),(55,3,'正在负责的竞赛','tgoto/showmycompetitionList.action',53,2),(56,3,'学生报名情况','tgoto/showpassschoolcompetition.action',54,2),(57,3,'竞赛结项报告','tgoto/gotoReport.action',55,2),(58,3,'结项报告列表','tgoto/showReportList.action',56,2),(59,2,'发布竞赛新闻','error/runerror.action',57,2),(60,2,'发布竞赛通知','error/runerror.action',58,2),(62,2,'发布文件汇编','error/runerror.action',59,2),(63,2,'发布下载中心','error/runerror.action',60,2),(64,2,'任务信息查看','error/runerror.action',61,2),(65,16,'基本信息','sgoto/showmessage.action',62,1),(66,16,'修改密码','sgoto/changepass.action',63,1),(67,17,'竞赛列表','sgoto/showAllCompetition.action',64,1),(68,17,'已经报名的竞赛','join/mycompetition.action',65,1),(69,17,'获奖申请','sgoto/gotoapplyforreward.action',66,1),(70,17,'已提交获奖申请','sgoto/getMyApply.action',67,1),(71,17,'我的获奖','error/runerror.action',68,1),(72,6,'获奖申请列表','agoto/academyCheckReward.action',69,3),(76,6,'已审核获奖申请','agoto/showAfterCheckStudentApplyRewardList.action',70,3),(77,6,'获奖人员统计','error/runerror.action',71,3),(78,7,'教师信息','teacher/getAllTeacherByAcademy.action',72,3),(79,8,'修改密码','agoto/changepass.action',73,3),(80,15,'等待审核竞赛','agoto/checkCompetitionList.action',74,3),(82,10,'已审核竞赛项目','scgoto/checkedcompetitionlist.action',76,4),(83,7,'学生信息','student/getStudentByacademy.action',77,3),(84,15,'已审核竞赛','agoto/checkedCompetitionList.action',79,3),(85,15,'所有竞赛项目','agoto/allCompetitionList.action',80,3);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '学生主键',
  `sname` varchar(50) NOT NULL COMMENT '学生姓名',
  `snumber` varchar(15) NOT NULL COMMENT '学号',
  `card` varchar(25) DEFAULT NULL COMMENT '银行卡号',
  `academy` varchar(50) NOT NULL COMMENT '学院',
  `major` varchar(50) NOT NULL COMMENT '专业',
  `phone` varchar(20) NOT NULL COMMENT '电话',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `password` varchar(20) NOT NULL DEFAULT '123456' COMMENT '密码',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=755 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`sid`,`sname`,`snumber`,`card`,`academy`,`major`,`phone`,`email`,`password`) values (36,'324324','234234',NULL,'','','423423','4324242','123456'),(37,'dsadsad','sadsadsad',NULL,'','','adsadsadsa','sadsadsadsa','123456'),(38,'王则其','20152154',NULL,'计算机科学与工程学院','软件工程','18795207136','1016484945@qq.com','654321'),(41,'wdwqe','wqewq',NULL,'','','sd','wqewqe','123456'),(42,'fds','fsdf','fdsfsd','sdfdsfsd','sfdsfs','dfsf','dsfsd','123456'),(43,'fds','fdsf','sdfsd','dsfds','fdsf','fdsfds','fdsf','123456'),(44,'fdsf','dsfsd','ds','fsdsdf','fds','fdsf','sdfsdfds','123456'),(45,'dsf','ff','ds','dsfdsf','dsfdsf','dsf','dsf','123456'),(46,'sd','sfds','ds','fsd','fsd','fds','sdfds','123456'),(47,'fds','fds','sdf','fdsf','ds','fdsf','dsf','123456'),(48,'dsfdsf','d','sd','fds','ds','f','dsfds','123456'),(49,'f','ds','ff','dsfds','f','sfds','dsf','123456'),(50,'dsad','sd','fsd','','ds','dsfsd','dsf','123456'),(51,'asdasdsa','da','ds','ds','sasa','f','dsf','123456'),(52,'asd','f','fds','f','dsadd','dsd','sasa','123456'),(53,'asd','ds','dsf','sadsa','dd','sad','sad','123456'),(54,'asasd','asd','asds','a','sadssaa','das','dd','123456'),(55,'saas','sad','dd','d','d','dd','aass','123456'),(56,'assad','sad','sad','sad','d','sd','dssad','123456'),(57,'ddsa','asas','dd','asd','sada','sad','as','123456'),(58,'sad','asdsad','dsa','asdsdas','dasd','sa','sdad','123456'),(59,'dadsa','dsadsa','dad','dsad','asa','asdad','asasd','123456'),(60,'asdsa','adsad','dsa','dsad','dsadas','asd','sad','123456'),(61,'sadadsa','dsad','sa','d','ddsa','sasa','dsadsa','123456'),(62,'d','dsasa','sa','dsad','sad','dsda','dd','123456'),(63,'da','dsa','ssa','dsad','sa','sa','dsa','123456'),(64,'dsad','sa','d','dsa','sas','dsasad','sa','123456'),(65,'dsadsa','sadsad','dd','sa','dsadd','sa','sa','123456'),(66,'sadsa','dsasa','dsasad','dsa','ffsd','sasa','dd','123456'),(67,'asdd','sasa','dasdsa','sasa','ffsd','sasa','dsasa','123456'),(68,'dsadsadsa','sa','dsdsadsadsa','dsa','fsd','dsfdsdsf','sa','123456'),(69,'dsadsa','as','dsadd','dsa','dsad','ds','dd','123456'),(70,'dsadsa','ddsa','asd','dsadsasa','sdfsd','fsd','fdsfds','123456'),(71,'dsdsff','fdf','fdsfds','dsfdsfsd','sdf','sdf','dsf','123456'),(72,'fsdf','dsdsf','ds','dsfsdds','dfsdsd','ffsdf','fsd','123456'),(73,'fdsfdsf','dsfsdfsdf','dsfsdfsd','dsfdsfds','sdfdsfds','sfdsfdsf','dsfdsfdsfsd','123456'),(74,'fdsfds','sdfdsf','dsfds','fdsfdsf','sdfsdfsdf','dsfdsfds','fsdfdsf','123456'),(75,'dsad','sadas',NULL,'','','','','123456'),(76,'dsa','',NULL,'','','','','123456'),(77,'ada','',NULL,'','','','','123456'),(78,'das','',NULL,'','','','','123456'),(79,'das','',NULL,'','','','','123456'),(80,'das','',NULL,'','','','','123456'),(81,'das','',NULL,'','','','','123456'),(82,'asd','',NULL,'','','','','123456'),(83,'ads','',NULL,'','','','','123456'),(84,'asd','',NULL,'','','','','123456'),(85,'sda','',NULL,'','','','','123456'),(86,'sdsd','',NULL,'','','','','123456'),(87,'a','',NULL,'','','','','123456'),(88,'dsa','',NULL,'','','','','123456'),(89,'sa','',NULL,'','','','','123456'),(90,'dsa','',NULL,'','','','','123456'),(91,'d','',NULL,'','','','','123456'),(92,'ad','',NULL,'','','','','123456'),(93,'sa','',NULL,'','','','','123456'),(94,'sa','',NULL,'','','','','123456'),(95,'d','',NULL,'','','','','123456'),(96,'d','',NULL,'','','','','123456'),(97,'sa','',NULL,'','','','','123456'),(98,'d','',NULL,'','','','','123456'),(99,'sad','',NULL,'','','','','123456'),(100,'sa','',NULL,'','','','','123456'),(101,'sa','',NULL,'','','','','123456'),(102,'dsa','',NULL,'','','','','123456'),(103,'d','',NULL,'','','','','123456'),(104,'sad','',NULL,'','','','','123456'),(105,'sa','',NULL,'','','','','123456'),(106,'sa','',NULL,'','','','','123456'),(107,'dsa','',NULL,'','','','','123456'),(108,'dsa','',NULL,'','','','','123456'),(109,'d','',NULL,'','','','','123456'),(110,'d','',NULL,'','','','','123456'),(111,'sadsa','',NULL,'','','','','123456'),(112,'d','',NULL,'','','','','123456'),(113,'dsa','',NULL,'','','','','123456'),(114,'dsa','',NULL,'','','','','123456'),(115,'das','',NULL,'','','','','123456'),(116,'d','',NULL,'','','','','123456'),(117,'sa','',NULL,'','','','','123456'),(118,'das','',NULL,'','','','','123456'),(119,'dsa','',NULL,'','','','','123456'),(120,'d','',NULL,'','','','','123456'),(121,'ad','',NULL,'','','','','123456'),(122,'sa','',NULL,'','','','','123456'),(123,'d','',NULL,'','','','','123456'),(124,'sd','',NULL,'','','','','123456'),(125,'d','',NULL,'','','','','123456'),(126,'sa','',NULL,'','','','','123456'),(127,'dsa','',NULL,'','','','','123456'),(128,'d','',NULL,'','','','','123456'),(129,'d','',NULL,'','','','','123456'),(130,'sa','',NULL,'','','','','123456'),(131,'dsa','',NULL,'','','','','123456'),(132,'dsa','',NULL,'','','','','123456'),(133,'d','',NULL,'','','','','123456'),(134,'sad','',NULL,'','','','','123456'),(135,'sa','',NULL,'','','','','123456'),(136,'sa','',NULL,'','','','','123456'),(137,'dsa','',NULL,'','','','','123456'),(138,'d','',NULL,'','','','','123456'),(139,'sad','',NULL,'','','','','123456'),(140,'sa','',NULL,'','','','','123456'),(141,'dsa','',NULL,'','','','','123456'),(142,'dsa','',NULL,'','','','','123456'),(143,'d','',NULL,'','','','','123456'),(144,'d','',NULL,'','','','','123456'),(145,'sa','',NULL,'','','','','123456'),(146,'sa','',NULL,'','','','','123456'),(147,'dsa','',NULL,'','','','','123456'),(148,'d','',NULL,'','','','','123456'),(149,'d','',NULL,'','','','','123456'),(150,'sa','',NULL,'','','','','123456'),(151,'sa','',NULL,'','','','','123456'),(152,'dsa','',NULL,'','','','','123456'),(153,'d','',NULL,'','','','','123456'),(154,'a','',NULL,'','','','','123456'),(155,'sa','',NULL,'','','','','123456'),(156,'dsa','',NULL,'','','','','123456'),(157,'d','',NULL,'','','','','123456'),(158,'d','',NULL,'','','','','123456'),(159,'sad','',NULL,'','','','','123456'),(160,'sa','',NULL,'','','','','123456'),(161,'sa','',NULL,'','','','','123456'),(162,'dsa','',NULL,'','','','','123456'),(163,'ds','',NULL,'','','','','123456'),(164,'d','',NULL,'','','','','123456'),(165,'d','',NULL,'','','','','123456'),(166,'sa','',NULL,'','','','','123456'),(167,'dsa','',NULL,'','','','','123456'),(168,'dsa','',NULL,'','','','','123456'),(169,'d','',NULL,'','','','','123456'),(170,'sad','',NULL,'','','','','123456'),(171,'sa','',NULL,'','','','','123456'),(172,'dsa','',NULL,'','','','','123456'),(173,'d','',NULL,'','','','','123456'),(174,'sad','',NULL,'','','','','123456'),(175,'das','',NULL,'','','','','123456'),(176,'d','',NULL,'','','','','123456'),(177,'sad','',NULL,'','','','','123456'),(178,'sa','',NULL,'','','','','123456'),(179,'dsa','',NULL,'','','','','123456'),(180,'d','',NULL,'','','','','123456'),(181,'d','',NULL,'','','','','123456'),(182,'ad','',NULL,'','','','','123456'),(183,'sa','',NULL,'','','','','123456'),(184,'dsa','',NULL,'','','','','123456'),(185,'d','',NULL,'','','','','123456'),(186,'d','',NULL,'','','','','123456'),(187,'sa','',NULL,'','','','','123456'),(188,'dsa','',NULL,'','','','','123456'),(189,'dsa','',NULL,'','','','','123456'),(190,'d','',NULL,'','','','','123456'),(191,'sa','',NULL,'','','','','123456'),(192,'sa','',NULL,'','','','','123456'),(193,'sa','',NULL,'','','','','123456'),(194,'d','',NULL,'','','','','123456'),(195,'sad','',NULL,'','','','','123456'),(196,'sa','',NULL,'','','','','123456'),(197,'dsa','',NULL,'','','','','123456'),(198,'dsa','',NULL,'','','','','123456'),(199,'d','',NULL,'','','','','123456'),(200,'sad','',NULL,'','','','','123456'),(201,'sa','',NULL,'','','','','123456'),(202,'dsa','',NULL,'','','','','123456'),(203,'d','',NULL,'','','','','123456'),(204,'ad','',NULL,'','','','','123456'),(205,'a','',NULL,'','','','','123456'),(206,'dsa','',NULL,'','','','','123456'),(207,'dsa','',NULL,'','','','','123456'),(208,'d','',NULL,'','','','','123456'),(209,'sad','',NULL,'','','','','123456'),(210,'sa','',NULL,'','','','','123456'),(211,'as','',NULL,'','','','','123456'),(212,'d','',NULL,'','','','','123456'),(213,'sa','',NULL,'','','','','123456'),(214,'dsa','',NULL,'','','','','123456'),(215,'dsa','',NULL,'','','','','123456'),(216,'d','',NULL,'','','','','123456'),(217,'sad','',NULL,'','','','','123456'),(218,'sad','',NULL,'','','','','123456'),(219,'sa','',NULL,'','','','','123456'),(220,'dsa','',NULL,'','','','','123456'),(221,'d','',NULL,'','','','','123456'),(222,'sad','',NULL,'','','','','123456'),(223,'sa','',NULL,'','','','','123456'),(224,'dsa','',NULL,'','','','','123456'),(225,'d','',NULL,'','','','','123456'),(226,'ad','',NULL,'','','','','123456'),(227,'sa','',NULL,'','','','','123456'),(228,'das','',NULL,'','','','','123456'),(229,'dsa','',NULL,'','','','','123456'),(230,'da','',NULL,'','','','','123456'),(231,'d','',NULL,'','','','','123456'),(232,'sad','',NULL,'','','','','123456'),(233,'as','',NULL,'','','','','123456'),(234,'das','',NULL,'','','','','123456'),(235,'d','',NULL,'','','','','123456'),(236,'ad','',NULL,'','','','','123456'),(237,'as','',NULL,'','','','','123456'),(238,'dsa','',NULL,'','','','','123456'),(239,'d','',NULL,'','','','','123456'),(240,'a','',NULL,'','','','','123456'),(241,'sa','',NULL,'','','','','123456'),(242,'da','',NULL,'','','','','123456'),(243,'dsadsad','',NULL,'','','','','123456'),(244,'ad','',NULL,'','','','','123456'),(245,'asd','',NULL,'','','','','123456'),(246,'d','',NULL,'','','','','123456'),(247,'sadsadsa','',NULL,'','','','','123456'),(248,'ds','',NULL,'','','','','123456'),(249,'d','',NULL,'','','','','123456'),(250,'sa','',NULL,'','','','','123456'),(251,'dsa','',NULL,'','','','','123456'),(252,'ds','',NULL,'','','','','123456'),(253,'d','',NULL,'','','','','123456'),(254,'sa','',NULL,'','','','','123456'),(255,'d','',NULL,'','','','','123456'),(256,'as','',NULL,'','','','','123456'),(257,'d','',NULL,'','','','','123456'),(258,'as','',NULL,'','','','','123456'),(259,'d','',NULL,'','','','','123456'),(260,'sa','',NULL,'','','','','123456'),(261,'d','',NULL,'','','','','123456'),(262,'sa','',NULL,'','','','','123456'),(263,'d','',NULL,'','','','','123456'),(264,'sa','',NULL,'','','','','123456'),(265,'ds','',NULL,'','','','','123456'),(266,'d','',NULL,'','','','','123456'),(267,'sa','',NULL,'','','','','123456'),(268,'d','',NULL,'','','','','123456'),(269,'sa','',NULL,'','','','','123456'),(270,'d','',NULL,'','','','','123456'),(271,'sa','',NULL,'','','','','123456'),(272,'d','',NULL,'','','','','123456'),(273,'sa','',NULL,'','','','','123456'),(274,'d','',NULL,'','','','','123456'),(275,'sad','',NULL,'','','','','123456'),(276,'sa','',NULL,'','','','','123456'),(277,'d','',NULL,'','','','','123456'),(278,'as','',NULL,'','','','','123456'),(279,'d','',NULL,'','','','','123456'),(280,'sa','',NULL,'','','','','123456'),(281,'d','',NULL,'','','','','123456'),(282,'sa','',NULL,'','','','','123456'),(283,'ds','',NULL,'','','','','123456'),(284,'ad','',NULL,'','','','','123456'),(285,'sa','',NULL,'','','','','123456'),(286,'d','',NULL,'','','','','123456'),(287,'sa','',NULL,'','','','','123456'),(288,'ds','',NULL,'','','','','123456'),(289,'ad','',NULL,'','','','','123456'),(290,'sa','',NULL,'','','','','123456'),(291,'d','',NULL,'','','','','123456'),(292,'dsa','',NULL,'','','','','123456'),(293,'d','',NULL,'','','','','123456'),(294,'sa','',NULL,'','','','','123456'),(295,'d','',NULL,'','','','','123456'),(296,'sa','',NULL,'','','','','123456'),(297,'sa','',NULL,'','','','','123456'),(298,'d','',NULL,'','','','','123456'),(299,'sa','',NULL,'','','','','123456'),(300,'d','',NULL,'','','','','123456'),(301,'sa','',NULL,'','','','','123456'),(302,'d','',NULL,'','','','','123456'),(303,'as','',NULL,'','','','','123456'),(304,'d','',NULL,'','','','','123456'),(305,'sa','',NULL,'','','','','123456'),(306,'d','',NULL,'','','','','123456'),(307,'ad','',NULL,'','','','','123456'),(308,'as','',NULL,'','','','','123456'),(309,'d','',NULL,'','','','','123456'),(310,'s','',NULL,'','','','','123456'),(311,'sa','',NULL,'','','','','123456'),(312,'d','',NULL,'','','','','123456'),(313,'dsa','',NULL,'','','','','123456'),(314,'d','',NULL,'','','','','123456'),(315,'sa','',NULL,'','','','','123456'),(316,'sa','',NULL,'','','','','123456'),(317,'d','',NULL,'','','','','123456'),(318,'sad','',NULL,'','','','','123456'),(319,'as','',NULL,'','','','','123456'),(320,'d','',NULL,'','','','','123456'),(321,'asd','',NULL,'','','','','123456'),(322,'sa','',NULL,'','','','','123456'),(323,'dsa','',NULL,'','','','','123456'),(324,'d','',NULL,'','','','','123456'),(325,'sa','',NULL,'','','','','123456'),(326,'as','',NULL,'','','','','123456'),(327,'d','',NULL,'','','','','123456'),(328,'as','',NULL,'','','','','123456'),(329,'d','',NULL,'','','','','123456'),(330,'sa','',NULL,'','','','','123456'),(331,'dsa','',NULL,'','','','','123456'),(332,'d','',NULL,'','','','','123456'),(333,'sa','',NULL,'','','','','123456'),(334,'d','',NULL,'','','','','123456'),(335,'as','',NULL,'','','','','123456'),(336,'d','',NULL,'','','','','123456'),(337,'sa','',NULL,'','','','','123456'),(338,'d','',NULL,'','','','','123456'),(339,'ad','',NULL,'','','','','123456'),(340,'sa','',NULL,'','','','','123456'),(341,'d','',NULL,'','','','','123456'),(342,'sa','',NULL,'','','','','123456'),(343,'sadsa','',NULL,'','','','','123456'),(344,'sa','',NULL,'','','','','123456'),(345,'sa','',NULL,'','','','','123456'),(346,'dsa','',NULL,'','','','','123456'),(347,'dsa','',NULL,'','','','','123456'),(348,'ds','',NULL,'','','','','123456'),(349,'d','',NULL,'','','','','123456'),(350,'sad','',NULL,'','','','','123456'),(351,'sa','',NULL,'','','','','123456'),(352,'d','',NULL,'','','','','123456'),(353,'sa','',NULL,'','','','','123456'),(354,'sa','',NULL,'','','','','123456'),(355,'d','',NULL,'','','','','123456'),(356,'sa','',NULL,'','','','','123456'),(357,'d','',NULL,'','','','','123456'),(358,'sa','',NULL,'','','','','123456'),(359,'d','',NULL,'','','','','123456'),(360,'dsa','',NULL,'','','','','123456'),(361,'d','',NULL,'','','','','123456'),(362,'sa','',NULL,'','','','','123456'),(363,'d','',NULL,'','','','','123456'),(364,'sad','',NULL,'','','','','123456'),(365,'sa','',NULL,'','','','','123456'),(366,'dsa','',NULL,'','','','','123456'),(367,'sdaa','',NULL,'','','','','123456'),(368,'d','',NULL,'','','','','123456'),(369,'ad','',NULL,'','','','','123456'),(370,'sa','',NULL,'','','','','123456'),(371,'d','',NULL,'','','','','123456'),(372,'asd','',NULL,'','','','','123456'),(373,'sa','',NULL,'','','','','123456'),(374,'sa','',NULL,'','','','','123456'),(375,'d','',NULL,'','','','','123456'),(376,'sa','',NULL,'','','','','123456'),(377,'dsa','',NULL,'','','','','123456'),(378,'d','',NULL,'','','','','123456'),(379,'sa','',NULL,'','','','','123456'),(380,'dsa','',NULL,'','','','','123456'),(381,'d','',NULL,'','','','','123456'),(382,'sad','',NULL,'','','','','123456'),(383,'sa','',NULL,'','','','','123456'),(384,'d','',NULL,'','','','','123456'),(385,'sa','',NULL,'','','','','123456'),(386,'as','',NULL,'','','','','123456'),(387,'d','',NULL,'','','','','123456'),(388,'as','',NULL,'','','','','123456'),(389,'d','',NULL,'','','','','123456'),(390,'asd','',NULL,'','','','','123456'),(391,'as','',NULL,'','','','','123456'),(392,'d','',NULL,'','','','','123456'),(393,'as','',NULL,'','','','','123456'),(394,'das','',NULL,'','','','','123456'),(395,'d','',NULL,'','','','','123456'),(396,'sa','',NULL,'','','','','123456'),(397,'as','',NULL,'','','','','123456'),(398,'d','',NULL,'','','','','123456'),(399,'sa','',NULL,'','','','','123456'),(400,'d','',NULL,'','','','','123456'),(401,'sa','',NULL,'','','','','123456'),(402,'as','',NULL,'','','','','123456'),(403,'as','',NULL,'','','','','123456'),(404,'d','',NULL,'','','','','123456'),(405,'as','',NULL,'','','','','123456'),(406,'da','',NULL,'','','','','123456'),(407,'d','',NULL,'','','','','123456'),(408,'as','',NULL,'','','','','123456'),(409,'ds','',NULL,'','','','','123456'),(410,'ad','',NULL,'','','','','123456'),(411,'sa','',NULL,'','','','','123456'),(412,'dsa','',NULL,'','','','','123456'),(413,'d','',NULL,'','','','','123456'),(414,'sad','',NULL,'','','','','123456'),(415,'sa','',NULL,'','','','','123456'),(416,'d','',NULL,'','','','','123456'),(417,'sa','',NULL,'','','','','123456'),(418,'sa','',NULL,'','','','','123456'),(419,'d','',NULL,'','','','','123456'),(420,'a','',NULL,'','','','','123456'),(421,'sa','',NULL,'','','','','123456'),(422,'d','',NULL,'','','','','123456'),(423,'sa','',NULL,'','','','','123456'),(424,'d','',NULL,'','','','','123456'),(425,'sad','',NULL,'','','','','123456'),(426,'as','',NULL,'','','','','123456'),(427,'d','',NULL,'','','','','123456'),(428,'as','',NULL,'','','','','123456'),(429,'dsa','',NULL,'','','','','123456'),(430,'d','',NULL,'','','','','123456'),(431,'sa','',NULL,'','','','','123456'),(432,'sa','',NULL,'','','','','123456'),(433,'d','',NULL,'','','','','123456'),(434,'dsa','',NULL,'','','','','123456'),(435,'d','',NULL,'','','','','123456'),(436,'sa','',NULL,'','','','','123456'),(437,'d','',NULL,'','','','','123456'),(438,'d','',NULL,'','','','','123456'),(439,'sa','',NULL,'','','','','123456'),(440,'d','',NULL,'','','','','123456'),(441,'sa','',NULL,'','','','','123456'),(442,'da','',NULL,'','','','','123456'),(443,'sd','',NULL,'','','','','123456'),(444,'a','',NULL,'','','','','123456'),(445,'ds','',NULL,'','','','','123456'),(446,'d','',NULL,'','','','','123456'),(447,'sa','',NULL,'','','','','123456'),(448,'d','',NULL,'','','','','123456'),(449,'sa','',NULL,'','','','','123456'),(450,'dsa','',NULL,'','','','','123456'),(451,'d','',NULL,'','','','','123456'),(452,'sa','',NULL,'','','','','123456'),(453,'dsa','',NULL,'','','','','123456'),(454,'d','',NULL,'','','','','123456'),(455,'sa','',NULL,'','','','','123456'),(456,'dsa','',NULL,'','','','','123456'),(457,'d','',NULL,'','','','','123456'),(458,'sa','',NULL,'','','','','123456'),(459,'ds','',NULL,'','','','','123456'),(460,'d','',NULL,'','','','','123456'),(461,'sa','',NULL,'','','','','123456'),(462,'da','',NULL,'','','','','123456'),(463,'d','',NULL,'','','','','123456'),(464,'sa','',NULL,'','','','','123456'),(465,'dsa','',NULL,'','','','','123456'),(466,'d','',NULL,'','','','','123456'),(467,'sad','',NULL,'','','','','123456'),(468,'sa','',NULL,'','','','','123456'),(469,'sa','',NULL,'','','','','123456'),(470,'dsa','',NULL,'','','','','123456'),(471,'d','',NULL,'','','','','123456'),(472,'sad','',NULL,'','','','','123456'),(473,'sa','',NULL,'','','','','123456'),(474,'das','',NULL,'','','','','123456'),(475,'d','',NULL,'','','','','123456'),(476,'d','',NULL,'','','','','123456'),(477,'sad','',NULL,'','','','','123456'),(478,'sad','',NULL,'','','','','123456'),(479,'a','',NULL,'','','','','123456'),(480,'dsa','',NULL,'','','','','123456'),(481,'sa','',NULL,'','','','','123456'),(482,'d','',NULL,'','','','','123456'),(483,'d','',NULL,'','','','','123456'),(484,'sa','',NULL,'','','','','123456'),(485,'das','',NULL,'','','','','123456'),(486,'dsad','',NULL,'','','','','123456'),(487,'sa','',NULL,'','','','','123456'),(488,'dsa','',NULL,'','','','','123456'),(489,'ds','',NULL,'','','','','123456'),(490,'ad','',NULL,'','','','','123456'),(491,'sa','',NULL,'','','','','123456'),(492,'dsa','',NULL,'','','','','123456'),(493,'da','',NULL,'','','','','123456'),(494,'d','',NULL,'','','','','123456'),(495,'as','',NULL,'','','','','123456'),(496,'sa','',NULL,'','','','','123456'),(497,'d','',NULL,'','','','','123456'),(498,'as','',NULL,'','','','','123456'),(499,'ddsa','',NULL,'','','','','123456'),(500,'d','',NULL,'','','','','123456'),(501,'sad','',NULL,'','','','','123456'),(502,'sa','',NULL,'','','','','123456'),(503,'d','',NULL,'','','','','123456'),(504,'sa','',NULL,'','','','','123456'),(505,'d','',NULL,'','','','','123456'),(506,'sa','',NULL,'','','','','123456'),(507,'sa','',NULL,'','','','','123456'),(508,'d','',NULL,'','','','','123456'),(509,'sad','',NULL,'','','','','123456'),(510,'as','',NULL,'','','','','123456'),(511,'dsa','',NULL,'','','','','123456'),(512,'d','',NULL,'','','','','123456'),(513,'sad','',NULL,'','','','','123456'),(514,'sa','',NULL,'','','','','123456'),(515,'dsa','',NULL,'','','','','123456'),(516,'d','',NULL,'','','','','123456'),(517,'as','',NULL,'','','','','123456'),(518,'dsa','',NULL,'','','','','123456'),(519,'d','',NULL,'','','','','123456'),(520,'asd','',NULL,'','','','','123456'),(521,'sa','',NULL,'','','','','123456'),(522,'d','',NULL,'','','','','123456'),(523,'sad','',NULL,'','','','','123456'),(524,'as','',NULL,'','','','','123456'),(525,'d','',NULL,'','','','','123456'),(526,'sad','',NULL,'','','','','123456'),(527,'sa','',NULL,'','','','','123456'),(528,'d','',NULL,'','','','','123456'),(529,'d','',NULL,'','','','','123456'),(530,'sa','',NULL,'','','','','123456'),(531,'sa','',NULL,'','','','','123456'),(532,'dsa','',NULL,'','','','','123456'),(533,'d','',NULL,'','','','','123456'),(534,'sad','',NULL,'','','','','123456'),(535,'as','',NULL,'','','','','123456'),(536,'das','',NULL,'','','','','123456'),(537,'d','',NULL,'','','','','123456'),(538,'sad','',NULL,'','','','','123456'),(539,'sa','',NULL,'','','','','123456'),(540,'das','',NULL,'','','','','123456'),(541,'d','',NULL,'','','','','123456'),(542,'asd','',NULL,'','','','','123456'),(543,'as','',NULL,'','','','','123456'),(544,'das','',NULL,'','','','','123456'),(545,'d','',NULL,'','','','','123456'),(546,'d','',NULL,'','','','','123456'),(547,'asd','',NULL,'','','','','123456'),(548,'sa','',NULL,'','','','','123456'),(549,'d','',NULL,'','','','','123456'),(550,'d','',NULL,'','','','','123456'),(551,'sa','',NULL,'','','','','123456'),(552,'d','',NULL,'','','','','123456'),(553,'sad','',NULL,'','','','','123456'),(554,'sa','',NULL,'','','','','123456'),(555,'das','',NULL,'','','','','123456'),(556,'d','',NULL,'','','','','123456'),(557,'sad','',NULL,'','','','','123456'),(558,'sa','',NULL,'','','','','123456'),(559,'dsa','',NULL,'','','','','123456'),(560,'d','',NULL,'','','','','123456'),(561,'sa','',NULL,'','','','','123456'),(562,'das','',NULL,'','','','','123456'),(563,'d','',NULL,'','','','','123456'),(564,'as','',NULL,'','','','','123456'),(565,'sa','',NULL,'','','','','123456'),(566,'d','',NULL,'','','','','123456'),(567,'d','',NULL,'','','','','123456'),(568,'a','',NULL,'','','','','123456'),(569,'ds','',NULL,'','','','','123456'),(570,'a','',NULL,'','','','','123456'),(571,'dsa','',NULL,'','','','','123456'),(572,'dsa','',NULL,'','','','','123456'),(573,'dsa','',NULL,'','','','','123456'),(574,'d','',NULL,'','','','','123456'),(575,'a','',NULL,'','','','','123456'),(576,'dsa','',NULL,'','','','','123456'),(577,'dsa','',NULL,'','','','','123456'),(578,'d','',NULL,'','','','','123456'),(579,'sa','',NULL,'','','','','123456'),(580,'dsa','',NULL,'','','','','123456'),(581,'d','',NULL,'','','','','123456'),(582,'as','',NULL,'','','','','123456'),(583,'sa','',NULL,'','','','','123456'),(584,'d','',NULL,'','','','','123456'),(585,'sa','',NULL,'','','','','123456'),(586,'das','',NULL,'','','','','123456'),(587,'d','',NULL,'','','','','123456'),(588,'sa','',NULL,'','','','','123456'),(589,'ds','',NULL,'','','','','123456'),(590,'d','',NULL,'','','','','123456'),(591,'sa','',NULL,'','','','','123456'),(592,'d','',NULL,'','','','','123456'),(593,'sa','',NULL,'','','','','123456'),(594,'d','',NULL,'','','','','123456'),(595,'d','',NULL,'','','','','123456'),(596,'as','',NULL,'','','','','123456'),(597,'d','',NULL,'','','','','123456'),(598,'sad','',NULL,'','','','','123456'),(599,'as','',NULL,'','','','','123456'),(600,'d','',NULL,'','','','','123456'),(601,'as','',NULL,'','','','','123456'),(602,'d','',NULL,'','','','','123456'),(603,'s','',NULL,'','','','','123456'),(604,'as','',NULL,'','','','','123456'),(605,'d','',NULL,'','','','','123456'),(606,'d','',NULL,'','','','','123456'),(607,'as','',NULL,'','','','','123456'),(608,'d','',NULL,'','','','','123456'),(609,'asd','',NULL,'','','','','123456'),(610,'as','',NULL,'','','','','123456'),(611,'d','',NULL,'','','','','123456'),(612,'d','',NULL,'','','','','123456'),(613,'as','',NULL,'','','','','123456'),(614,'dsa','',NULL,'','','','','123456'),(615,'d','',NULL,'','','','','123456'),(616,'sa','',NULL,'','','','','123456'),(617,'dsa','',NULL,'','','','','123456'),(618,'d','',NULL,'','','','','123456'),(619,'sa','',NULL,'','','','','123456'),(620,'as','',NULL,'','','','','123456'),(621,'d','',NULL,'','','','','123456'),(622,'sa','',NULL,'','','','','123456'),(623,'dsa','',NULL,'','','','','123456'),(624,'dsa','',NULL,'','','','','123456'),(625,'d','',NULL,'','','','','123456'),(626,'as','',NULL,'','','','','123456'),(627,'dsa','',NULL,'','','','','123456'),(628,'d','',NULL,'','','','','123456'),(629,'sa','',NULL,'','','','','123456'),(630,'ds','',NULL,'','','','','123456'),(631,'d','',NULL,'','','','','123456'),(632,'sa','',NULL,'','','','','123456'),(633,'dsa','',NULL,'','','','','123456'),(634,'ds','',NULL,'','','','','123456'),(635,'ds','',NULL,'','','','','123456'),(636,'a','',NULL,'','','','','123456'),(637,'dsa','',NULL,'','','','','123456'),(638,'d','',NULL,'','','','','123456'),(639,'asd','',NULL,'','','','','123456'),(640,'as','',NULL,'','','','','123456'),(641,'d','',NULL,'','','','','123456'),(642,'sa','',NULL,'','','','','123456'),(643,'d','',NULL,'','','','','123456'),(644,'ad','',NULL,'','','','','123456'),(645,'as','',NULL,'','','','','123456'),(646,'dsa','',NULL,'','','','','123456'),(647,'d','',NULL,'','','','','123456'),(648,'as','',NULL,'','','','','123456'),(649,'da','',NULL,'','','','','123456'),(650,'sd','',NULL,'','','','','123456'),(651,'as','',NULL,'','','','','123456'),(652,'sa','',NULL,'','','','','123456'),(653,'d','',NULL,'','','','','123456'),(654,'a','',NULL,'','','','','123456'),(655,'dsa','',NULL,'','','','','123456'),(656,'dsa','',NULL,'','','','','123456'),(657,'d','',NULL,'','','','','123456'),(658,'sa','',NULL,'','','','','123456'),(659,'dsa','',NULL,'','','','','123456'),(660,'d','',NULL,'','','','','123456'),(661,'sad','',NULL,'','','','','123456'),(662,'sa','',NULL,'','','','','123456'),(663,'das','',NULL,'','','','','123456'),(664,'d','',NULL,'','','','','123456'),(665,'d','',NULL,'','','','','123456'),(666,'as','',NULL,'','','','','123456'),(667,'d','',NULL,'','','','','123456'),(668,'d','',NULL,'','','','','123456'),(669,'sa','',NULL,'','','','','123456'),(670,'das','',NULL,'','','','','123456'),(671,'d','',NULL,'','','','','123456'),(672,'sa','',NULL,'','','','','123456'),(673,'ad','',NULL,'','','','','123456'),(674,'sad','',NULL,'','','','','123456'),(675,'sa','',NULL,'','','','','123456'),(676,'dss','',NULL,'','','','','123456'),(677,'a','',NULL,'','','','','123456'),(678,'ds','',NULL,'','','','','123456'),(679,'sda','',NULL,'','','','','123456'),(680,'sda','',NULL,'','','','','123456'),(681,'sda','',NULL,'','','','','123456'),(682,'dsa','',NULL,'','','','','123456'),(683,'dsa','',NULL,'','','','','123456'),(684,'ds','',NULL,'','','','','123456'),(685,'fg','',NULL,'','','','','123456'),(686,'sdg','',NULL,'','','','','123456'),(687,'df','',NULL,'','','','','123456'),(688,'g','',NULL,'','','','','123456'),(689,'fd','',NULL,'','','','','123456'),(690,'g','',NULL,'','','','','123456'),(691,'fd','',NULL,'','','','','123456'),(692,'gd','',NULL,'','','','','123456'),(693,'g','',NULL,'','','','','123456'),(694,'sfds','',NULL,'','','','','123456'),(695,'fg','',NULL,'','','','','123456'),(696,'d','',NULL,'','','','','123456'),(697,'gs','',NULL,'','','','','123456'),(698,'f','',NULL,'','','','','123456'),(699,'ds','',NULL,'','','','','123456'),(700,'f','',NULL,'','','','','123456'),(701,'df','',NULL,'','','','','123456'),(702,'s','',NULL,'','','','','123456'),(703,'f','',NULL,'','','','','123456'),(704,'sdf','',NULL,'','','','','123456'),(705,'s','',NULL,'','','','','123456'),(706,'fd','',NULL,'','','','','123456'),(707,'sf','',NULL,'','','','','123456'),(708,'ds','',NULL,'','','','','123456'),(709,'fsd','',NULL,'','','','','123456'),(710,'f','',NULL,'','','','','123456'),(711,'ds','',NULL,'','','','','123456'),(712,'ds','',NULL,'','','','','123456'),(713,'f','',NULL,'','','','','123456'),(714,'sd','',NULL,'','','','','123456'),(715,'f','',NULL,'','','','','123456'),(716,'sd','',NULL,'','','','','123456'),(717,'f','',NULL,'','','','','123456'),(718,'sd','',NULL,'','','','','123456'),(719,'f','',NULL,'','','','','123456'),(720,'sdf','',NULL,'','','','','123456'),(721,'sd','',NULL,'','','','','123456'),(722,'f','',NULL,'','','','','123456'),(723,'sdf','',NULL,'','','','','123456'),(724,'ds','',NULL,'','','','','123456'),(725,'fd','',NULL,'','','','','123456'),(726,'f','',NULL,'','','','','123456'),(727,'ds','',NULL,'','','','','123456'),(728,'fsd','',NULL,'','','','','123456'),(729,'f','',NULL,'','','','','123456'),(730,'dsf','',NULL,'','','','','123456'),(731,'ds','',NULL,'','','','','123456'),(732,'f','',NULL,'','','','','123456'),(733,'f','',NULL,'','','','','123456'),(734,'ds','',NULL,'','','','','123456'),(735,'fsd','',NULL,'','','','','123456'),(736,'f','',NULL,'','','','','123456'),(737,'sd','',NULL,'','','','','123456'),(738,'sd','',NULL,'','','','','123456'),(739,'f','',NULL,'','','','','123456'),(740,'sd','',NULL,'','','','','123456'),(741,'f','',NULL,'','','','','123456'),(742,'dsf','',NULL,'','','','','123456'),(743,'dsf','',NULL,'','','','','123456'),(744,'ds','',NULL,'','','','','123456'),(745,'fds','',NULL,'','','','','123456'),(746,'f','',NULL,'','','','','123456'),(747,'s','',NULL,'','','','','123456'),(748,'fsd','',NULL,'','','','','123456'),(749,'f','',NULL,'','','','','123456'),(750,'sf','',NULL,'','','','','123456'),(751,'ds','',NULL,'','','','','123456'),(752,'fsd','',NULL,'','','','','123456'),(753,'f','',NULL,'','','','','123456'),(754,'sf','',NULL,'','','','','123456');

/*Table structure for table `studentjoincompetition` */

DROP TABLE IF EXISTS `studentjoincompetition`;

CREATE TABLE `studentjoincompetition` (
  `sid` int(10) unsigned NOT NULL COMMENT '学生主键',
  `cid` int(10) unsigned NOT NULL COMMENT '主键',
  `tid` int(10) unsigned NOT NULL COMMENT '主键',
  `stu1` varchar(15) DEFAULT NULL,
  `stu2` varchar(15) DEFAULT NULL,
  `stu3` varchar(15) DEFAULT NULL,
  `stu4` varchar(15) DEFAULT NULL,
  `stu5` varchar(15) DEFAULT NULL,
  `stu6` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`sid`,`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `studentjoincompetition` */

insert  into `studentjoincompetition`(`sid`,`cid`,`tid`,`stu1`,`stu2`,`stu3`,`stu4`,`stu5`,`stu6`) values (1,2,3,'4','5','6','7','8','9'),(38,1,6,NULL,NULL,NULL,NULL,NULL,NULL),(38,2,2,'000000','000000','000000','000000','000000','000000'),(38,3,2,'000000','000000','000000','000000','000000','000000'),(38,6,2,'000000','000000','000000','000000','000000','000000');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tname` varchar(50) NOT NULL COMMENT '教师姓名',
  `tnumber` varchar(20) NOT NULL COMMENT '教工号',
  `professional` varchar(20) NOT NULL COMMENT '职称',
  `password` varchar(50) NOT NULL DEFAULT '123456' COMMENT '密码',
  `card` varchar(25) NOT NULL COMMENT '银行卡号',
  `email` varchar(50) NOT NULL COMMENT '邮箱',
  `role` int(11) NOT NULL COMMENT '权限角色',
  `academy` varchar(50) NOT NULL COMMENT '所属学院',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=114 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`tid`,`tname`,`tnumber`,`professional`,`password`,`card`,`email`,`role`,`academy`,`age`,`phone`) values (2,'sdf','fsdf','dsfdsfsd','123456','fdsf','dsfds',0,'dsfdsf',0,'fds'),(3,'fds','sdfds','dsf','d','fdsf','ds',0,'fds',0,'sfd'),(4,'f','dsfdsf','dsf','123456','dsf','fds',0,'dsf',0,'fds'),(5,'fdsdsf','dsfdsf','fdsf','123456','fsd','fds',0,'dsf',0,'sdf'),(6,'王嘉琪','20153333','软件工程','123456','362321199609157810','1016484945@qq.com',2,'计算机科学与工程学院',21,'18795207136'),(7,'dsada','','','123456','','',0,'',NULL,NULL),(8,'sadsa','','','123456','','',0,'',NULL,NULL),(9,'dsa','','','123456','','',0,'',NULL,NULL),(10,'das','','','123456','','',0,'',NULL,NULL),(11,'d','','','123456','','',0,'',NULL,NULL),(12,'as','','','123456','','',0,'',NULL,NULL),(13,'d','','','123456','','',0,'',NULL,NULL),(14,'as','','','123456','','',0,'',NULL,NULL),(15,'d','','','123456','','',0,'',NULL,NULL),(16,'sa','','','123456','','',0,'',NULL,NULL),(17,'sa','','','123456','','',0,'',NULL,NULL),(18,'d','','','123456','','',0,'',NULL,NULL),(19,'sad','','','123456','','',0,'',NULL,NULL),(20,'sa','','','123456','','',0,'',NULL,NULL),(21,'d','','','123456','','',0,'',NULL,NULL),(22,'sa','','','123456','','',0,'',NULL,NULL),(23,'d','','','123456','','',0,'',NULL,NULL),(24,'sad','','','123456','','',0,'',NULL,NULL),(25,'sa','','','123456','','',0,'',NULL,NULL),(26,'das','','','123456','','',0,'',NULL,NULL),(27,'d','','','123456','','',0,'',NULL,NULL),(28,'as','','','123456','','',0,'',NULL,NULL),(29,'sad','','','123456','','',0,'',NULL,NULL),(30,'as','','','123456','','',0,'',NULL,NULL),(31,'d','','','123456','','',0,'',NULL,NULL),(32,'d','','','123456','','',0,'',NULL,NULL),(33,'sa','','','123456','','',0,'',NULL,NULL),(34,'d','','','123456','','',0,'',NULL,NULL),(35,'sad','','','123456','','',0,'',NULL,NULL),(36,'as','','','123456','','',0,'',NULL,NULL),(37,'d','','','123456','','',0,'',NULL,NULL),(38,'asfsd','','','123456','','',0,'',NULL,NULL),(39,'f','','','123456','','',0,'',NULL,NULL),(40,'f','','','123456','','',0,'',NULL,NULL),(41,'ds','','','123456','','',0,'',NULL,NULL),(42,'fd','','','123456','','',0,'',NULL,NULL),(43,'f','','','123456','','',0,'',NULL,NULL),(44,'ds','','','123456','','',0,'',NULL,NULL),(45,'fd','','','123456','','',0,'',NULL,NULL),(46,'sf','','','123456','','',0,'',NULL,NULL),(47,'ds','','','123456','','',0,'',NULL,NULL),(48,'fd','','','123456','','',0,'',NULL,NULL),(49,'f','','','123456','','',0,'',NULL,NULL),(50,'ds','','','123456','','',0,'',NULL,NULL),(51,'f','','','123456','','',0,'',NULL,NULL),(52,'sf','','','123456','','',0,'',NULL,NULL),(53,'s','','','123456','','',0,'',NULL,NULL),(54,'f','','','123456','','',0,'',NULL,NULL),(55,'sdf','','','123456','','',0,'',NULL,NULL),(56,'sd','','','123456','','',0,'',NULL,NULL),(57,'f','','','123456','','',0,'',NULL,NULL),(58,'sd','','','123456','','',0,'',NULL,NULL),(59,'fsd','','','123456','','',0,'',NULL,NULL),(60,'f','','','123456','','',0,'',NULL,NULL),(61,'sd','','','123456','','',0,'',NULL,NULL),(62,'sd','','','123456','','',0,'',NULL,NULL),(63,'f','','','123456','','',0,'',NULL,NULL),(64,'sdf','','','123456','','',0,'',NULL,NULL),(65,'ds','','','123456','','',0,'',NULL,NULL),(66,'f','','','123456','','',0,'',NULL,NULL),(67,'d','','','123456','','',0,'',NULL,NULL),(68,'f','','','123456','','',0,'',NULL,NULL),(69,'dsf','','','123456','','',0,'',NULL,NULL),(70,'ds','','','123456','','',0,'',NULL,NULL),(71,'f','','','123456','','',0,'',NULL,NULL),(72,'sd','','','123456','','',0,'',NULL,NULL),(73,'fsd','','','123456','','',0,'',NULL,NULL),(74,'f','','','123456','','',0,'',NULL,NULL),(75,'dsf','','','123456','','',0,'',NULL,NULL),(76,'ds','','','123456','','',0,'',NULL,NULL),(77,'fdsfdsfdsfdsf','','','123456','','',0,'',NULL,NULL),(78,'sdf','','','123456','','',0,'',NULL,NULL),(79,'ds','','','123456','','',0,'',NULL,NULL),(80,'fds','','','123456','','',0,'',NULL,NULL),(81,'fds','','','123456','','',0,'',NULL,NULL),(82,'f','','','123456','','',0,'',NULL,NULL),(83,'sdf','','','123456','','',0,'',NULL,NULL),(84,'sdf','','','123456','','',0,'',NULL,NULL),(85,'ds','','','123456','','',0,'',NULL,NULL),(86,'fds','','','123456','','',0,'',NULL,NULL),(87,'f','','','123456','','',0,'',NULL,NULL),(88,'df','','','123456','','',0,'',NULL,NULL),(89,'sd','','','123456','','',0,'',NULL,NULL),(90,'fds','','','123456','','',0,'',NULL,NULL),(91,'fds','','','123456','','',0,'',NULL,NULL),(92,'fds','','','123456','','',0,'',NULL,NULL),(93,'f','','','123456','','',0,'',NULL,NULL),(94,'ds','','','123456','','',0,'',NULL,NULL),(95,'fds','','','123456','','',0,'',NULL,NULL),(96,'f','','','123456','','',0,'',NULL,NULL),(97,'sd','','','123456','','',0,'',NULL,NULL),(98,'ds','','','123456','','',0,'',NULL,NULL),(99,'f','','','123456','','',0,'',NULL,NULL),(100,'ds','','','123456','','',0,'',NULL,NULL),(101,'f','','','123456','','',0,'',NULL,NULL),(102,'f','','','123456','','',0,'',NULL,NULL),(103,'ds','','','123456','','',0,'',NULL,NULL),(104,'dsf','','','123456','','',0,'',NULL,NULL),(105,'ds','','','123456','','',0,'',NULL,NULL),(106,'f','','','123456','','',0,'',NULL,NULL),(107,'ds','','','123456','','',0,'',NULL,NULL),(108,'dsf','','','123456','','',0,'',NULL,NULL),(109,'fds','','','123456','','',0,'',NULL,NULL),(110,'f','','','123456','','',0,'',NULL,NULL),(111,'sd','','','123456','','',0,'',NULL,NULL),(112,'sdfs','','','123456','','',0,'',NULL,NULL),(113,'ffsdf','','','123456','','',0,'',NULL,NULL);

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `tmid` int(11) NOT NULL AUTO_INCREMENT,
  `teamname` varchar(255) DEFAULT NULL,
  `s1` int(11) DEFAULT NULL,
  `s2` int(11) DEFAULT NULL,
  `s3` int(11) DEFAULT NULL,
  `s4` int(11) DEFAULT NULL,
  `s5` int(11) DEFAULT NULL,
  PRIMARY KEY (`tmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `team` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
