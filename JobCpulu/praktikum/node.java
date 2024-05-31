package JobCpulu.praktikum;

public class node {
    int data;
    node next;
    node prev;
    public node(node prev, int data, node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
