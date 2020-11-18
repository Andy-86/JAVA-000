package com.andy.springbean.xml;

import java.io.Serializable;


/**
 * @author mac
 */
public class StudentServer implements Serializable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("hello my name is " + name);
    }

}
