package Jo8Sheet.Praktikum1;

public class Queue {
    int[] data;
    int head;
    int tail;
    int size;
    int max;

    Queue(int n) {
        max = n;
        data = new int[max];
        head = tail = -1;
        size = 0;
    }

    boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    boolean isFull() {
        if (size == max)
            return true;
        else
            return false;
    }

    void peek() {
        if (!isEmpty())
            System.out.println("Elemen terdepan : " + data[head]);
        else
            System.out.println("Queue masih kosong");
    }

    void print() {
        if (isEmpty())
            System.out.println("Queue masih kosong");
        else {
            int i = head;
            while (i != tail) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    void clear() {
        if (!isEmpty()) {
            head = tail = -1;
            size = 0;
        } else
            System.out.println("Queue masih kosong");
    }

    void enqueue(int dt) {
        if (isFull())
            System.out.println("Queue penuh");
        else {
            if (isEmpty()) {
                head = tail = 0;
                data[tail] = dt;
                size++;
            } else {
                if (tail == max - 1)
                    tail = 0;
                else
                    tail++;
            }
        }
        data[tail] = dt;
        size++;
    }

    int dequeue() {
        int dt = -1;
        if (isEmpty())
            System.out.println("Queue masih kosong");
        else {
            dt = data[head];
            size--;
            if (head == max - 1)
                head = 0;
            else
                head++;
        }
        return dt;
    }
}
