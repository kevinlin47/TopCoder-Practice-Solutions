/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Lin
 */
public class BadExamTest {
    
    public BadExamTest() {
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
     * Test of newAverage method, of class BadExam.
     */
    @Test
    public void testNewAverage() {
        System.out.println("newAverage");
        int[] marks = {10,20,0,100};
        BadExam instance = new BadExam();
        double expResult = 32.5;
        double result = instance.newAverage(marks);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
