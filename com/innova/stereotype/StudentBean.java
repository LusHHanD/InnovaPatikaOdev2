package com.innova.stereotype;

@InnovaMultipleAnnotation
public class StudentBean {

    private String name = "MySQL";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
