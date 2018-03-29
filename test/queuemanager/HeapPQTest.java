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
public class HeapPQTest{
    
    public HeapPQTest() {
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
    * I am using these methods to test the functions but also toString() as that
    * is what is used for the assertEquals conditions
    */
    
    /**
     * Test of add method, of class HeapPQ.
     */
    @Test
    public void testAdd() throws Exception {
        HeapPQ instance = new HeapPQ(15);
        System.out.println("\ntestAdd:  Adding Elements to the unsorted array");
        instance = new HeapPQ<>(15);
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
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("George");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Fred");
        priority = 5;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Leila");
        priority = 9;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Aqeela");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Grace");
        priority = 15;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Paulo");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Victor");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        String expResult = "[(Grace, 15), (Leila, 9), (Fred, 5), (Aqeela, 7), (Paulo, 7), (Hugh, 2), (George, 4), (Jill, 1), (Rizwan, 3), (Karen, 2), (Victor, 4)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of head method, of class HeapPQ.
     */
    @Test
    public void testHead() throws Exception {
        HeapPQ instance = new HeapPQ(15);
        System.out.println("\ntestAdd:  Adding Elements to the unsorted array");
        instance = new HeapPQ<>(15);
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
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("George");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Fred");
        priority = 5;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Leila");
        priority = 9;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Aqeela");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Grace");
        priority = 15;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Paulo");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Victor");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        instance.remove();
        System.out.println("Removing Head: "+instance.head().toString());
        String expResult = "Leila";
        String result = instance.head().toString();
        System.out.println("New Head Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class HeapPQ.
     */
    @Test
    public void testRemove() throws Exception {
        HeapPQ instance = new HeapPQ(15);
        System.out.println("\ntestAdd:  Adding Elements to the unsorted array");
        instance = new HeapPQ<>(15);
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
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("George");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Fred");
        priority = 5;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Leila");
        priority = 9;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Aqeela");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Grace");
        priority = 15;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Paulo");
        priority = 7;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Victor");
        priority = 4;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        System.out.println("Removing Head: "+instance.head().toString());
        instance.remove();
        String expResult = "Leila";
        String result = instance.head().toString();
        System.out.println("New Head Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
        
        expResult = "[(Leila, 9), (Paulo, 7), (Fred, 5), (Aqeela, 7), (Victor, 4), (Hugh, 2), (George, 4), (Jill, 1), (Rizwan, 3), (Karen, 2)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class HeapPQ.
     */
    @Test
    public void testIsEmpty() throws Exception {
        HeapPQ instance = new HeapPQ(15);
        System.out.println("\nEmpty List Test");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        System.out.println("\nNOT Empty List");
        Object item = "Jill";
        int priority = 3;
        instance.add(item, priority);
        System.out.println(instance.toString());
        
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    
}
