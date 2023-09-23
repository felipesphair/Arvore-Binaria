import java.util.Random;

public class Main{

    public static void showTrunks(Trunk p) {
        if (p == null) {
            return;
        }

        showTrunks(p.prev);
        System.out.print(p.str);
    }

    public static void printTree(Node root, Trunk prev, boolean isLeft) {
        if (root == null) {
            return;
        }

        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);

        printTree(root.right, trunk, true);

        if (prev == null) {
            trunk.str = "———";
        } else if (isLeft) {
            trunk.str = ".———";
            prev_str = "   |";
        } else {
            trunk.str = "`———";
            prev.str = prev_str;
        }

        showTrunks(trunk);
        System.out.println(" " + root.info);

        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";

        printTree(root.left, trunk, false);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Tree tree = new Tree();

        // Inserir 10 números inteiros aleatórios na árvore
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100);
            insertRandomNumber(tree, randomNumber);
        }

        // Exibir a árvore binária
        System.out.println("ÁRVORE BINÁRIA:");
        printBinaryTree(tree);
    }

    public static void insertRandomNumber(Tree tree, int number) {
        System.out.print("Inserindo: " + number);
        tree.insert(number, tree.root);
        System.out.println();
    }

    public static void printBinaryTree(Tree tree) {
        printTree(tree.root, null, false);
    }
}