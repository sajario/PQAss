/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

import java.util.Arrays;

/**
 *
 * @author Sara
 */
public class HeapPQ <T> implements PriorityQueue<T>{

    private static final int children = 2;
    private int pointer = -1;
    private Object[] heap;
    
    
    public HeapPQ(int size) {
        this.heap = new Object[size];
    }
    
    private boolean fullCheck() {
        /*Checks if you are adding in over the defined heap size*/
        return pointer == heap.length-1;
    }
    
    
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        if (fullCheck()) {
            throw new QueueOverflowException();
        }
        this.heap[++pointer] = new PriorityItem<>(item, priority);
        bubbleUp(pointer);
    }

    private void bubbleUp(int heapChild) {
        /*Calculation to define parent node in order to check if it needs swapped*/
        int i = (heapChild-1)/2;
        /*recursively checks child node against its parent, swaps */
        if (i >= 0 && ((PriorityItem<T>)heap[i]).getPriority() < ((PriorityItem<T>)heap[heapChild]).getPriority()) {
            /*Puts parent item in placeholder, moves child to parent 
            position and puts old parent into the child position 
            and checks for parent again*/
            Object placeholder = heap[i];
            heap[i] = heap[heapChild];
            heap[heapChild] = placeholder;
            heapChild = i;
            bubbleUp(heapChild);
            
        }
    
    }
    
    
    private void bubbleDown(int index) {
    if (index <= pointer) {
        /*Assigns the location of the child elements*/
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int swapper;
        /*Checks to see if the left child within the heap as defined by the 
        pointer which is the last filled heap element, if there isn't we just end*/
        if (leftChild <= pointer) {
            /*Checks to see if the right child is a null value as pointer 
            is the last filled heap element*/
            if (rightChild > pointer){
                /*if there is no right child then put the left child into 
                placeholder to check swap*/
                swapper = leftChild;
            }          
            else {
                /*This means that there are both a left and right child so they 
                need to be compared to get the highest value to put into a 
                placeholder to check swap.  If they are the same the right child is used
                This is not ideal as this does not take into account of who got 
                added to the heap first if there are duplicate values*/
                swapper = (((PriorityItem<T>)heap[leftChild]).getPriority() > ((PriorityItem<T>)heap[rightChild]).getPriority()) ? leftChild : rightChild;
            }
            
            /*So now you know which element you are going to check for swapping 
            you compare it to the original element to see what priority is larger*/
            if (((PriorityItem<T>)heap[index]).getPriority() < ((PriorityItem<T>)heap[swapper]).getPriority()) {
                /*If the child node is larger then the parent item is put in the
                placeholder, moves child to parent position and puts old parent 
                into the child position*/
                Object placeholder = ((PriorityItem<T>)heap[index]);
                heap[index] = heap[swapper];
                heap[swapper] = placeholder;
            } else {
                /*if the child node it smaller then do nothing*/
                return;
            }
            /*Now the child becomes the one to check and we loop recursively again*/
            index = swapper;
            bubbleDown(index);
        }
    }
}
    
    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()){
            throw new QueueUnderflowException();
        }
        return ((PriorityItem<T>) heap[0]).getItem();
    }

    @Override
    public void remove() throws QueueUnderflowException {
        /*replaces last element to the root position and decrements the 
        pointer to show the number of heap values have decreased by 1*/
        heap[0] = heap[pointer--];
        /*removes value in the now extraneous element outside the number of heap values */
        heap[pointer+1] = null;
        /*Start swapping from root element*/
        bubbleDown(0);
    }

    @Override
    public boolean isEmpty() {
        return pointer < 0;
    }
    
    public String toString() {
        String result = "[";
        for (int i = 0; i <= pointer; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + heap[i];
        }
        result = result + "]";
        return result;
    }
    
}
