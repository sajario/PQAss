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
            newNode = new LinkedListNode<>(item, priority);
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            newNode = new LinkedListNode<>(item, priority);
            newNode.setNext(this.head);
            this.head = newNode;
            this.head.getNext().setPreviousNode(head);
        }

    }
    
//     private int maxRecursion(){
//        if (head == null)
//                return 0;
//        return maxRecursion(head, head.getPriority());
//
//        }
//     
//        private int maxRecursion(LinkedListNode<T> node, int max)
//
//        {
//            if (node == null){
//                return max;
//            }
//            if (node.getPriority() > max){
//                max = node.getPriority();
//            }
//        return maxRecursion(node.getNext(), max);
//        }

    
    @Override
    public T head() throws QueueUnderflowException {
//        System.out.println("Max: "+maxRecursion());
        int size = 0;
        int i; 
        prioritymax = 0;
        if (isEmpty()){
            throw new QueueUnderflowException();
        }
        pointer = head;
        /*Traverses linked list and finds and retains max value with loop*/
        while (pointer != null) {   
            if (prioritymax <= pointer.getPriority()) {
                prioritymax = pointer.getPriority();
                newNode = pointer;
            }
            size++; 
            pointer = pointer.getNext(); 
            }
          return newNode.getItem();
    }    

    @Override
    public void remove() throws QueueUnderflowException {
       int size = 0;
        int i; 
        prioritymax = 0;
        pointer = head;
        if (isEmpty()){
            throw new QueueUnderflowException();
        }
        /*Traverses linked list and finds and retains max value with loop*/
        while (pointer != null) {   

            if (prioritymax <= pointer.getPriority()) {
                prioritymax = pointer.getPriority();
                newNode = pointer;
            }
            size++; 
            pointer = pointer.getNext(); 
            }
        
          newNode.getPrev().setNext(newNode.getNext());
       
          
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public String toString() {
        if (isEmpty()) {
            return "The queue is empty";
        } else {
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
}
