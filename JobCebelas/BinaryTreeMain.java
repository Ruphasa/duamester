package JobCebelas;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.println("InOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.println("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8 : ");
        bt.delete(8);
        System.out.println();
        System.out.println("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println();

        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast=6;

        bta.populateData(data, idxLast);

        System.out.println("InOrder Traversal : ");
        bta.traverseInOrder(0);
    }
}
