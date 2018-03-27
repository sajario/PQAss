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
    private LinkedListNode<T> pointer;
    private int prioritymax=0;
    
    public UnsortedLinkedListPQ() {
        head = null;
        newNode = null;
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        /*Simply adds to the head item without sort*/
        if (isEmpty()) {
            this.head = new LinkedListNode<>(item, priority);
        } else {
            newNode = new LinkedListNode<>(item, priority);
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;           
        }

    }
    
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()){
            throw new QueueUnderflowException();
        }
        pointer = head;
        /*Traverses linked list recursively and finds head of the queue*/
        newNode = findMax(pointer,pointer.getNext());
        return newNode.getItem();
    }    

    public LinkedListNode<T> findMax(LinkedListNode<T> first, LinkedListNode<T> second) {
    if (first == null || second == null){
        return first;
    } else {
        /*Checks the priority of first and second node, 
        *if the first node is greater then send first node and second.getnext back into the function
        *if the second node is greater then send second node and second.getnext back into the function
        */
        return findMax(first.getPriority() > second.getPriority() ? first : second, second.getNext());
    }
    
}
    
    @Override
    public void remove() throws QueueUnderflowException {

        if (isEmpty()){
            throw new QueueUnderflowException();
        }
        pointer = head;
        /*Traverses linked list recursively and finds head of the queue*/
        newNode = findMax(pointer,pointer.getNext());
       
        if (newNode.getPrev() == null && newNode.getNext() == null){head = null;}          
        if (newNode.getPrev() != null && newNode.getNext() != null){
            /*Sets the max node's previous node's next node to the max node's next node property in order to close the chain forward */
            newNode.getPrev().setNext(newNode.getNext());
            /*Sets the max node's next node's previous node to the max node's previous node property in order to close the chain backwards*/
            newNode.getNext().setPrev(newNode.getPrev());
        }
        if (newNode.getPrev() != null && newNode.getNext() == null){
            /*Sets the max node's previous node's next node to the max node's next node property in order to close the chain forward */
            newNode.getPrev().setNext(newNode.getNext());
        }
        if (newNode.getPrev() == null && newNode.getNext() != null){
            /*In this instance it can only be the head so the head so the new head will be the next node and its previous property must be null*/
            head =newNode.getNext();
            head.setPrev(null);
        }
          
          
          
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    public String toString() {
//    public void toString(LinkedListNode<T> node) {
        if (isEmpty()) {
            return "The queue is empty";
        } else {
            String result = "[";
            result += printLL(head);
            result += "]";
            return result;
        }
    }
    
    public String printLL(LinkedListNode<T> node) {
        /*Recursion Version of Printing Linked List*/
        if (node != null) {
            String rPrint = ("("+node.getItem() +", "+ node.getPriority()+")");
            if (node.getNext()==null) {
                    printLL(node.getNext());
                   return rPrint;
                } else {
                    rPrint += (", ")+ printLL( node.getNext());
                   return rPrint;
                }
        }         
        return "";
    }
    
}
