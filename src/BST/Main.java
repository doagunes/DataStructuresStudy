package BST;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println("Root: " + myBST.root);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);
        System.out.println(myBST.root.left.right.value);
        System.out.println(myBST.contains(27));

    }
}