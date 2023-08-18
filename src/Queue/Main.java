package Queue;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.print();
        System.out.println("*******");
        System.out.println("Remove: " + myQueue.dequeue().value);
        System.out.println("Remove: " + myQueue.dequeue().value);
        System.out.println("Remove: " + myQueue.dequeue().value);

    }
}