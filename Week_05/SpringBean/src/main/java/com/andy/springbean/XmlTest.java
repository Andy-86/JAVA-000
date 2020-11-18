package com.andy.springbean;

import com.andy.springbean.xml.StudentServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mac
 */
public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentServer student = context.getBean(StudentServer.class);
        student.say();
    }
}
