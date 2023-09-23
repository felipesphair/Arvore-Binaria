import java.util.Scanner;


public class Main {

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
        Scanner scanner = new Scanner(System.in);

        Tree tree = new Tree();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Procurar elemento");
            System.out.println("3. Remover elemento");
            System.out.println("4. Finalizar");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o número a ser inserido: ");
                    int number = scanner.nextInt();
                    insertRandomNumber(tree, number);
                    break;
                case 2:
                    System.out.print("Digite o número a ser procurado: ");
                    int searchNumber = scanner.nextInt();
                    boolean found = tree.search(searchNumber);
                    System.out.println("O número " + searchNumber + (found ? " foi encontrado" : " não foi encontrado"));
                    break;
                case 3:
                    System.out.print("Digite o número a ser removido: ");
                    int removeNumber = scanner.nextInt();
                    tree.remove(removeNumber);
                    System.out.println("O número " + removeNumber + " foi removido");
                    break;
                case 4:
                    scanner.close();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    printBinaryTree(tree);
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
            System.out.println();
            System.out.println();
            printBinaryTree(tree);
        }
    
    }

    public static void insertRandomNumber(Tree tree, int number) {
        System.out.print("Inserindo: ");
        tree.insert(number, tree.root);
        System.out.println();
    }

    public static void printBinaryTree(Tree tree) {
        printTree(tree.root, null, false);
    }
}
