/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author c0687988
 */
public class Course {
    List<Student> students;

    public Course() {
    }
    
    public Course(List<Student> students) {
        this.students = students;
    }
    
    public void add(Student student){
        students.add(student);
    }
    
    public void remove(Student student){
        students.remove(student);
    }
    
    public void remove(String id){
        
    }
    
    public void remove(int position){
        students.remove(position);
    }
    
    public void insert(Student student, int position){
        students.add(position, student);
    }
    
    public Student get(String id){
        for(int i=0;i<students.size()-1;i++){
        
        }
        return null;
    }
    
    public Student get(int position){
        return null;
    }
    
    public List<Student> getAll(){
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Set<Student> getAllByGender(String gender){
        return null;
    }
    
    public Map<String,Set<Student>> getGradeMap(String gender){
        return null;
    }
}
