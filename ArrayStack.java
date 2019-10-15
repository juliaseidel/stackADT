package main;

import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
    private E[] data;
    private int top;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
        top = 0;
    }

    @Override
    public void push(E element) throws ArrayIndexOutOfBoundsException{
        if (top==data.length){
            throw new ArrayIndexOutOfBoundsException("Stack is Full");
        }
        data[top] = element;
        top++;
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (top==0){
            throw new NoSuchElementException("Stack empty");
        }
        E toReturn = data[--top];
        data[top]=null;
        return toReturn;
    }

    @Override
    public E peek() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return data[top-1];
    }

    @Override
    public boolean isEmpty() {
        if (top==0){
            return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        if (!isEmpty()){
            return top;
        }
        return 0;
    }
}
