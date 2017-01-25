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

    /**
     * Test testParameterizedCourseMethod
     */
    @Test
    public void testParameterizedCourseMethod() {
        Course instance = new Course(studentList);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);

    }

    /**
     * Test testAllOriginalStudentsMethod
     */
    @Test

    public void testInsertMethodWithValidData() {
        Course instance = new Course(studentList);
        Student std = new Student("Student8", "c0690", "male", 4.56);
        instance.insert(std, 8);
        studentList.add(8, std);
        List<Student> expResult = studentList;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);

    }

    /**
     * Test testInvalidStudentMethod
     */
    @Test

    public void testGetMethodByInvalidStudentId() {
        Course instance = new Course(studentList);
        Student expResult = null;
        Student result = instance.get("C0790");
        assertEquals(expResult, result);
    }

    /**
     * Test testNonCourseObjectMethod
     */
    @Test
    public void testEqualsMethodWithNonCourseObject() {
        Object obj = new Object();
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test testOrderMethod
     */
    @Test
    public void testToStringMethod() {
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
