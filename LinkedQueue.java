public class LinkedQueue <E> implements Queue<E>{

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E front() {
        return list.first();
    }
}
