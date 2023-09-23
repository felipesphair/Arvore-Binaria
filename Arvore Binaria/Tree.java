public class Tree{
    Node root = null;
    int size;

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
        } else if (info > place.info) {
            if (place.right == null) {
                System.out.print(" " + info);
                place.right = new Node(info);
            } else {
                insert(info, place.right);
            }
        }
    }
}