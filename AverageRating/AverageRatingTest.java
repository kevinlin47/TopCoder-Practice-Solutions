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
public class AverageRatingTest {
    
    public AverageRatingTest() {
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
     * Test of calculate method, of class AverageRating.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        int n4 = 1;
        int n5 = 1;
        AverageRating instance = new AverageRating();
        double expResult = 3.0;
        double result = instance.calculate(n1, n2, n3, n4, n5);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
