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
        while (index <= pointer) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild <= pointer) {
                    int childToSwap;
                    if (rightChild > pointer)
                            childToSwap = leftChild;
                    else
                            childToSwap = (((PriorityItem<T>)heap[leftChild]).getPriority() > ((PriorityItem<T>)heap[rightChild]).getPriority()) ? leftChild : rightChild;

                    if (((PriorityItem<T>)heap[index]).getPriority() < ((PriorityItem<T>)heap[childToSwap]).getPriority()) {
                            Object placeholder = ((PriorityItem<T>)heap[index]);
                            heap[index] = heap[childToSwap];
                            heap[childToSwap] = placeholder;
                    } else {
                            break;
                    }
                    index = childToSwap;
            } else {
                    break;
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
        Object result = heap[0];
        heap[0] = heap[pointer--];
        heap[pointer+1] = null;
        bubbleDown(0);
    }

    @Override
    public boolean isEmpty() {
        return pointer < 0;
    }
    
    public String toString() {
        String result = "[";
        for (int i = 0; i <= heap.length-1; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + heap[i];
        }
        result = result + "]";
        return result;
    }
    
}
