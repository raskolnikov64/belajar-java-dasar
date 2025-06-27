public class doublylinkedlist {

    Node head;

    static class Node {
        String nama;
        Node next;
        Node prev;

        Node (String x){
            nama = x;
            next = null;
            prev = null;
        }

    }

    public static void insertAtEnd(doublylinkedlist list, String x){
        Node newNode = new Node(x);

        if(list.head == null){
            list.head = newNode;
        } else {
            var temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
        }
    }

    public static void insertAtStart(doublylinkedlist list, String x){
        Node newNode = new Node(x);

        if(list.head == null){
            list.head = newNode;
        } else {
            newNode.next = list.head;
            list.head = newNode;
        }

    }

    public static void printList(doublylinkedlist list){
        Node temp = list.head;
        if(list.head == null){
            System.out.println("List is empty");
        } else {
            while(temp != null){
                if(temp.next == null){
                    System.out.printf("%s\n", temp.nama);
                } else {
                    System.out.printf("%s -> ", temp.nama);
                }
                temp = temp.next;
            }
        }
    }

    public static void extractEnd(doublylinkedlist list){
        Node temp = list.head;
        if(list.head == null){
            System.out.println("List is empty");
        } else {
            while(temp.next != null){
                temp = temp.next;
            }
            System.out.printf("%s", temp.nama);
            System.out.printf(" %s", temp.prev.nama);
        }
    }

    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();
        insertAtStart(list, "Joni Jostur");
        insertAtEnd(list, "Ini siapa jirr");
        printList(list);
        extractEnd(list);
    }


}
