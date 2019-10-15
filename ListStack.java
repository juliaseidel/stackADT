package main;

import java.util.NoSuchElementException;

public class ListStack<E> implements Stack<E> {
    private SinglyLinkedList<E> data;

    public ListStack() {
        data = new SinglyLinkedList<>();
    }

    @Override
    public void push(E element) {
        data.addFirst(element);
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException("Stack empty");
        }
        E toRemove = data.getFirst();
        data.removeFirst();
        return toRemove;
    }

    @Override
    public E peek() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException("Stack empty");
        }
        return data.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return data.getSize() == 0;
    }

    @Override
    public int getSize() {
        if (!isEmpty()){
            return data.getSize();
        }
        return 0;
    }
}
