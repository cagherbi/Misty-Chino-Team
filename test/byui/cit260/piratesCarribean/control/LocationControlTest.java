/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesCarribean.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Misty chino
 */
public class LocationControlTest {
    
    public LocationControlTest() {
    }

    /**
     * Test of calcDistance method, of class LocationControl.
     */
    @Test
    public void testCalcDistance() {
        System.out.println("calcDistance");
        /****************************
         *  Test case #1 passed
         ***************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double speedShip = 10.0;
        double timeTraveled = 7.0;
        
        double expResult = 70.0; // expected ouput return value
        
        // create instance of LocationControl  class
        LocationControl instance = new LocationControl();
        
        // call function to run test
        
        double result = instance.calcDistance(speedShip, timeTraveled);
        
        // campare excpected return value with actual value returned
        assertEquals(expResult, result, 1.0);
    
        /****************************
         *  Test case #2
         ***************************
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        double speedShip1 = 10.0;
        double timeTraveled1 = 2.0;
        
        double expResult1 = 20.0; // expected ouput return value
        
        // create instance of LocationControl  class
        LocationControl instance1 = new LocationControl();
        
        // call function to run test
        
        double result1 = instance1.calcDistance(speedShip1, timeTraveled1);
        
        // campare excpected return value with actual value returned
        assertEquals(expResult1, result, 1.0);
 
         /****************************
         *  Test case #3
         ***************************
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        double speedShip2 = 10.0;
        double timeTraveled2 = 4.0;
        
        double expResult2 = 40.0; // expected ouput return value
        
        // create instance of LocationControl  class
        LocationControl instance2 = new LocationControl();
        
        // call function to run test
        
        double result2 = instance2.calcDistance(speedShip2, timeTraveled2);
        
        // campare excpected return value with actual value returned
        assertEquals(expResult2, result, 1.0);
        */
    }
    
}
