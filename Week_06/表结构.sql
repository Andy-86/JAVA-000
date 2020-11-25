# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.6.39)
# Database: db1
# Generation Time: 2020-11-25 13:42:41 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table store_commodity
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_commodity`;

CREATE TABLE `store_commodity` (
  `commodity_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `commodity_name` varchar(20) NOT NULL DEFAULT '',
  `commodity_price` float NOT NULL,
  `commodity_stock` int(11) NOT NULL,
  `commodity_decription` varchar(400) DEFAULT NULL,
  `commodity_picture` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table store_order
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_order`;

CREATE TABLE `store_order` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `commodity_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `shipping_address` varchar(200) NOT NULL DEFAULT '',
  `reciving_phone` char(11) NOT NULL DEFAULT '',
  `order_amount` float DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



# Dump of table store_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `store_user`;

CREATE TABLE `store_user` (
  `user_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL DEFAULT '',
  `user_addr` varchar(100) DEFAULT NULL,
  `user_gender` bit(11) DEFAULT NULL,
  `user_telephone_number` char(11) DEFAULT NULL,
  `user_brithday` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
