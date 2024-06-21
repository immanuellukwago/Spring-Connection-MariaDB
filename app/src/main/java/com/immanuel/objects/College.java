package com.immanuel.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class College {

    @Value("${name_College}")
    String name_College;

    @Value("${yearsOfExistence}")
    int yearsOfExistence;

    @Value("${numOfStudents}")
    int numOfStudents;

    @Value("${numOfStuff}")
    int numOfStuff;

    @Autowired
    Address address;

    public College() {
    }

    public String getName() {
        return name_College;
    }

    public void setName(String name) {
        this.name_College = name;
    }

    public int getYearsOfExistence() {
        return yearsOfExistence;
    }

    public void setYearsOfExistence(int yearsOfExistence) {
        this.yearsOfExistence = yearsOfExistence;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfStuff() {
        return numOfStuff;
    }

    public void setNumOfStuff(int numOfStuff) {
        this.numOfStuff = numOfStuff;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "College [name=" + name_College + ", yearsOfExistence=" + yearsOfExistence + ", numOfStudents="
                + numOfStudents
                + ", numOfStuff=" + numOfStuff + ", address=" + address.toString() + "]";
    }

}
