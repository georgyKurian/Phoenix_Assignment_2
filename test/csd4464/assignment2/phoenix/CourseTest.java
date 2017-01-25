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
     * Test of add method, of class Course.
     */
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
     * Test to add a new student to the list
     */
    @Test
    public void testAdd() {
        List<Student> stdList = new ArrayList<Student>();
        stdList.add(new Student("Student8", "C0687", "Female", 3.55));

        Course instance = new Course();
        instance.add(new Student("Student8", "C0687", "Female", 3.55));

        List<Student> expResult = stdList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method
     */
    @Test
    public void testGet() {
        Course instance = new Course(studentList);
        Student expResult = studentList.get(2);
        Student result = instance.get("C0682");
        assertEquals(expResult, result);
    }

    /**
     * Test for testLessThanOrEqualToGetMethod
     */
    @Test
    public void testLessThanOrEqualToGetMethod() {
        Course instance = new Course(studentList);
        Student expResult = null;
        Student result = instance.get(-1);
        assertEquals(expResult, result);
    }

    /*
    *Test for notEqualMethod
     */
    @Test
    public void testnotEqualsMethod() {
        Course instance = new Course(studentList);
        boolean expResult = false;
        Course instance1 = new Course();
        boolean result = instance.equals(instance1);
        assertEquals(expResult, result);
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

    @Test
    public void testGetGradeMapGet() {
        Course instance = new Course();
        instance.getGradeMap();
    }

    public void testParameterizedCourseMethod() {
        Course instance = new Course(studentList);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);

    }

    public void testAllOriginalStudentsMethod() {
        Course instance = new Course(studentList);
        Student std = new Student("Student8", "c0690", "male", 4.56);
        instance.insert(std, 8);
        studentList.add(8, std);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);

    }

    public void testinvalidstudentMethod() {
        Course instance = new Course(studentList);
        Student expResult = null;
        Student result = instance.get("C0790");
        assertEquals(expResult, result);
    }

    public void testNonCourseObjectMethod() {
        Object obj = new Object();
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    public void testOrder() {
        Course instance = new Course(studentList);
        String expResult = "[{\"gender\":\"Male\",\"grade\":3.53,\"name\":\"Student1\",\"id\":\"C0680\"},"
                + "{\"gender\":\"Male\",\"grade\":2.53,\"name\":\"Student2\",\"id\":\"C0681\"},"
                + "{\"gender\":\"Male\",\"grade\":3.04,\"name\":\"Student3\",\"id\":\"C0682\"},"
                + "{\"gender\":\"Female\",\"grade\":3.13,\"name\":\"Student4\",\"id\":\"C0683\"},"
                + "{\"gender\":\"Female\",\"grade\":2.23,\"name\":\"Student5\",\"id\":\"C0684\"},"
                + "{\"gender\":\"Male\",\"grade\":1.53,\"name\":\"Student6\",\"id\":\"C0685\"},"
                + "{\"gender\":\"Male\",\"grade\":3.52,\"name\":\"Student6\",\"id\":\"C0686\"},"
                + "{\"gender\":\"Male\",\"grade\":3.33,\"name\":\"Student7\",\"id\":\"C0686\"}]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
