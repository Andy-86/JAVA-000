package com.andy.starter;

import com.andy.hellostarter.model.Student;
import com.andy.hellostarter.stub.ISchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mac
 */
@SpringBootApplication
public class ApplicationStarter {
    @Autowired
    ISchool school;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
