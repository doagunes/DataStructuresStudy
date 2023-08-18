package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        //LinkedList myLinkedList = new LinkedList();
        /*
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

         */
        myLinkedList.printList();

        myLinkedList.append(2);
        System.out.println("**********");
        myLinkedList.printList();
        myLinkedList.append(3);
        System.out.println("**********");
        myLinkedList.printList();

        System.out.println("Remove: " + myLinkedList.removeLast().value);
        System.out.println("**********");
        myLinkedList.printList();
        System.out.println("**********");

        myLinkedList.prepend(0);
        myLinkedList.prepend(10);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();


        /*
        System.out.println("Remove: " + myLinkedList.removeFirst().value);
        System.out.println("**********");
        myLinkedList.printList();

        System.out.println("Remove: " + myLinkedList.removeFirst().value);
        System.out.println("**********");
        myLinkedList.printList();

        System.out.println("Remove: " + myLinkedList.removeFirst().value);
        System.out.println("**********");
        myLinkedList.printList();

        System.out.println("Remove: " + myLinkedList.removeFirst());
        System.out.println("**********");
        myLinkedList.printList();

         */

        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.get(2).value);
        System.out.println(myLinkedList.get(3).value);
        myLinkedList.set(0, 20);
        //System.out.println(myLinkedList.get(0).value);
        System.out.println("*************");
        myLinkedList.printList();
        System.out.println("**************");
        myLinkedList.set(1, 30);
        //System.out.println(myLinkedList.get(1).value);
        System.out.println("**************");
        myLinkedList.printList();
        myLinkedList.getHead();
        System.out.println("**************");
        myLinkedList.insert(1, 40);
        myLinkedList.printList();
        System.out.println("**************");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("**************");
        myLinkedList.printList();
        System.out.println("**************");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("**************");
        myLinkedList.printList();
        System.out.println("**************");
        //myLinkedList.reverse();
        myLinkedList.insert(2, 60);
        myLinkedList.append(90);
        myLinkedList.prepend(100);
        myLinkedList.prepend(200);
        System.out.println("*************");
        myLinkedList.printList();
        System.out.println("*************");

        System.out.println(myLinkedList.findMiddleNode().value);
        System.out.println(myLinkedList.findKthFromEnd(8));
        System.out.println("************");
        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(1).value);






    }
}