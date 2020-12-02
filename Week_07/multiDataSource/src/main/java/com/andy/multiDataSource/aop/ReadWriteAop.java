package com.andy.multiDataSource.aop;

import com.andy.multiDataSource.context.ReadWriteDataSourceContext;
import com.andy.multiDataSource.emuns.DBType;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author mac
 */
@Aspect
@Component
public class ReadWriteAop {
    @Pointcut("@annotation(com.andy.multiDataSource.annotaion.Slave)")
    public void readAspect() {

    }
    @Pointcut("@annotation(com.andy.multiDataSource.annotaion.Master)")
    public void writeAspect() {

    }

    @Before("readAspect()")
    public void beforeRead(){
        ReadWriteDataSourceContext.setDBType(DBType.Slave);
    }

    @Before("writeAspect()")
    public void beforeWrite(){
        ReadWriteDataSourceContext.setDBType(DBType.Master);
    }
}
