/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.medev.jeudedames;

import static java.lang.Math.sqrt;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class Point2DTest {
    
    public Point2DTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of distance method, of class Point2D.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        Point2D p = new Point2D(1,1);
        assertEquals(sqrt(2),p.distance(new Point2D(2,2)));
        p.setY(2);
        assertEquals(5,p.distance(new Point2D(4,6)));
    }
    
    
    
    
}
