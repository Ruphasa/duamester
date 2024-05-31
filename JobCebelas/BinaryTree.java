package JobCebelas;

public class BinaryTree {
    Node root = null;
    int size;

    boolean isEmpty() {
        return root == null;
    }

    void add(int item) {
        if (isEmpty()) {
            root = new Node(null, item, null);
        } else {
            Node current = root;
            while (true) {
                if (item < current.data) {
                    if (current.left == null) {
                        current.left = new Node(null, item, null);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (item > current.data) {
                    if (current.right == null) {
                        current.right = new Node(null, item, null);
                        break;
                    } else {
                        current = current.right;
                    }
                } else
                    break;
            }
        }
    }

    boolean find(int item) {
        Node current = root;
        while (current != null) {
            if (item < current.data) {
                current = current.left;
            } else if (item > current.data) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int item) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;

        while (current.data != item) {
            if (current.data == item) {
                break;
            } else if (item < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (item > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Item not found!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
