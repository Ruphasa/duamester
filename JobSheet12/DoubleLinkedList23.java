package JobSheet12;

/**
 * DoubleLinkedList23
 */
public class DoubleLinkedList23 {

    Node23 head;
    Node23 tail;
    int size;

    DoubleLinkedList23() {
        head = null;
        tail = null;  
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node23(null, item, jarak, null);
        } else {
            Node23 newNode = new Node23(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int getJarak(int index) {
        if (index < 0 || index >= size|| isEmpty()) {
            System.out.println("Nilai indeks di luar batas");
            return -1;
        }

        Node23 tmp = head;
        for (int i = 0; i < index; i++) {
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }
        return tmp.jarak;
    }

    void remove(int index) {
        Node23 current = head;
        while (current != null) {
            if (current.data== index) {
                if (current.prev!=null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next!=null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int j) {
        Node23 current = head;
        for (int i = 0; i < j; i++) {
            if (current.next != null) {
                current = current.next;
            }else {
                return -1;
            }
        }
        return current.data;
    }
}