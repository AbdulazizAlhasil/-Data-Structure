package Lab3;

public class ArrayStack<A> implements Stack<A> {
    private A[] data;
    static final int CAPACITY = 100;
    private int i = -1;

    public ArrayStack(int size) {
        data = (A[]) new Object[size];
    }

    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return this.i == -1;
    }

    @Override
    public int size() {
        return i + 1;
    }

    @Override
    public void push(A element) {
        if(this.data.length == this.size())
            throw new IllegalStateException("Sorry!! The Stack Is Full");

        this.data[++this.i] = element;
    }

    @Override
    public A pop() {
        if(this.isEmpty())
            return null;

        A deleted = this.data[this.i];
        this.i--;
        return deleted;
    }

    @Override
    public A top() {
        if(this.isEmpty()) return null;
        return this.data[this.i];
    }
}
