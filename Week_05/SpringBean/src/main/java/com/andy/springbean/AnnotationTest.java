package com.andy.springbean;

import com.andy.springbean.xml.StudentServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author mac
 */
@Configuration
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationTest.class);
        StudentServer student = context.getBean(StudentServer.class);
        student.say();
    }
}
