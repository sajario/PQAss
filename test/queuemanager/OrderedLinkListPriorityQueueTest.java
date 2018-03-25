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
public class OrderedLinkListPriorityQueueTest extends PriorityQueueTest {
    
    public OrderedLinkListPriorityQueueTest() {
    }
    
    @Before
    @Override
    public void setUp() {
        instance = new OrderedLinkListPriorityQueue<>();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class OrderedLinkListPriorityQueue.
     */
    @Test
    public void testAdd() throws QueueOverflowException {
        System.out.println("add");
        Person item = new Person("Jill");
        int priority = 1;
        assertEquals("Jill", item);
       // q.add(item, priority);
//        System.out.println("testAdd");
//        OrderedLinkListPriorityQueue instance = new OrderedLinkListPriorityQueue<>();
//        Person item = new Person("Jill");
//        int priority = 1;
//        instance.add(item, priority);
//        String expResult = "[(Rizwan, 3), (Hugh, 2), (Jill, 1)]";
//        String result = instance.toString();
//        System.out.println("Expected: "+expResult);
//        System.out.println("Actual: "+result);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of head method, of class OrderedLinkListPriorityQueue.
//     */
//    @Test
//    public void testHead() throws Exception {
//        System.out.println("head");
//        OrderedLinkListPriorityQueue instance = new OrderedLinkListPriorityQueue();
//        Object expResult = null;
//        Object result = instance.head();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class OrderedLinkListPriorityQueue.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        OrderedLinkListPriorityQueue instance = new OrderedLinkListPriorityQueue();
//        instance.remove();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isEmpty method, of class OrderedLinkListPriorityQueue.
//     */
//    @Test
//    public void testIsEmpty() {
//        System.out.println("isEmpty");
//        OrderedLinkListPriorityQueue instance = new OrderedLinkListPriorityQueue();
//        boolean expResult = false;
//        boolean result = instance.isEmpty();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class OrderedLinkListPriorityQueue.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        OrderedLinkListPriorityQueue instance = new OrderedLinkListPriorityQueue();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
