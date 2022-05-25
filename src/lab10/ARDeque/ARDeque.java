package lab10.ARDeque;

import java.util.Iterator;

public class ARDeque<T> implements Deque<T>, Iterable<T> {
    private T[] items;
    private int size;
    private int nextFirst;
    private int nextLast;

    /**
     * @return the size of the array used in the deque.
     */
    public int itemsLength() {
        return items.length;
    }

    /**
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // add your own helper methods here
    private int plusOne(int index){

        return (index+1)% items.length;

    }

    private int minusOne(int index){

        return (index-1+items.length)% items.length;
    }

    /* Resizes the underlying array to the target capacity. */
    @SuppressWarnings("unchecked")

    private void resize(int capacity) {
        T[] newArray=(T[])new Object[capacity];

        int curr =plusOne(nextFirst);
        for (int i = 0; i < size; i++) {

            newArray[i]=items[curr];
            curr=plusOne(curr);
        }
        items=newArray;
        nextFirst=capacity-1;
        nextLast=size;
    }





    // INCLUDE in your submission
    // if you use them in your method

    /*
     ***** HELPER METHODS END *****
     */


    // add your own ARDeque codes from previous labs
    public ARDeque() {
        items=(T[])new Object[4];
        size=0;
        nextFirst=2;
        nextLast=3;

    }

    @Override
    public void addLast(T item) {
        //if array is full double it
        if (size==items.length)
            resize(2*items.length);
        items[nextLast]=item;
        nextLast=plusOne(nextLast);
        size++;
    }

    @Override
    public void printDeque() {

        int first=plusOne(nextFirst);
        for (int i = 0; i < size; i++) {
            System.out.print(items[first]+ " ");
            first=plusOne(first);
        }
        System.out.println();

    }

    @Override
    public T get(int index) {
        if(size==0||index<0||index>=size)
            throw new IndexOutOfBoundsException("Index "+index+" is not valid");

        int realIndex=(plusOne(nextFirst)+index)%items.length;

        return items[realIndex];
    }

    @Override
    public void addFirst(T item) {
        if (size==items.length)
            resize(2*items.length);

        items[nextFirst]=item;
        nextFirst=minusOne(nextFirst);
        size++;


    }

    @Override
    public T delFirst() {
        if(size==0 )
            return null;

        int index = plusOne(nextFirst);
        T item = items[index];
        nextFirst=plusOne(nextFirst);
        size--;

        if(size<=items.length/4)
            resize((items.length/2));

        return item;



    }

    @Override
    public T delLast() {
        if(size==0 )
            return null;

        int index = (nextLast-1 +itemsLength())%itemsLength();
        T item = items[index];
        nextLast=(nextLast-1+itemsLength())%itemsLength();
        size--;

        if(size<=items.length/4)
            resize((items.length/2));

        return item;
    }

    // CODING ASSIGNMENT 10.3  ITERATOR

    /**
     * Make an iterator
     */
    @Override
    public Iterator <T> iterator(){
        return new ARDequeIterator();
    }

    private class ARDequeIterator implements Iterator<T> {
        int currentIndex;
        int firstIndex;

        public ARDequeIterator(){
            currentIndex=0;
            firstIndex=plusOne(nextFirst);
        }

        @Override
        public T next() {
            T item=items[firstIndex];
            firstIndex=plusOne(firstIndex);
            currentIndex++;
            return item;
        }

        @Override
        public boolean hasNext() {
            return currentIndex<size;
        }
    }
}