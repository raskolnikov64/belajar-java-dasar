public class linkedlist {

    Node head;

    static class Node {
        int data;
        Node next;

        Node (int x){
            data = x;
            next = null;
        }
    }

    public static void insertAtEnd(linkedlist list, int x){
        Node newNode = new Node(x);

        if(list.head == null){
            list.head = newNode;
        } else {
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }


    }

    public static void printList(linkedlist list){
        Node temp = list.head;

        if(temp == null){
            System.out.println("List is empty!");
        } else {
            while(temp != null){
                if(temp.next == null){
                    System.out.printf("%d", temp.data);
                } else {
                    System.out.printf("%d -> ", temp.data);
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertAtEnd(list, 2);
        list.insertAtEnd(list, 3);
        list.insertAtEnd(list, 9);
        printList(list);
    }

}

