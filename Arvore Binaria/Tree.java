public class Tree{
    Node root = null;
    int size;

    //Função de inserir um elemento da árvore
    void insert(int info, Node place) {
        if (place == null) {
            System.out.print(" " + info);
            root = new Node(info);
        } else if (info < place.info) {
            if (place.left == null) {
                System.out.print(" " + info);
                place.left = new Node(info);
            } else {
                insert(info, place.left);
            }
        } else if (info >= place.info) {
            if (place.right == null) {
                System.out.print(" " + info);
                place.right = new Node(info);
            } else {
                insert(info, place.right);
            }
        }
    }

    // Função para remover um elemento da árvore
    void remove(int info) {
        root = removeNode(root, info);
    }

    private Node removeNode(Node current, int info) {
        if (current == null) {
            return null;
        }

        if (info == current.info) {
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                int smallestValue = findSmallestValue(current.right);
                current.info = smallestValue;
                current.right = removeNode(current.right, smallestValue);
                return current;
            }
        }

        if (info < current.info) {
            current.left = removeNode(current.left, info);
            return current;
        }

        current.right = removeNode(current.right, info);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.info : findSmallestValue(root.left);
    }


    // Função para procurar um elemento na árvore
    boolean search(int info) {
        return searchNode(root, info);
    }

    private boolean searchNode(Node current, int info) {
        if (current == null) {
            return false;
        }

        if (info == current.info) {
            return true;
        }

        if (info < current.info) {
            return searchNode(current.left, info);
        }

        return searchNode(current.right, info);
    }
}