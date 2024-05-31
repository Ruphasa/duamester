package JobCpulu.praktikum;

public class doubleLinkListMain {
    public static void main(String[] args) {
        //percobaan 1
        doubleLinkList dll = new doubleLinkList();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
        
        //percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");

        //percobaan 3
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===================================");
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst());
        System.out.println("Data awal pada Linked Lists adalah : " + dll.getLast());
        System.out.println("Data awal pada Linked Lists adalah : " + dll.get(1));
    }
}
