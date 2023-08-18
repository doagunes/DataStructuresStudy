package Queue;

public class Queue {

    int length;
    Node first;
    Node last;
    class Node{
        int value;
        Node next;
        public Node (int value){
            this.value = value;

        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    //sondan eklenir
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }else {
            last.next = newNode;
            last = newNode;

        }
        length++;
    }

    //baştan silinir
    public Node dequeue(){
        if(length == 0) return null;

        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        }else {

            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst(){
        System.out.println("First: " + first.value);
    }

    public void getLast(){
        System.out.println("Last: " + last.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }
}
