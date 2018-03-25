/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import queuemanager.Person;
import queuemanager.SortedArrayPriorityQueue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sara
 */
public class SortedArrayPriorityQueueTest extends PriorityQueueTest{
    
    public SortedArrayPriorityQueueTest() {
    }
    
    /**
    * I am using these methods to test the functions but also toString() as that
    * is what is used for the assertEquals conditions
    */

    @Before
    @Override
    public void setUp() {
        instance = new SortedArrayPriorityQueue<>(8);
    }
    
    /**
     * Test of add method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("testAdd");
        instance = new SortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        String expResult = "[(Rizwan, 3), (Hugh, 2), (Jill, 1)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual: "+result);
        assertEquals(expResult, result);
    }

    
    /**
     * Test of remove method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("testRemove");
        instance = new SortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        instance.remove();
        String expResult = "[(Hugh, 2), (Jill, 1)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual: "+result);
        assertEquals(expResult, result);

    }
    
    /**
     * Test of head method, of class SortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("testHead");
        instance = new SortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        String expResult = "Rizwan";
        String result = instance.head().getName();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual: "+result);
        assertEquals(expResult, result);
    }
    
    
    
}
