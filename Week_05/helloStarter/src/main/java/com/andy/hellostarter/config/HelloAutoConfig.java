package com.andy.hellostarter.config;

import com.andy.hellostarter.model.Klass;
import com.andy.hellostarter.model.School;
import com.andy.hellostarter.model.Student;
import com.andy.hellostarter.properties.StudentProperties;
import com.andy.hellostarter.stub.ISchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.Arrays;

/**
 * @author mac
 */
@Configuration
@ConditionalOnClass(School.class)
@EnableConfigurationProperties(StudentProperties.class)
public class HelloAutoConfig {
    @Autowired
    StudentProperties properties;

    @Bean("student001")
    public Student getStudent001(StudentProperties studentProperties) {
        return new Student(studentProperties.getId(), studentProperties.getName());
    }

    @Bean("student002")
    public Student getStudent002(StudentProperties studentProperties) {
        return new Student(2, "Tony");
    }

    @Bean("klass")
    @DependsOn({"student001", "student002"})
    public Klass getKlass(Student student001, Student student002) {
        Klass klass = new Klass();
        klass.setStudents(Arrays.asList(student001, student002));

        return klass;
    }

    @Bean("school")
    @DependsOn({"klass", "student002"})
    public ISchool getSchool(Klass klass, Student student002) {
        School school = new School();
        school.setClass1(klass);
        school.setStudent100(student002);
        school.ding();
        return school;
    }
}
