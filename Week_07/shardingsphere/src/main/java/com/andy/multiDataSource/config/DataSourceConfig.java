package com.andy.multiDataSource.config;


import org.apache.shardingsphere.api.config.masterslave.MasterSlaveRuleConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author mac
 */
@Configuration
public class DataSourceConfig {

    /**
     * 写库
     *
     * @return
     */
    @Bean
    @ConfigurationProperties("spring.datasource.master")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 读库
     *
     * @return
     */
    @Bean
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public DataSource readWriteRoutingDataSource(@Qualifier("masterDataSource") DataSource masterDataSource,
                                                 @Qualifier("slaveDataSource") DataSource slaveDataSource) throws SQLException {
        Map<String, DataSource> targetDataSources = new HashMap<>();
        targetDataSources.put("masterDataSource", masterDataSource);
        targetDataSources.put("slaveDataSource", slaveDataSource);
        //设置主库备库
        MasterSlaveRuleConfiguration masterSlaveRuleConfig = new MasterSlaveRuleConfiguration("ms_ds", "masterDataSource", Arrays.asList("slaveDataSource"));
        DataSource readWriteRoutingDataSource = MasterSlaveDataSourceFactory.createDataSource(targetDataSources, masterSlaveRuleConfig, new Properties());
        return readWriteRoutingDataSource;
    }

}