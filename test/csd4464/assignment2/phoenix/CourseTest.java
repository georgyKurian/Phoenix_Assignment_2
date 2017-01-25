/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Georgi
 */
public class CourseTest {

    Course studentCourse;
    List<Student> studentList;

    public CourseTest() {
        studentList = new ArrayList<Student>();
        studentList.add(new Student("Student1", "C0680", "Male", 3.53));
        studentList.add(new Student("Student2", "C0681", "Male", 2.53));
        studentList.add(new Student("Student3", "C0682", "Male", 3.04));
        studentList.add(new Student("Student4", "C0683", "Female", 3.13));
        studentList.add(new Student("Student5", "C0684", "Female", 2.23));
        studentList.add(new Student("Student6", "C0685", "Male", 1.53));
        studentList.add(new Student("Student6", "C0686", "Male", 3.52));
        studentList.add(new Student("Student7", "C0686", "Male", 3.33));
    }

    @Before
    public void setUp() {

        studentCourse = new Course(studentList);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemoveWithStudentObject() {
        Course instance = new Course(studentList);
        instance.remove(new Student("Student7", "C0686", "Male", 3.33));
        studentList.remove(6);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test GetAllNoArgMethod Constructor
     */
    @Test
    public void testCourseDefaultConstructor() {
        Course noArg = new Course();
        List<Student> expResult = new ArrayList<Student>();
        List<Student> result = noArg.getAll();

        assertEquals(expResult, result);
    }

    /**
     * Test the testGetAllRemoveIdStudent , class Course
     */
    @Test
    public void testGetAllRemoveIdStudent() {
        Course instance = new Course(studentList);
        instance.remove("C0680");
        studentList.remove(0);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test the testGetAllRemovePositionStudent , class Course
     */
    @Test
    public void testRemovePositionGetAll() {
        Course instance = new Course(studentList);
        instance.remove(new Student("Student7", "C0686", "Male", 3.33));
        studentList.remove(6);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test the testPositionIntegerGet , class Course
     */
    @Test
    public void testPositionIntegerGet() {
        Course instance = new Course(studentList);
        Student expResult = studentList.get(1);
        Student result = instance.get(1);
        assertEquals(expResult, result);

    }

    /**
     * Test the testPositionIntegergreaterThanOrEqualGet, class Course
     */
    @Test
    public void testPositionIntegergreaterThanOrEqualGet() {
        Course instance = new Course(studentList);
        Student expResult = null;
        Student result = instance.get(9);
        assertEquals(expResult, result);
    }

    /**
     * Test testEqualsMethod , class Course
     */
    @Test
    public void testEqualsMethod() {
        Course instance = new Course(studentList);
        boolean expResult = true;
        Course instance2 = new Course(studentList);
        boolean result = instance2.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test testGetAllBy GradeGender, class Course
     */
    @Test
    public void testGetAllByGender() {
        Course instance = new Course(studentList);
        Set<Student> studList2 = new HashSet<Student>();
        studList2.add(new Student("Student4", "C0683", "Female", 3.13));
        studList2.add(new Student("Student5", "C0684", "Female", 2.23));
        Set<Student> expResult = studList2;
        Set<Student> result = instance.getAllByGender("Female");
        assertEquals(expResult, result);

    }

}
