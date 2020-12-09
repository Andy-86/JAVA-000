# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.39)
# Database: db0
# Generation Time: 2020-12-09 14:40:32 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table store_order0
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order0`;

CREATE TABLE `store_order0` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order1
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order1`;

CREATE TABLE `store_order1` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order10
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order10`;

CREATE TABLE `store_order10` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order11
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order11`;

CREATE TABLE `store_order11` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order12
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order12`;

CREATE TABLE `store_order12` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order13
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order13`;

CREATE TABLE `store_order13` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order14
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order14`;

CREATE TABLE `store_order14` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order15
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order15`;

CREATE TABLE `store_order15` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order2
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order2`;

CREATE TABLE `store_order2` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order3
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order3`;

CREATE TABLE `store_order3` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order4
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order4`;

CREATE TABLE `store_order4` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order5
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order5`;

CREATE TABLE `store_order5` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order6
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order6`;

CREATE TABLE `store_order6` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order7
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order7`;

CREATE TABLE `store_order7` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order8
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order8`;

CREATE TABLE `store_order8` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table store_order9
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order9`;

CREATE TABLE `store_order9` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
