package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    //inner class
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    //constructor
    public LinkedList(int value){

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public  LinkedList(){

    }

    //Bu kod, LinkedList üzerindeki düğümleri baştan başlayarak dolaşır ve
    // her bir düğümün değerini yazdırır.
    // Böylece, LinkedList'teki verileri sıralı bir şekilde görüntülemek için kullanılabilir.
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);//LinkedListin her düğümünün değerini yazdırır!!!
            temp = temp.next;//Geçici düğümün referansı, bir sonraki düğümün referansına (next) atanır.
        }
    }

    public void append(int value){//sona ekler
        Node newNode = new Node(value);
        if(head == null && tail == null){ // length == 0
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){//sonuncyu siler
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null && tail == null){ // length == 0
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;

    }

    /*
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        temp = temp.next;
        head = temp;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return pre;
    }

     */

    public Node removeFirst(){

        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return  temp;
    }

    public Node get(int index){

        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i<index;i++){

            temp = temp.next;

        }
        return temp;
    }


    public boolean set(int index, int value){

        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }else {
            return false;
        }
    }

/*
    public void set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            System.out.println(temp.value);
        }else {
            System.out.println("there is no node in");
        }
    }

 */

    public boolean insert(int index, int value){
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }else {
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;

        }
    }

    public Node remove(int index){
        if(index<0 || index>=length) return null;
        if(index == 0) return removeFirst();
        if(index == length-1) return removeLast();

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    /*
    public Node remove(int index){
        Node temp = get(index - 1);
        Node temp2 = get(index);
        if(index < 0 || index >= length) return null;

        if(index == 0){
           return removeFirst();
        } else if (index == length-1) {
            return removeLast();
        }else{
            temp.next = temp2.next;
            length--;
        }
        return temp2;

    }

     */

    public void reverse(){

        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i = 0;i < length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        printList();
    }

    //LeetCode Exercise
    public Node findMiddleNode(){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){

            /*
            for(int i=0;i<2;i++){
                fast = fast.next;
            }

             */
            fast = fast.next.next;
            if(fast != null){
                slow = slow.next;
            }

        }
        return slow;
    }

    //LeetCode Exercise
    public boolean hasLoop(){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    //LeetCode Exercise
    public Node findKthFromEnd(int k){
        Node temp = head;
        Node temp2 = head;
        int counter = 1;
        while(temp != null && temp.next != null){
            counter++;
            temp = temp.next;
        }
        if(counter < k){
            return null;
        }

        for(int i=0;i<counter-k;i++){
            temp2 = temp2.next;
        }

        return temp2;

    }

    //LeetCode Exercise
    public void reverseBetween(int m, int n) {
        Node temp = head;
        Node after = temp.next;
        Node before = null;
        for(int i = 0;i < m;i++){
            after = temp.next;
            before = temp;
            temp = after;
        }
        for(int j = 0;j < n-m;j++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        printList();
    }

    //LeetCode Exercise
    public void partitionList(int x){
        if(head == null) return;
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;

        Node current = head;

        while(current != null){
            if(current.value < x){
                prev1.next = current;
                prev1 = current;
            }else{
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
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
}
