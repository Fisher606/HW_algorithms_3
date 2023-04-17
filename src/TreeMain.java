public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        // Поиск максимального элемента в дереве. Метод назвать findLast
        System.out.println("Largest element in the binary tree: " + tree.findLast(tree.root));

        // Подсчет листьев.
        System.out.println("Sum of all nodes of binary tree: " + tree.getChildrenCount(tree.root));

        //Проверка, является ли дерево сбалансированным.
        System.out.printf("Tree is balanced: " + Tree.isBalanced(tree.root));
    }
}