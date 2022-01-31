public class QueueImplementationUsingArray {
    int size, cap;
    int[] array;

    QueueImplementationUsingArray(int c) {
        cap = c;
        size = 0;
        array = new int[cap];

    }

    void enque(int x) {
        if (isFull())
            return;
        array[size] = x;
        size++;

    }

    void deque() {
        if (isEmpty())
            return;
        for (int i = 0; i < size - 1; i++)
            array[i] = array[i + 1];

        size--;

    }

    int getFront() {
        if (isEmpty())
            return -1;
        return 0;

    }

    int getTail() {
        if (isEmpty())
            return -1;
        return size - 1;

    }

    boolean isFull() {
        return (size == cap);

    }

    boolean isEmpty() {
        return (size == 0);

    }

    void display() {
        if (isEmpty())
            return;

        if (!isEmpty() && getFront() == getTail())
            System.out.print(array[0]);

        for (int i = getFront(); i <= getTail(); i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        QueueImplementationUsingArray que = new QueueImplementationUsingArray(4);
        que.enque(10);
        que.enque(20);
        que.enque(30);
        que.deque();
        que.display();

    }
}