/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import queuemanager.SortedLinkedListPQ;
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
public class SortedLinkedListPQTest {
    
    public SortedLinkedListPQTest() {
    }
        /**
     * Test of add method, of class SortedLinkedListPQ.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("\ntestAdd:  Adding Elements to the Sorted Linked List");
        Object item = "Jill";
        int priority = 1;
        SortedLinkedListPQ instance = new SortedLinkedListPQ();
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        String expResult = "[(Rizwan, 3), (Hugh, 2), (Jill, 1)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   

    /**
     * Test of head method, of class SortedLinkedListPQ.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("\ntestHead: Recalling the head of the queue");
        Object item = new Person("Jill");
        int priority = 1;
        SortedLinkedListPQ instance = new SortedLinkedListPQ();
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 3;
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        item = new Person("Hugh");
        priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.toString() + " with priority " + priority);
        String expResult = "Rizwan";
        String result = instance.head().toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class SortedLinkedListPQ.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("\ntestRemove: Removing Person with the highest priority");
        SortedLinkedListPQ instance = new SortedLinkedListPQ();
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
        String expResult = "[(Hugh, 2), (Jill, 1)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }

    @Test
    public void testRemoveEq() throws Exception {
        System.out.println("\ntestRemoveEq: Test where there is equal priorities and will remove the person who was added first");
        SortedLinkedListPQ instance = new SortedLinkedListPQ();
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
        String expResult = "[(Karen, 3), (Hugh, 2), (Jill, 1)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
    }
    /**
     * Test of isEmpty method, of class SortedLinkedListPQ.
     */
    @Test
    public void testIsEmpty() throws Exception{
        System.out.println("isEmpty");
        SortedLinkedListPQ instance = new SortedLinkedListPQ();
        System.out.println("add");
        Object item = "Jill";
        int priority = 0;
        instance.add(item, priority);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    
}
