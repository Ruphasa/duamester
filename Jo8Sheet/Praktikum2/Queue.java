package Jo8Sheet.Praktikum2;

public class Queue {
    Nasabah[] data;
    int head;
    int tail;
    int size;
    int max;

    Queue(int n) {
        max = n;
        data = new Nasabah[max];
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
            System.out.println("Elemen terdepan : " + data[head].norek + " " + data[head].nama + " " + data[head].alamat
                    + " " + data[head].umur + " " + data[head].saldo);
        else
            System.out.println("Queue masih kosong");
    }

    void peekTail() {
        if (!isEmpty())
            System.out.println("Elemen terbelakang : " + data[tail].norek + " " + data[tail].nama + " " + data[tail].alamat
                    + " " + data[tail].umur + " " + data[tail].saldo);
        else
            System.out.println("Queue masih kosong");
    }
    void print() {
        if (isEmpty())
            System.out.println("Queue masih kosong");
        else {
            int i = head;
            while (i != tail) {
                System.out.print(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo + " ");
                i = (i + 1) % max;
            }
            System.out.print(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " "
                        + data[i].saldo + " \n");
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

    void enqueue(Nasabah dt) {
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

    Nasabah dequeue() {
        Nasabah dt = new Nasabah();
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
