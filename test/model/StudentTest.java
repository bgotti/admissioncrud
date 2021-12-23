/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import static sun.invoke.util.ValueConversions.ignore;
import java.util.List;

/**
 *
 * @author Brian
 */
public class StudentTest {
    
    
    public static StudentDAO dao;    
    
    @BeforeClass
    public static void setUpClass() {
     
        dao = new StudentDAO();
    }
    
    /**
     * testDisplayId method, of class Student.
     */
    @Test
    public void testDisplayId() {
        String expResult = "Kevin";
        String actual = dao.displayId("1").getFirstName();
        assertEquals(expResult, actual);             
    }
    //add
    
    @Test
    public void testAdd() {
        Student expResult = new Student();
        expResult.setId(3);
        expResult.setFirstName("Kevin");
        expResult.setLastName("Page");
        expResult.setGender("M");
        dao.add(expResult);
        String actual = dao.displayId("3").getFirstName();
        assertEquals("John", actual);             
    }
     
    //update
     @Test
    public void testUpdate() {
        Student expResult = new Student();
        expResult.setId(3);
        expResult.setFirstName("John");
        expResult.setLastName("Johnson");
        expResult.setGender("M");
        dao.update(expResult);
        String actual = dao.displayId("3").getLastName();
        assertEquals("Johnson", actual);             
    }
    
    @Test
    public void display() {
        List<Student> studentlist = dao.display();
        assertEquals(studentlist.size(), 3);
        
    }  
    
}
