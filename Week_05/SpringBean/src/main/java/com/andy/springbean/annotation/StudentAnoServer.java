package com.andy.springbean.annotation;

import com.andy.springbean.xml.StudentServer;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author mac
 */
@Service("student")
public class StudentAnoServer {
    StudentServer studentServer = null;

    @PostConstruct
    public void init() {
        studentServer = new StudentServer();
        studentServer.setId(2);
        studentServer.setName("annotation");
    }

    public void say() {
        studentServer.say();
    }
}
