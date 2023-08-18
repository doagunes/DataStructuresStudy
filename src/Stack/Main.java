package Stack;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(2);

        myStack.printStack();
        myStack.getHeight();
        myStack.getTop();
        myStack.push(1);
        myStack.printStack();
        System.out.println("********");
        myStack.push(0);
        myStack.printStack();
        System.out.println("********");
        System.out.println("Remove: " + myStack.pop().value);
        System.out.println("Remove: " + myStack.pop().value);
        System.out.println("Remove: " + myStack.pop());
        myStack.printStack();
    }
}