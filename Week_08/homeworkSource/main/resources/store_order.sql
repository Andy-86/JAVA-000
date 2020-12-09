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
) ENGINE=InnoDB;