package linked_list;/*
Initialize: Set a pointer current to the head of the list.
Traverse and Swap:
For each node, swap the next and prev pointers.
Move to the next node using the original prev pointer (which is now the next pointer after swapping).
Update Head: Set the head to the last node processed.
*/

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Doublylinkedlist{
    Node head;

    public void append(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next= newNode;
        newNode.prev = last;
    }

//    reversing
    public void reverse(){
        Node current = head;
        Node temp = null;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            if (current.prev == null){
                head = current;
            }
            current = current.prev;
        }
    }
    //head to end
    public void printlist(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Reverse_DoubleLL {
    public static void main(String[] args) {
        Doublylinkedlist dll = new Doublylinkedlist();
        System.out.println("Original List: 1 2 3 4 5 6 7 8 9 10 ");
        for (int i = 1; i <= 10; i++){
            dll.append(i);
        }
        dll.reverse();

        System.out.print("Reversed List: ");
        dll.printlist();


    }
}

