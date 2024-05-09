package JobSheet_9;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else
            System.out.println("Linked List Kosong");
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        Node ndInput = new Node();
        if (index > 0) {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(input);
        } else
            System.out.println("Index tidak ada");
    }

    int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null)
            return index;
        else
            return -1;
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        } else
            System.out.println("Linked List Kosong");
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                Node tmp = head;
                while (tmp.next != tail) {
                    tmp = tmp.next;
                }
                tmp.next = null;
                tail = tmp.next;
            }
        } else
            System.out.println("Linked List Kosong");
    }

    void remove(int key) {
        if (!isEmpty()) {
            if (head.data == key) {
                removeFirst();
            } else {
                Node tmp = head;
                while (tmp != null) {
                    if (tmp.data==key) {
                        removeFirst();
                        break;
                    }else if (tmp.next.data == key) {
                        tmp.next = tmp.next.next;
                        if (tmp.next == null) {
                            tail = tmp;
                        }
                        break;
                    }
                    tmp = tmp.next;
                }
            }
        } else
            System.out.println("Linked List Kosong");
    }

    void removeAt(int index) {
        if (index==0) {
            removeFirst();
        }else{
            Node tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}
