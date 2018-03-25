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

    public class LinkedListNode<T> {

    private T item;
    private int priority;
    private LinkedListNode<T> next;
    private LinkedListNode<T> prev;
    
    public LinkedListNode(T item, int priority) {
        this.item = item;
        this.priority=priority;
        this.next = null;
    }
    
    public LinkedListNode() {
        item = null;
        next = null;
    }
    
    public void setNext(LinkedListNode<T> nextNode) {
	this.next = nextNode;
    }
    
    public void setPreviousNode(LinkedListNode<T> prev) {
		this.prev = prev;
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
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public LinkedListNode<T> getNext() {
        return next;
    }
    public LinkedListNode<T> getPrev() {
        return prev;
    }

}
