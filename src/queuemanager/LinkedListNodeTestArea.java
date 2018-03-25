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

/*Stores the data in Linked List and the next Node it points to*/

    public class LinkedListNodeTestArea<T> {

    private T item;
    private int priority;
    private LinkedListNodeTestArea<T> next;
    
    public LinkedListNodeTestArea(T item, int priority) {
        this.item = item;
        this.priority=priority;
    }
    public void setNext(LinkedListNodeTestArea<T> nextNode) {
	this.next = nextNode;
    }
    public T getItem() {
        return item;
    }
    
    public int getPriority() {
        return priority;
    }
    
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public void setItem(int priority) {
        this.priority = priority;
    }
    
    public LinkedListNodeTestArea<T> getNext() {
        return next;
    }

}
