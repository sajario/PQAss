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
public class UnsortedArrayPriorityQueue<T> implements PriorityQueue<T>{

    private final Object[] storage;
    private final int capacity;
    private int tailIndex;
    private int prioritymax=0;
    private int prioritylocation=0;
    
    public UnsortedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            /* Simply adds into the next available array location */
            int i = tailIndex;
            storage[i] = new PriorityItem<>(item, priority);
        }
    }

    @Override
    public T head() throws QueueUnderflowException {
        /*Traverses through array for highest priority from tail to head*/
        
        int i; 
        prioritymax = 0;
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (i= tailIndex; i>-1;i--){
                if (prioritymax <= ((PriorityItem<T>) storage[i]).getPriority()) {
                    prioritymax = ((PriorityItem<T>) storage[i]).getPriority();
                    prioritylocation = i;
                }               
            }            
            return ((PriorityItem<T>) storage[prioritylocation]).getItem();
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
        /*Traverses the Array for the Max Priority*/
        int i;
        prioritymax = 0;
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            for (i = tailIndex; i>-1;i--){
                if (prioritymax <= ((PriorityItem<T>) storage[i]).getPriority()) {
                    prioritymax = ((PriorityItem<T>) storage[i]).getPriority();
                    prioritylocation = i;
                }               
            }  
            /*Loops through Array location starting from the Max Priority and 
            *having the location after replace the current one
            */
            while (prioritylocation <= tailIndex) {
                storage[prioritylocation] = storage[prioritylocation + 1];
                prioritylocation += 1;
            }
            tailIndex -= 1;
        }
    }

    @Override
    public boolean isEmpty() {
       return tailIndex < 0;
    }
    
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
    
}
