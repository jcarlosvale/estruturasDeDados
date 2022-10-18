package data.structures;

public interface Fila<T> {

    void enqueue(T data);

    T dequeue();

    T front();

    int size();

    boolean isEmpty();

    boolean isFull();
}
