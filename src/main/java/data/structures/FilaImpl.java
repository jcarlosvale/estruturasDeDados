package data.structures;

public class FilaImpl<T> implements Fila<T>{

    private final T[] elements;
    private int front;
    private int rear;

    public FilaImpl(int size) {
        if (size <= 0)  throw new RuntimeException("Tamanho invalido " + size);
        elements = (T[]) new Object[size];
        front = -1;
        rear = -1;
    }

    @Override
    public void enqueue(T data) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T front() {
        if (isEmpty()) return null;
        else return elements[front];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return (front == -1) && (front == rear);
    }

    @Override
    public boolean isFull() {
        return front == rear;
    }
}
