package com.andy.multiDataSource.context;

import com.andy.multiDataSource.emuns.DBType;

/**
 * @author mac
 */
public class ReadWriteDataSourceContext {
    private static final ThreadLocal<DBType> contextHolder = new ThreadLocal<>();

    public static void setDBType(DBType type) {
        contextHolder.set(type);
    }

    public static DBType getDBType() {
        return contextHolder.get();
    }
}
