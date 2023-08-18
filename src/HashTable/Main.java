package HashTable;

public class Main {


        public static void main(String[] args) {


            HashTable myHashTable = new HashTable();
            myHashTable.printTable();

            System.out.println("***********");
            myHashTable.set("nails", 100);
            myHashTable.set("tile", 50);
            myHashTable.set("lumber", 80);

            myHashTable.set("bolts", 200);
            myHashTable.set("screws", 140);

            myHashTable.printTable();
            System.out.println("************");
            System.out.println(myHashTable.get("tile"));

            System.out.println(myHashTable.keys());

        /*
        char x = 'p';
        int ascii = x;
        System.out.println(ascii);

         */
        }
}
