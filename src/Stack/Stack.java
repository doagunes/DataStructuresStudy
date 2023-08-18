package Stack;

public class Stack {

    private Node top; //head
    int height;
    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    //başa eklenir
    public void push(int value){

        Node newNode = new Node(value);
        if(top == null){
            top = newNode;

        }else{
            newNode.next = top;
            top = newNode;

        }
        height++;

    }

    //baştan silinir
    public  Node pop(){
        if(height == 0){
            return null;

        }if(height == 0){
            top = null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;

    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + height);
    }

}
