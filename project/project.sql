/*
SQLyog v10.2 
MySQL - 5.5.29 : Database - project
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`project` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `project`;

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

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `year` int(11) DEFAULT NULL,
  `mouth` int(11) DEFAULT NULL,
  `day` int(11) DEFAULT NULL,
  `dat` varchar(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `context` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `notice` */

insert  into `notice`(`id`,`year`,`mouth`,`day`,`dat`,`title`,`context`) values (1,2017,8,4,'2017-08-04','老铁稳','BUG1：如果1开始鼠标往上滚，会出现圆圈内年份乱跳，并且会导致时间轴会出现空白的情况。 解决方法，删除html文件里面的第一个li标签。整个删掉即可 BUG2：圆圈内年份是因为件是通过CSS控制的图片取的数字,CSS里面有初始化数值，但是JS里面没有初始化数据，所以导致了圆圈内的时间无论怎么设置，开始都是2013年。在history.js中添加1个初始化函数就OK了。 在第60行左右，$(function(){})里面加个初始化函数初始化下即可。代码如下'),(2,2017,8,4,'2017-08-04','老司机我很','啊速度撒大时代阿迪王热；林凤娇第十六届反垄断法杰拉德时间发咯假发票文哦富婆文件分配；哦警方撒酒疯洛杉矶龙卷风排污费收到了发和的了四里第三方活动送批发网强迫劫贫济富破手机 '),(3,2016,8,5,'2016-08-09','熊大皮','小擦分考；多久啊经济上的了就了就回家ihdlwh哦厉害我亲和力前后零花钱刘伟强回来万泉河七里河物理合路器和<h1>熊大皮</h1>'),(4,2017,8,25,'2017-08-25',NULL,'<h1 style=\"text-align:center;\">\r\n	<strong>你们这些傻叼</strong>\r\n</h1>\r\n<p>\r\n	<strong>mmp你们这群智障</strong>\r\n</p>'),(5,2017,8,31,'2017-08-31','煞笔们','智障的一群二b'),(6,2017,8,15,'2017-08-15','ert','er ewt &nbsp;nimmp'),(7,2017,8,5,'2017-08-05','老哥稳，我打野','<h1 style=\"text-align:center;\">\r\n	<strong>老哥稳，我打野</strong>\r\n</h1>\r\n<p>\r\n	<b>撒的撒地区我怕服务恐怕人品我确认为武器额企鹅完全[俄武器恶趣味我去ieewqijewjq金额完全金额为全片就饿泡温泉金额盼望奇迹陪我剧情片额界外球配件网球拍金额完全噢批就完全破ijewqjjje交流群我就噢篮球架额进去喷雾剂企鹅排球我就拍外景恶评我iqepwqpwjqp完全</b>\r\n</p>'),(8,2017,8,31,'2017-08-31','重要通知','到目前为止 &nbsp; 还没有上交材料的 &nbsp;于 9 月1 日上交所有 &nbsp;要求 的材料');

/*Table structure for table `parentmeun` */

DROP TABLE IF EXISTS `parentmeun`;

