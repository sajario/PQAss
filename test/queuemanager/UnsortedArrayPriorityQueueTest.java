/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

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
public class UnsortedArrayPriorityQueueTest extends PriorityQueueTest {
    
    public UnsortedArrayPriorityQueueTest() {
    }
    
    @Before
    @Override
    public void setUp() {
        instance = new UnsortedArrayPriorityQueue<>(8);
    }
    
    /**
    * I am using these methods to test the functions but also toString() as that
    * is what is used for the assertEquals conditions
    */
    
    /**
     * Test of add method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("\ntestAdd:  Adding Elements to the unsorted array");
        instance = new UnsortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        String expResult = "[(Jill, 1), (Rizwan, 3), (Hugh, 2)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("\ntestRemove: Removing Person with the highest priority");
        instance = new UnsortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        String result = instance.toString();
        System.out.println("Starting Array:   "+result);
        instance.remove();
        System.out.println("Removing Rizwan with priority 3");
        String expResult = "[(Jill, 1), (Hugh, 2)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testRemoveEq() throws Exception {
        System.out.println("\ntestRemoveEq: Test where there is equal priorities and will remove the person who was added first");
        instance = new UnsortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Karen");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        String result = instance.toString();
        System.out.println("Starting Array:   "+result);
        instance.remove();
        System.out.println("Removing Rizwan with priority 3");
        String expResult = "[(Jill, 1), (Hugh, 2), (Karen, 3)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of head method, of class UnsortedArrayPriorityQueue.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("\ntestHead: Recalling the head of the queue");
        instance = new UnsortedArrayPriorityQueue<>(8);
        Person item = new Person("Jill");
        int priority = 1;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        String expResult = "Rizwan";
        String result = instance.head().getName();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }
    
}
