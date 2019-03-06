class Node {
    int data;
    Node next;
    Node previous;
}

 class DoublyLinkedList {
     Node head;
     int size;

     public static void main(String[] args) {
         DoublyLinkedList linkedList = new DoublyLinkedList();
         Node node = new Node();
         node.data = 4;
         node.next = null;
         node.previous = null;
         linkedList.insert(node);
     }

     void insert(Node node) {
         System.out.println("inserting node " + node.data + " at last");
         if (head == null) {
             head = node;
         } else {
             Node temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             node.previous = temp;
             temp.next = node;
         }
     }


     void delete() {
         if (head == null) {
             System.out.println("empty list");
         } else {
             Node temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             System.out.println("deleting node " + temp.data + " from last");
             temp = temp.previous;
             temp.next = null;
         }
     }

 }