CREATE TABLE `parentmeun` (
  `pid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '父菜单id',
  `role` int(11) NOT NULL COMMENT '哪个角色拥有它',
  `pmeunname` varchar(50) NOT NULL COMMENT '菜单名称',
  `pmorder` int(11) NOT NULL COMMENT '顺序',
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pmorder` (`pmorder`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `parentmeun` */

insert  into `parentmeun`(`pid`,`role`,`pmeunname`,`pmorder`) values (1,1,'基本设置',1),(2,1,'我的项目',2),(3,1,'项目须知',4),(5,1,'阶段评审',3),(6,2,'基本设置',21),(7,2,'指导项目',22),(8,2,'阶段评审',23),(11,3,'信息维护',31),(12,3,'项目管理',32),(13,3,'阶段评审',33),(14,3,'通知消息',34),(16,4,'信息维护',36),(17,4,'校级项目管理',37),(18,4,'团队项目管理',38),(19,4,'校级项目评审',50),(20,4,'国家级项目管理',43),(21,4,'区级项目管理',42),(22,4,'发布通知',62),(23,4,'数据中心',63),(24,4,'撤项管理',60),(25,4,'变更管理',61),(26,4,'团队项目评审',55),(27,4,'区级项目评审',56),(28,4,'国家级项目评审',57);

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键\n',
  `sid` int(11) NOT NULL,
  `tid` int(11) NOT NULL,
  `theyear` int(11) DEFAULT NULL COMMENT '年份',
  `pname` varchar(255) DEFAULT NULL,
  `ptype` char(1) DEFAULT NULL COMMENT '项目类型',
  `prank` char(1) DEFAULT NULL COMMENT '项目等级',
  `begintime` varchar(20) DEFAULT NULL,
  `endtime` varchar(20) DEFAULT NULL COMMENT '结束时间',
  `technology` varchar(255) DEFAULT NULL COMMENT '技术领域',
  `officecost` double DEFAULT NULL COMMENT '办公费用',
  `officemark` varchar(255) DEFAULT NULL COMMENT '办公费用的说明',
  `materialcost` double DEFAULT NULL COMMENT '材料',
  `materialmark` varchar(255) DEFAULT NULL COMMENT '耗材说明',
  `bookcost` double DEFAULT NULL COMMENT '书籍资料费用',
  `bookmark` varchar(255) DEFAULT NULL COMMENT '书籍资料费说明',
  `postcost` double DEFAULT NULL COMMENT '邮费',
  `postmark` varchar(255) DEFAULT NULL COMMENT '邮费说明',
  `phonecost` double DEFAULT NULL COMMENT '电话费',
  `phonemark` varchar(255) DEFAULT NULL COMMENT '电话费说明',
  `transportationcost` double DEFAULT NULL COMMENT '交通费',
  `transportationmark` varchar(255) DEFAULT NULL COMMENT '交通费说明',
  `maintaincost` double DEFAULT NULL COMMENT '维修费用',
  `maintainmark` varchar(255) DEFAULT NULL COMMENT '维修说明',
  `printcost` double DEFAULT NULL COMMENT '打印费\n',
  `printmark` varchar(255) DEFAULT NULL COMMENT '印刷费说明\n',
  `pintroduction` text COMMENT '项目简介',
  `pbackground` text COMMENT '项目背景',
  `pcontent` text COMMENT '项目研究内容',
  `pscheme` text COMMENT '项目实施方案',
  `pcondition` text COMMENT '具备的条件(申请理由)',
  `ptarget` text COMMENT '项目的总目标(预期成果)',
  `pprogress` text COMMENT '项目进度',
  `isteam` int(11) DEFAULT NULL COMMENT '是否是团队项目',
  `stu6` varchar(15) DEFAULT NULL,
  `stu5` varchar(15) DEFAULT NULL,
  `stu4` varchar(15) DEFAULT NULL,
  `stu3` varchar(15) DEFAULT NULL,
  `stu2` varchar(15) DEFAULT NULL,
  `stu1` varchar(15) DEFAULT NULL,
  `torank` char(1) DEFAULT NULL COMMENT '变更到什么级别\n',
  `tostatus` int(11) DEFAULT NULL COMMENT '状态',
  `tmid` int(11) DEFAULT NULL COMMENT '如果是团队项目这个是哪个团队的项目',
  `isissue` int(11) DEFAULT NULL COMMENT '（1发布）（0不发布）',
  `schoolcondition` text,
  `ischange` int(11) DEFAULT '0' COMMENT '是否变更',
  `changereason` text COMMENT '变更原因',
  `removereason` text COMMENT '撤项原因',
  `changetmsg` text COMMENT '指导老师变更意见',
  `changeamsg` text COMMENT '学院变更意见',
  `changesmsg` text COMMENT '学校变更意见',
  `removetmsg` text,
  `removeamsg` text,
  `removesmsg` text,
  `isremove` int(11) DEFAULT '0' COMMENT '是否撤项',
  `removestatus` int(11) DEFAULT NULL COMMENT '撤项状态',
  `changestatus` int(11) DEFAULT NULL COMMENT '变更状态',
  `teachercheckidea` text COMMENT '老师审核意见',
  `academycheckidea` text COMMENT '学院审核意见',
  `schoolcheckidea` text COMMENT '学校审核意见',
  `firstterm` varchar(255) DEFAULT NULL COMMENT '一期答辩材料',
  `secondterm` varchar(255) DEFAULT NULL COMMENT '二期答辩材料',
  `endterm` varchar(255) DEFAULT NULL COMMENT '结项报告',
  PRIMARY KEY (`pid`),
  KEY `sid` (`sid`),
  KEY `tid` (`tid`),
  CONSTRAINT `project_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`),
  CONSTRAINT `project_ibfk_2` FOREIGN KEY (`tid`) REFERENCES `teacher` (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `project` */

insert  into `project`(`pid`,`sid`,`tid`,`theyear`,`pname`,`ptype`,`prank`,`begintime`,`endtime`,`technology`,`officecost`,`officemark`,`materialcost`,`materialmark`,`bookcost`,`bookmark`,`postcost`,`postmark`,`phonecost`,`phonemark`,`transportationcost`,`transportationmark`,`maintaincost`,`maintainmark`,`printcost`,`printmark`,`pintroduction`,`pbackground`,`pcontent`,`pscheme`,`pcondition`,`ptarget`,`pprogress`,`isteam`,`stu6`,`stu5`,`stu4`,`stu3`,`stu2`,`stu1`,`torank`,`tostatus`,`tmid`,`isissue`,`schoolcondition`,`ischange`,`changereason`,`removereason`,`changetmsg`,`changeamsg`,`changesmsg`,`removetmsg`,`removeamsg`,`removesmsg`,`isremove`,`removestatus`,`changestatus`,`teachercheckidea`,`academycheckidea`,`schoolcheckidea`,`firstterm`,`secondterm`,`endterm`) values (1,1,1,2017,'基于微信的团队管理系统','1','d','2017-01-01','2017-01-02','计算机科学',5452,'455',45,'45',54,'45',54,'45',45,'54',54,'45',45,'45',54,'45',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'20152122','20152121','20152123','a',3,NULL,1,NULL,1,'sadadsd',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0,2,'审核通过！','没什么意见',NULL,NULL,NULL,NULL),(2,2,2,2016,'水果毛游戏开发','1','a','2017-01-01','2017-01-01','计算机科学',NULL,NULL,543,'435',543,'354',345,'35',53,'43',NULL,NULL,NULL,'5',534,'534',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'20152154',NULL,NULL,NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'审核通过，必须的',NULL,NULL,NULL,NULL,NULL),(3,1,1,2017,'项目申报系统','1','c','2017-06-14','2017-06-16','计算机科学',57,'tertert',4335,'et',5345,'3453543',43534,'435435',435,'4353',4353,'5435',435,'34',3543,'43535','这个是给创新创业学院做的能投入使用的一个项目','<span>这个是给创新创业学院做的能投入使用的一个项目</span>','<span>这个是给创新创业学院做的能投入使用的一个项目</span>','<span>这个是给创新创业学院做的能投入使用的一个项目</span>','<span>这个是给创新创业学院做的能投入使用的一个项目</span>','<span>这个是给创新创业学院做的能投入使用的一个项目</span>','<span>这个是给创新创业学院做的能投入使用的一个项目</span>',1,NULL,'20152121','20152121','20152121','20152121','20152123',NULL,1,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'这个项目很溜',NULL,NULL,NULL,NULL,NULL),(4,1,1,2017,'你妈卖批你妈买票','1','a','2017-07-04','2017-07-27','你妈卖批',500,'fsdfdsf',4654,'416546',56451,'5656146',55655,'6556416',5665,'651465',565,'556',566,'556',565,'6555566','你妈妈Uip','<span>你妈妈Uip</span>','<span>你妈妈Uip</span>','<span>你妈妈Uip</span>','<span>你妈妈Uip</span>','<span>你妈妈Uip</span>','<span>你妈妈Uip</span>',NULL,NULL,'20152123','20152123','20152123','20152122','20152154',NULL,1,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'这个项目很溜比',NULL,NULL,NULL,NULL,NULL),(5,4,2,2017,'asijdaslkjdlasjkdlas','1','d','2017-07-04','2018-07-11','dsadjasldjasldas',3243,'4234',4234,'2342',423,'4234',2234,'23423',3242,'4324',32432,'4324',242,'4324',24,'2423','牛逼<span style=\"font-family:NSimSun;\"></span>','<span>牛逼</span><span style=\"font-family:NSimSun;\"></span>','<span>牛逼</span><span style=\"font-family:NSimSun;\"></span>','<span>牛逼</span><span style=\"font-family:NSimSun;\"></span>','<span style=\"font-size:12px;\">牛逼</span><span style=\"font-size:12px;font-family:NSimSun;\"></span>','<span style=\"font-size:12px;\">牛逼</span><span style=\"font-size:12px;font-family:NSimSun;\"></span>','<span style=\"font-size:12px;\">牛逼</span><span style=\"font-size:12px;font-family:NSimSun;\"></span>',NULL,NULL,'20152154','20152154','20152154','20152154','20152154',NULL,0,NULL,0,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,6,4,2017,'asdlaskhdkasdaskldas','1','d','2017-07-11','2017-07-21','啊实打水开了的哈三可ISA',23423,'23443',242323,'4234',423,'4234',2342323,'4234',2344,'32234',234,'23423',423423,'4234',234234,'234','asfegsdf','fsdfsdfs','fsdfsd','sdfsdfsdf','sdfsdfsdf','sdfdsfsdfwerwer','dsfsdfsdfweresfds',NULL,NULL,'20152122','20150001','20152154','20150003','20150002',NULL,0,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,1,4,2017,'色粉打个电话','1','a','2017-06-29','2017-07-07','示范点听歌热热',234,'234',234,'234',234,'324',234,'234',234,'234',234,'342',234,'234',234,'423','rgefgdf','gdfgdfg','dfgdfgfd','dfgdg','dfgfdgdfg','dfgdfgdfgdf','tregtergfd',NULL,NULL,'20152123','20152122','20150003','20150002','20150001',NULL,0,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,6,2,2017,'让全世界为我陶醉','1','d','2017-07-06','2017-07-29','这就牛逼了',231,'12312',2313,'12312',3123,'12312',3213,'123123',213,'23132',213123,'12312',312321,'3213',2131232,'13231','这就很强，这就很舒服','<span>这就很强，这就很舒服</span>','<span>这就很强，这就很舒服</span>','<span>这就很强，这就很舒服</span>','<span>这就很强，这就很舒服</span>','<span>这就很强，这就很舒服</span>','<span>这就很强，这就很舒服</span>',0,NULL,'20152123','20152122','20150003','20150002','20150001','a',3,NULL,1,NULL,1,'必须来一个国家级的项目啊',NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,2,'这个项目很不错啊','我也觉得这个项目很不错',NULL,NULL,NULL,NULL),(9,1,2,2016,'葡萄酒调查','1','a','2017-07-29','2017-07-31','你妈卖批',32423,'432423',3242,'42342',342,'4324',4324,'324',234324,'324',324324,'4324',432,'324324',4324,'23','dsadsdsf','fdsdsfds','fdsfdsf','fdsfds','dfsfds','dsfdsf','dsfdsfdsf',0,NULL,'20152123','20152122','20150003','20150002','20150001',NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'同','老哥稳',NULL,NULL,NULL,NULL),(10,1,2,2017,'sadasdasd','1','a','2017-07-29','2017-07-31','你妈卖批',32423,'432423',3242,'42342',342,'4324',4324,'324',234,'32',234,'243',324,'234',324,'dsfs','erfref','fdddd',NULL,NULL,NULL,NULL,NULL,0,NULL,'20152121','20152121','20152121','20152121','20152121','',3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'没问题',NULL,NULL,NULL,NULL),(11,1,2,2017,'dfgdfgdf','1','a','2017-07-29','2017-07-31','fsdfgegter',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'不好意思 &nbsp;再见',NULL,NULL,NULL,NULL),(12,1,2,2017,'sfsdfsdf','1','a','2017-07-29','2017-07-29','dfdsfsd',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'很好',NULL,NULL,NULL,NULL),(13,1,2,2016,'第四范式发射点','1','a','2017-07-29','2017-07-29','2017-07-29vdxvcx',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'玩吗',NULL,NULL,NULL,NULL),(14,1,2,2017,'sdadasa','1','a','2017-07-29','2017-07-29','sdfdsfdsf',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'很好',NULL,NULL,NULL,NULL),(15,1,2,2017,'dsadsadsad','1','a','2017-07-29','2017-07-29','gsdfsdfds',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,'很好',NULL,NULL,NULL,NULL),(16,9,2,2017,'sdasdasd',NULL,'b','2017-07-05','2017-08-25','sadasdasd',7,'asd',4,'4',4,'4',4,'4',4,'4',4,'4',4,'4',4,'4','444','444','44444444444444444444444','4444444444444444444444','444444444444444444444444444444','433333333333444444444444444444444444','344444444444444444444444444444444444444',0,NULL,'20152154','20152297','20150003','20150002','20150001',NULL,3,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'mmp','没意见',NULL,NULL,NULL,NULL),(17,1,2,2017,'zhizhangwangjiaqi',NULL,'b','2017-08-04','2017-08-19','jisuanji',41646,'ahsbda',56156,'sasda',89798,'asdad',87,'7ad',87,'87',8,'88',8,'8',88,'8','hadjaa','dasdasdasd','asdasdad','asdasd','asdasda','sdasdas','dasd',0,NULL,'20152297','20152154','20150003','20150002','20150001',NULL,1,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,'sadsadsadadasdasd',NULL,NULL,NULL,NULL,NULL),(18,6,1,2017,'杨云龙',NULL,'a','2017-08-14','2017-08-31','gttg',23,'3',23,'3',13,'3',3,'3',1,'3',3,'3',3,'3',3,'3','3','3','3','3','3','3','3',0,NULL,'20152297','20152154','20150003','20150002','20150001',NULL,0,NULL,1,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `projectfile` */

DROP TABLE IF EXISTS `projectfile`;

CREATE TABLE `projectfile` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `path` varchar(255) DEFAULT NULL COMMENT '路径',
  `filetype` varchar(20) DEFAULT NULL COMMENT '文件类型',
  `uploaddate` varchar(20) DEFAULT NULL COMMENT '上传时间',
  `sid` int(11) NOT NULL,
  `pid` int(11) NOT NULL COMMENT '主键',
  `stage` int(11) DEFAULT NULL COMMENT '阶段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `projectfile` */

insert  into `projectfile`(`id`,`path`,`filetype`,`uploaddate`,`sid`,`pid`,`stage`) values (35,'7c9f29969a974a64ba810485f6dd43cbvmware-2.log',NULL,'2017-08-09',1,9,2),(36,'633d6295bb80460887ebfda26078aae8vmware-1.log',NULL,'2017-08-09',1,9,1),(37,'f4da79a437b94866830ed9c35ac16af8vmware-2.log',NULL,'2017-08-09',1,9,1),(38,'59d32353149145c2a5e48ac0226632c1vmware.log',NULL,'2017-08-09',1,9,1),(39,'ef0f663d347142d59cd4f980b88c75b5vmware-2.log',NULL,'2017-08-09',1,10,1),(40,'829dfa6dfb2c400d974b75c753e45998vmware-2.log',NULL,'2017-08-09',1,10,1),(41,'6210dc353c6040e1ab8a9abfcf9e6a48vmware-2.log',NULL,'2017-08-09',1,9,1),(42,'f5824fc1ce9a425c81a17934107f9b2evmware-1.log',NULL,'2017-08-09',1,9,1),(43,'856aaea2e19944dfb34e9594f7390ae3vmware-2.log',NULL,'2017-08-09',1,10,1);

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
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

/*Data for the table `sonmeun` */

insert  into `sonmeun`(`sid`,`pid`,`smeunname`,`meunurl`,`sorder`,`role`) values (1,1,'信息完善','studentgoto/setinfo.action',1,1),(2,1,'修改密码','studentgoto/gotosetpass.action',2,1),(3,2,'申请项目','studentgoto/applyproject.action',3,1),(4,2,'项目列表','studentgoto/listproject.action',4,1),(5,2,'项目变更申请','studentgoto/listprojecttochange.action',5,1),(6,2,'项目撤项申请','studentgoto/listprojecttoexit.action',6,1),(7,3,'项目申报须知','',7,1),(11,5,'第一阶段','studentgoto/uploadcheckfile/1',11,1),(12,5,'第二阶段','studentgoto/uploadcheckfile/2',12,1),(13,5,'第三阶段','studentgoto/uploadcheckfile/3',13,1),(14,6,'信息完善','teachergoto/setinfo.action',14,2),(15,6,'修改密码','teachergoto/gotosetpass.action',15,2),(16,7,'项目审核','teachergoto/listAllProjecByTid.action',16,2),(17,7,'变更审核','teachergoto/listAllChangeProjecByTid.action',18,2),(18,7,'全部项目','teachergoto/selectAllProjecByTid.action',19,2),(19,8,'一期评审','teachergoto',22,2),(20,8,'中期评审','teachergoto',24,2),(21,8,'结项评审','',25,2),(23,7,'撤项审核','teachergoto/listAllRemoveProjecByTid.action',17,2),(24,11,'修改密码','academyadmin/gotosetpass.action',30,3),(25,12,'项目审核','academyadmin/academylistproject.action',60,3),(26,12,'变更审核','academyadmin/academychangecheck.action',62,3),(27,12,'历届项目','academyadmin',66,3),(28,13,'一期评审','academyadmin',70,3),(29,13,'中期评审','academyadmin',71,3),(30,13,'结项评审','academyadmin',72,3),(31,12,'撤项审核','academyadmin/academyremovecheck.action',64,3),(32,12,'已审核项目申请','academyadmin/academycheckedlistproject.action',61,3),(33,12,'已审核变更申请','academyadmin/academyyijichangecheck.action',63,3),(34,12,'已审核撤项申请','acadmyadmin/academyyijiremovecheck.action',65,3),(35,16,'修改密码','schooladmin/gotosetpass.action',100,4),(36,17,'项目申请审核','schooladmin/schoollistproject/d/2',101,4),(37,17,'审核通过项目','schooladmin/schoollistproject/d/3',102,4),(38,17,'审核未通过项目','schooladmin/schoollistproject/d/-3',103,4),(39,21,'项目申请审核','schooladmin/schoollistproject/b/2',104,4),(41,21,'审核通过项目','schooladmin/schoollistproject/b/3',106,4),(42,21,'审核未通过项目','schooladmin/schoollistproject/b/-3',107,4),(43,20,'项目申请审核','schooladmin/schoollistproject/a/2',108,4),(44,20,'审核通过项目','schooladmin/schoollistproject/a/3',109,4),(45,20,'项目撤项未通过','schooladmin/schoollistproject/a/-3',110,4),(46,18,'项目审核申请','schooladmin/schoollistproject/c/2',111,4),(47,18,'审核通过项目','schooladmin/schoollistproject/c/3',112,4),(48,18,'审核未通过项目','schooladmin/schoollistproject/c/-3',113,4),(55,22,'发布通知','schooladmin/gotoaddnotice.action',120,4),(56,22,'通知管理','asf',121,4),(57,25,'变更至区级项目','schooladmin/schoollistchangeprojects/b',122,4),(58,25,'变更至国家级项目','schooladmin/schoollistchangeprojects/a',123,4),(59,19,'一期审核','schooladmin/projectfilelist/a/1',124,4),(60,19,'中期审核','schooladmin/projectfilelist/a/2',125,4),(61,19,'结项审核','schooladmin/projectfilelist/a/3',126,4),(62,24,'撤项申请审核','sadadsa',127,4),(63,26,'一期审核','schooladmin/projectfilelist/b/1',128,4),(64,26,'中期审核','schooladmin/projectfilelist/b/2',129,4),(65,26,'结项审核','schooladmin/projectfilelist/b/3',130,4),(66,27,'一期审核','schooladmin/projectfilelist/c/1',131,4),(68,27,'中期审核','schooladmin/projectfilelist/c/2',132,4),(69,27,'结项审核','schooladmin/projectfilelist/c/3',133,4),(70,28,'一期审核','schooladmin/projectfilelist/d/1',134,4),(71,28,'中期审核','schooladmin/projectfilelist/d/2',135,4),(72,28,'结项审核','schooladmin/projectfilelist/d/3',136,4);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) DEFAULT NULL COMMENT '学生姓名',
  `snumber` varchar(10) DEFAULT NULL COMMENT '学号',
  `team` varchar(100) DEFAULT '无' COMMENT '团队',
  `nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `academy` varchar(100) DEFAULT NULL COMMENT '学院',
  `major` varchar(50) DEFAULT NULL COMMENT '专业\n',
  `clazz` int(11) DEFAULT NULL COMMENT '班级',
  `phone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(15) DEFAULT NULL COMMENT 'qq',
  `spassword` varchar(100) DEFAULT '123456' COMMENT '学生密码',
  `sex` int(11) DEFAULT NULL COMMENT '男女',
  `bankcard` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`sid`,`sname`,`snumber`,`team`,`nation`,`academy`,`major`,`clazz`,`phone`,`email`,`qq`,`spassword`,`sex`,`bankcard`) values (1,'王嘉琪','20152154','无','汉族','计算机科学与工程学院','软件工程',2,'18795207136','1016484945@qq.com',NULL,'wwwww',NULL,NULL),(2,'王世豪','20152123','无',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123456',NULL,NULL),(3,'王傻瓜','20152122','无',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123456',NULL,NULL),(4,'mary','20152121','无','汉族','外国语学院','英语',2,'18795207136','545646346@qq.com',NULL,'123456',NULL,NULL),(5,'jack','20152013','无','',NULL,NULL,NULL,NULL,NULL,NULL,'123456',NULL,NULL),(6,'fuck','20150001','无','汉族','计算机科学与工程学院','软件工程',2,'14785546546','342523524@qq.com',NULL,'123456',NULL,NULL),(7,'mark','20150002','无','汉族','计算机','软件工程',3,'18292342718','234eedfewf@rertete.com',NULL,'123456',NULL,NULL),(8,'juary','20150003','无',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123456',NULL,NULL),(9,'吴传彪','20152297','无','苗族','计算机科学与工程学院','网络工程',1,'18295002925','1456548434@qq.com',NULL,'123456',NULL,NULL),(10,'杨云龙','20152217','无',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123456',NULL,NULL);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(50) DEFAULT NULL COMMENT '老师的名字',
  `tacademy` varchar(100) DEFAULT NULL COMMENT '所属学院',
  `title` varchar(50) DEFAULT NULL COMMENT '职称',
  `tnumber` varchar(15) DEFAULT NULL COMMENT '教工号',
  `tpassword` varchar(100) DEFAULT '123456' COMMENT '密码\n',
  `tphone` varchar(15) DEFAULT NULL COMMENT '手机号',
  `temail` varchar(100) DEFAULT NULL COMMENT '老师邮箱',
  `tage` int(11) DEFAULT NULL COMMENT '老师年龄',
  `bankcard` varchar(20) DEFAULT NULL COMMENT '银行卡',
  `ptitle` varchar(50) DEFAULT NULL COMMENT '专业技术职务',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`tid`,`tname`,`tacademy`,`title`,`tnumber`,`tpassword`,`tphone`,`temail`,`tage`,`bankcard`,`ptitle`,`sex`) values (1,'李庆达','创新创业学院',NULL,'20122015','1234567','545646','5464645@qq.com',NULL,NULL,'老师',NULL),(2,'张少敏','计算机科学与工程学院',NULL,'20122012','123456','13838389438','1000@qq.com',NULL,NULL,'高级教授',NULL),(3,'王福平',NULL,NULL,'20122013','123456',NULL,NULL,NULL,NULL,NULL,NULL),(4,'maike',NULL,NULL,'20120001','123456',NULL,NULL,NULL,NULL,NULL,NULL),(5,'fucky',NULL,NULL,'20120002','123456',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `team` */

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `tmid` int(11) NOT NULL AUTO_INCREMENT COMMENT '团队id',
  `tmname` varchar(100) DEFAULT NULL COMMENT '团队名称',
  PRIMARY KEY (`tmid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `team` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
