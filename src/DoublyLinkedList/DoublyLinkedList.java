package DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }

    public  DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public DoublyLinkedList(){

    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }
    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }
    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void printList(){

        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){

        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;

    }

    public Node removeLast(){

        Node temp = tail;
        if(length == 0){
            return null;
        }
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){

        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            length++;
        }

    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0) return null;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;

    }

    //HOCANIN YAZDIĞI KOD AMA PROBLEM VAR
    /*
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

     */


    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        System.out.println("doga");
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }if (index == length-1) {
            return removeLast();
        }

        Node before = get(index-1);
        Node after = get(index).next;
        Node temp = get(index);

        temp.prev = null;
        temp.next = null;
        before.next = after;
        after.prev = before;

        /*
        //TEK DEĞİŞKEN İLE
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
         */

        length--;
        return temp;
    }

    //LEETCODE EXERCİSE
    public void swapFirstLast(){

        if(length >= 2){
            int temp = head.value;
            head.value = tail.value;
            tail.value = temp;
        }

    }



    //LEETCODE EXERCİSE
    public boolean isPalindrome(){

        boolean isPal = false;
        Node first = head;
        Node last = tail;
        for(int i = 0;i < length/2;i++){

            if(first.value == last.value){
                isPal = true;
                first = first.next;
                last = last.prev;
            }else{
                return false;
            }
            /*
            if (get(i).value == get(length-1-i).value){
                isPal = true;
            }else {
                return false;
            }

             */
        }
        return isPal;

    }


    //LEETCODE EXERCİSE

    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = temp.prev;
            temp.next = before;
            temp.prev = after;
            before = temp;
            temp = after;
        }

    }


}
