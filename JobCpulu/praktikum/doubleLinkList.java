package JobCpulu.praktikum;

public class doubleLinkList {
    node head;
    int size;
    doubleLinkList() {
        
    }
    //percobaan 1
    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item) {
        if (isEmpty()) {
            head = new node(null, item, null);
        }else {
            node newNode = new node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        }else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            node newNode = new node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index) {
        if (isEmpty()) {
            addFirst(item);
        }else if (index<0 || index>size) {
            System.out.println("Index out of bounds");
        }else{
            node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.prev == null) {
                node newNode = new node(null, item, current);
                current.prev = newNode;
                head = newNode;
                size++;
            }else{
                node newNode = new node(current.prev, item, current.next);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
                size++;
            }
        }
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        }else {
            node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }
    }

    //percobaan 2
    void removeFirst() {
        if (!isEmpty()) {
            if (size==1) {
                removeLast();
            }else {
                head = head.next;
                head.prev = null;
                size--;
            }
        }else
            System.out.println("Linked List Kosong");
    }

    void removeLast() {
        if (!isEmpty()) {
            if (size==1) {
                removeFirst();
            }else {
                node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
                size--;
            }
        }else
            System.out.println("Linked List Kosong");
    }

    void remove(int index) {
        if (isEmpty()||index<0||index>=size) {
            System.out.println("Nilai indeks di luar batas");
        }else if (index==0) {
            removeFirst();
        }else{
            node current= head;
            int i=0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next==null) {
                current.prev.next=null;
            }else if (current.prev==null) {
                current=current.next;
                current.prev=null;
                head = current;
            }else {
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            size--  ;
        }
    }

    //percobaan 3
    int getFirst(){
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        }
        return head.data;
    }

    int getLast(){
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        }
        node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index){
        if (isEmpty()||index<0||index>=size) {
            System.out.println("Nilai indeks di luar batas");
        }
        node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
