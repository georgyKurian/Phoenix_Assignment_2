/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import java.util.ArrayList;
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
    Course studentCourse ;
    List<Student> studentList;
        
    public CourseTest() {
        studentList = new ArrayList<Student>() ;
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
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        Course instance = new Course();
        instance.add(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int position = 0;
        Course instance = new Course();
        instance.remove(position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Student student = null;
        int position = 0;
        Course instance = new Course();
        instance.insert(student, position);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String id = "";
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        Course instance = new Course(studentList);
        instance.remove(new Student("Student7", "C0686", "Male", 3.33));
        studentList.remove(7);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        String gender = "";
        Course instance = new Course();
        Set<Student> expResult = null;
        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        String gender = "";
        Course instance = new Course();
        Map<String, Set<Student>> expResult = null;
        Map<String, Set<Student>> result = instance.getGradeMap(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetAllMethod() {
        Course noArg = new Course();
        boolean expResult = true;
        boolean result = false;
        if (noArg.getAll() == null) {
            result = true;
        }
        assertEquals(expResult, result);
    }
    /**
     * Test of testParamaterizedCourseMethod of the class Course.
     */
    public void testParameterizedCourseMethod() {
        Course instance = new Course(studentList);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
        
    }
}
