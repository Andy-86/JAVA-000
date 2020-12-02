package com.andy.multiDataSource.config;


import com.andy.multiDataSource.emuns.DBType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

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
                                          @Qualifier("slaveDataSource") DataSource slaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DBType.Master, masterDataSource);
        targetDataSources.put(DBType.Slave, slaveDataSource);
        ReadWriteRoutingDataSource readWriteRoutingDataSource = new ReadWriteRoutingDataSource();
        readWriteRoutingDataSource.setDefaultTargetDataSource(masterDataSource);
        readWriteRoutingDataSource.setTargetDataSources(targetDataSources);
        return readWriteRoutingDataSource;
    }

}