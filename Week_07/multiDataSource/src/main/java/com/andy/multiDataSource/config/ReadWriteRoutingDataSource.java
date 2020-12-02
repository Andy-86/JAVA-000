package com.andy.multiDataSource.config;

import com.andy.multiDataSource.context.ReadWriteDataSourceContext;
import com.andy.multiDataSource.emuns.DBType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mac
 */
public class ReadWriteRoutingDataSource extends AbstractRoutingDataSource {

    public ReadWriteRoutingDataSource() {
        ReadWriteDataSourceContext.setDBType(DBType.Master);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return ReadWriteDataSourceContext.getDBType();
    }
}
