/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author Sara
 */
public class LLConstructorTest {
    
    public static void main(String[] args) throws QueueOverflowException {
        PriorityQueue<Person> q;
        System.out.println("add");
        q = new OrderedLinkListPriorityQueue<>();
        
        Person item = new Person("Jill");
        int priority = 1;
        q.add(item, priority);
        
    }
}
