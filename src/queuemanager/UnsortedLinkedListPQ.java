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
public class UnsortedLinkedListPQ <T> implements PriorityQueue<T> {

    private LinkedListNode<T> head;
    private LinkedListNode<T> newNode;
    
    public UnsortedLinkedListPQ() {
        head = null;
        newNode = null;
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        newNode = new LinkedListNode<>(item, priority);
        newNode.setNext(this.head);
	this.head = newNode;
        /*Simply adds to the item without sort*/
        
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T head() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() throws QueueUnderflowException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
            String result = "[";
            LinkedListNode<T> pointer = this.head;
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
