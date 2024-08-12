package linked_list;
class LinkedList{
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void printMiddle(){
        Node slow = head;
        Node fast = head;

        if (head != null){
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("The middle element is ["+slow.data+"] \n");
        }
    }

    public void append (int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = null;
        Node last = head;

        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }
public void printlist(){
        Node tnode =  head ;
        while (tnode != null){
            System.out.println(tnode.data+"-> " );
            tnode = tnode.next;
        }
    System.out.println("null");
}
}



 public class middle_node{
     public static void main(String[] args) {
         System.out.println("Print the Middle of the node");
         LinkedList linkedList = new LinkedList();
         for (int i = 1; i<= 70; i++){
             linkedList.append(i);
         }
         linkedList.printlist();
         linkedList.printMiddle();
     }
}