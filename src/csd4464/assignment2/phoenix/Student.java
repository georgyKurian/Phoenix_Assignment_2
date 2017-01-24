/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import org.json.simple.JSONObject;

/**
 *
 * @author c0687988
 */
public class Student {

    private String name;
    private String id;
    private String gender;
    private double grade;

    public Student() {
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student std = (Student) obj;
        if (this.getName() == std.getName() && this.getId() == std.getId()) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        JSONObject obj = new JSONObject();
        obj.put("name", this.name);
        obj.put("id", this.id);
        obj.put("gender", this.gender);
        obj.put("grade", this.grade);
        
        return obj.toJSONString();
    }

}
