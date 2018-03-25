/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;
import java.util.LinkedList;
/**
 *
 * @author Sara
 */
public class OrderedLinkListPriorityQueueTestArea<T> implements PriorityQueue<T> {

    private LinkedListNodeTestArea<T> head;
    private LinkedListNodeTestArea<T> newNode;
    
    public OrderedLinkListPriorityQueueTestArea() {
        head=null;
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
    
        newNode = new LinkedListNodeTestArea<>(item, priority);
        /*Check to see if the head item is empty or the head priority and the new item priority should be swapped*/
	if (this.head == null || this.head.getPriority() < newNode.getPriority()) {
			newNode.setNext(this.head);
			this.head = newNode;
			return;
		}
        LinkedListNodeTestArea<T> pointer = this.head;
                /*Uses a pointer to traverse the linked list and checks whether 
                or not the next node is greater than the pointer*/
                
		while (pointer != null && pointer.getNext() != null && pointer.getNext().getPriority() >= newNode.getPriority()) {
			pointer = pointer.getNext();
		}
                /*when the relevant pointer has been found to make the 
                replacement you change the new nodes next property and 
                then the original node with the new node as next property*/
                
		newNode.setNext(pointer.getNext());
		pointer.setNext(newNode);	
        
    }

    @Override
    public T head() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        }
        head = head.getNext();
    }
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
            String result = "[";
            LinkedListNodeTestArea<T> pointer = this.head;
            while (pointer.getNext() != null) {   
                    result += "("+pointer.getItem() +", "+ pointer.getPriority()+"), " ;
                    pointer = pointer.getNext(); 
            }
            if (pointer.getNext() == null){
                    result += "("+pointer.getItem() +", "+ pointer.getPriority()+")" ;
                }
            result += "]";
            return result;
    }
}
