/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.phoenix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0687988
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        Student instance = new Student("John", "c01", "Male", 2.75);
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        Student instance = new Student();
        instance.setName("John");
        String expResult = "John";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        Student instance = new Student("John", "c01", "Male", 2.75);
        String expResult = "c01";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        String expResult = "c02";
        Student instance = new Student();
        instance.setId("c02");
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        Student instance = new Student("John", "c01", "Male", 2.75);
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        String expResult = "Female";
        Student instance = new Student();
        instance.setGender("Female");
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        Student instance = new Student("John", "c01", "Male", 2.75);
        double expResult = 2.75;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        double expResult = 2.75;
        Student instance = new Student();
        instance.setGrade(2.75);
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqualsWithNonStudentObject() {
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqualsStudentWithSameIdAndName() {
        Student student1 = new Student("Mark", "c01", "Male", 2.75);
        Student student2 = new Student("Mark", "c01", "Male", 2.75);
        boolean expResult = true;
        boolean result = student1.equals(student2);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqualsStudentWithSameIdAndDifferentName() {
        Student student1 = new Student("Mark", "c01", "Male", 2.75);
        Student student2 = new Student("Muller", "c01", "Male", 2.75);
        boolean expResult = false;
        boolean result = student1.equals(student2);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEqualsStudentWithDifferentIdAndName() {
        Student student1 = new Student("Mark", "c01", "Male", 2.75);
        Student student2 = new Student("Muller", "c02", "Male", 2.75);
        boolean expResult = false;
        boolean result = student1.equals(student2);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToStringWithInitializedObject() {
        Student student = new Student("Mark", "c01", "Male", 2.75);
        String expResult = "{ \"name\" : \"Mark\", \"id\" : \"c01\", \"gender\" : \"Male\", \"grade\" : 2.75 }";
        String result = student.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testStudentDefaultConstructerObject() {
        Student emptyStudent = new Student();
        boolean result = false;
        boolean expResult = true;
        if (emptyStudent.getName() == null && emptyStudent.getId() == null && emptyStudent.getGender() == null && emptyStudent.getGrade() == 0) {
            result = true;
        }
        assertEquals(expResult, result);

    }

    @Test
    public void testStudentParameterizedConstructerObject() {
        Student firstStudent = new Student("name1", "id1", "male", 3.2);
        boolean result = false;
        boolean expResult = true;
        if (firstStudent.getName() == "name1" && firstStudent.getId() == "id1" && firstStudent.getGender() == "male" && firstStudent.getGrade() == 3.2) {
            result = true;
        }
        assertEquals(expResult, result);

    }

}
