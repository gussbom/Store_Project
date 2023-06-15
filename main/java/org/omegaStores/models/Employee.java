package org.omegaStores.models;

import org.omegaStores.enums.Ethnicity;

public class Employee {

    private String name;
    private Integer age;
    private Ethnicity ethnicity;

    public Employee(String name, Integer age, Ethnicity ethnicity) {
        this.name = name;
        this.age = age;
        this.ethnicity = ethnicity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Ethnicity getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ethnicity=" + ethnicity +
                '}';
    }
}
