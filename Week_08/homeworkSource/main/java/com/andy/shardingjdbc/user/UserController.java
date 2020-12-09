package com.andy.shardingjdbc.user;

import com.andy.shardingjdbc.user.dao.StoreOrderMapper;
import com.andy.shardingjdbc.user.model.StoreOrder;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@RestController("userController")
@RequestMapping("/user")
public class UserController {
    @Resource
    DataSource dataSource;

    @Autowired
    StoreOrderMapper storeOrderMapper;

    @GetMapping("/create")
    public void create() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("CREATE TABLE `store_order` (\n" +
            "  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,\n" +
            "  `create_time` datetime DEFAULT NULL,\n" +
            "  `update_time` datetime DEFAULT NULL,\n" +
            "  `commodity_id` bigint(20) NOT NULL,\n" +
            "  `user_id` bigint(20) NOT NULL,\n" +
            "  `shipping_address` varchar(200) NOT NULL DEFAULT '',\n" +
            "  `reciving_phone` char(11) NOT NULL DEFAULT '',\n" +
            "  `order_amount` float DEFAULT NULL,\n" +
            "  PRIMARY KEY (`order_id`)\n" +
            ") ENGINE=InnoDB");
        System.out.println("111");
    }


    @GetMapping("/add")
    @Transactional(rollbackFor = SQLException.class)
    @ShardingTransactionType(TransactionType.XA)
    public void add() throws SQLException {
        Random random = new Random();
        StoreOrder order = new StoreOrder();
        order.setOrderId(Math.abs(random.nextLong()));
        order.setCommodityId(Math.abs(random.nextLong()));
        order.setCreateTime(new Date());
        order.setOrderAmount(Math.abs(random.nextLong()));
        order.setRecivingPhone(Math.abs(random.nextLong())+ "");
        order.setUpdateTime(new Date());
        storeOrderMapper.insert(order);
        throw new SQLException();
    }
}
