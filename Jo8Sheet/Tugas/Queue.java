package Jo8Sheet.Tugas;

public class Queue {
    Pembeli[] data;
    int head;
    int tail;
    int size;
    int max;

    Queue(int n) {
        max = n;
        data = new Pembeli[max];
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
            System.out.println("Elemen terdepan : " + data[head].nama + " " + data[head].noHP + " ");
        else
            System.out.println("Queue masih kosong");
    }

    void peekTail() {
        if (!isEmpty())
            System.out.println("Elemen terbelakang : " + data[head].nama + " " + data[head].noHP + " ");
        else
            System.out.println("Queue masih kosong");
    }

    void peekPosition(String cari){

    }
    void daftarPembeli() {
        if (isEmpty())
            System.out.println("Queue masih kosong");
        else {
            int i = head;
            while (i != tail) {
                System.out.print(data[head].nama + " " + data[head].noHP + " ");
                i = (i + 1) % max;
            }
            System.out.print(data[head].nama + " " + data[head].noHP + " " + " \n");
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    void enqueue(Pembeli dt) {
        if (isFull())
            System.out.println("Queue penuh");
        else {
            if (isEmpty()) {
                head = tail = 0;
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

    Pembeli dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty())
            System.out.println("Queue masih kosong");
        else {
            dt = data[head];
            size--;
            if (tail == max - 1)
                head = 0;
            else
                head++;
        }
        return dt;
    }
}
