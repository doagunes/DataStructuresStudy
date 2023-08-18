package DoublyLinkedList;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        /*
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.append(6);

         */
        myDLL.printList();
        System.out.println("********");
        myDLL.printList();
        // System.out.println(myDLL.isPalindrome());
        /*
        myDLL.getHead();
        myDLL.getTail();
        myDLL.printList();
        System.out.println("*******");
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.printList();
        System.out.println("Remove: " + myDLL.removeLast().value);
        myDLL.prepend(1);
        myDLL.prepend(0);
        myDLL.printList();
        System.out.println("*********");
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(1).value);
        System.out.println(myDLL.get(2).value);
        System.out.println("*********");
        myDLL.set(0, 6);
        myDLL.set(1, 5);
        myDLL.printList();
        System.out.println("*********");
        myDLL.insert(2, 8);
        myDLL.insert(3, 9);
        myDLL.insert(4, 10);
        myDLL.insert(1, 7);
        myDLL.printList();
        //System.out.println("*********");
        //System.out.println(myDLL.remove(5).value);

        /*
        System.out.println("Remove: " + myDLL.removeFirst().value);
        System.out.println("Remove: " + myDLL.removeFirst().value);
        System.out.println("Remove: " + myDLL.removeFirst().value);



        System.out.println("*********");
        myDLL.swapFirstLast();
        myDLL.printList();
        System.out.println("**********");
        myDLL.printList();
        myDLL.getLength();

         */

    }
}