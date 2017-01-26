/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
        students = new ArrayList<Student>();
    }

    public Course(List<Student> students) {
        this.students = students;
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void remove(String id) {
        int i = 0;
        for (i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }

    public void remove(int position) {
        if (position >= 0 && position < students.size()) {
            students.remove(position);
        }
    }

    public void insert(Student student, int position) {
        students.add(position, student);
    }

    public Student get(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public Student get(int position) {
        if (position >= 0 && position < students.size()) {
            return students.get(position);
        }
        return null;
    }

    public List<Student> getAll() {
        return students;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Course)) {
            return false;
        }
        Course course2 = (Course) obj;
        List<Student> studentlist2 = course2.getAll();

        if (studentlist2 == students) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return students.toString();
    }

    public Set<Student> getAllByGender(String gender) {
        Set<Student> studentSet = new HashSet<Student>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGender() == gender) {
                studentSet.add(students.get(i));
            }
        }
        return studentSet;
    }

    public Map<String, Set<Student>> getGradeMap() {
        Map<String, Set<Student>> resultMap = new HashMap<String, Set<Student>>();
        resultMap.put("A", new HashSet<Student>());
        resultMap.put("B", new HashSet<Student>());
        resultMap.put("C", new HashSet<Student>());
        resultMap.put("F", new HashSet<Student>());

        for (Student student : students) {
            if (student.getGrade() >= 3.5) {
                resultMap.get("A").add(student);
            } else if (student.getGrade() >= 3.0) {
                resultMap.get("B").add(student);
            } else if (student.getGrade() >= 2.5) {
                resultMap.get("C").add(student);
            } else {
                resultMap.get("F").add(student);
            }

        }
        return resultMap;
    }
}
