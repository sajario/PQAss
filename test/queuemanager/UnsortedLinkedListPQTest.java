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
public class UnsortedLinkedListPQTest {
    
    public UnsortedLinkedListPQTest() {
    }
        /**
     * Test of add method, of class UnsortedLinkedListPQ.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("\ntestAdd:  Adding Elements to the Linked List");
        Object item = "Jill";
        int priority = 1;
        UnsortedLinkedListPQ instance = new UnsortedLinkedListPQ();
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
        String expResult = "[(Hugh, 2), (Rizwan, 3), (Jill, 1)]";
        String result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   

    /**
     * Test of head method, of class UnsortedLinkedListPQ.
     */
    @Test
    public void testHead() throws Exception {
        System.out.println("\ntestHead: Recalling the head of the queue");
        Object item = new Person("Jill");
        int priority = 1;
        UnsortedLinkedListPQ instance = new UnsortedLinkedListPQ();
        instance.add(item, 1);
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
     * Test of remove method, of class UnsortedLinkedListPQ.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("\ntestRemove: Removing Person with the highest priority");
        UnsortedLinkedListPQ instance = new UnsortedLinkedListPQ();
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
        instance.remove();
        System.out.println("Removing Hugh with priority 2");
        expResult = "[(Jill, 1)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
    }

    @Test
    public void testRemoveEq() throws Exception {
        System.out.println("\ntestRemoveEq: Test where there is equal priorities and will remove the person who was added first");
        UnsortedLinkedListPQ instance = new UnsortedLinkedListPQ();
        Person item = new Person("Jill");
        int priority = 2;
        instance.add(item, priority);
        System.out.println("Adding " + item.getName() + " with priority " + priority);
        item = new Person("Rizwan");
        priority = 1;
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
        System.out.println("Starting Linked List:   "+result);
        instance.remove();
        System.out.println("Removing Karen with priority 3");
        String expResult = "[(Hugh, 2), (Rizwan, 1), (Jill, 2)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
        assertEquals(expResult, result);
        
        instance.remove();
        System.out.println("Removing Jill with priority 2");
        expResult = "[(Hugh, 2), (Rizwan, 1)]";
        result = instance.toString();
        System.out.println("Expected: "+expResult);
        System.out.println("Actual:   "+result);
    }
    /**
     * Test of isEmpty method, of class UnsortedLinkedListPQ.
     */
    @Test
    public void testIsEmpty() throws Exception{
        System.out.println("\nisEmpty");
        
        UnsortedLinkedListPQ instance = new UnsortedLinkedListPQ();
        System.out.println("Empty List");
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        Object item = "Jill";
        int priority = 0;
        instance.add(item, priority);
        System.out.println(instance.toString());
        System.out.println("NOT Empty List");
        expResult = false;
        result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    
}
