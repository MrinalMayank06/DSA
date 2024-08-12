package Queue;

class Node{
    int data;
    int priority;
    Node next;

    public Node(int data, int priority){
        this.data= data;
        this.priority = priority;
        this.next = null;
    }
}
class PriorityQueue{
    private Node head;
    public PriorityQueue(){
        this.head = null;
    }
    public void push(int data, int priority){
        Node newnode = new Node(data,priority);

        if (head == null || head.priority< priority){
            newnode.next = head;
            head = newnode;
        }
        else {
            Node temp = head;
            while (temp.next != null && temp.next.priority >= priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next =newnode;
        }
    }
    public void pop() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        head = head.next;
    }
    public int peek() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty.");
        }
        return head.data;
    }
    public void printQueue() {
        Node temp = head;
        while (temp != null) {
            System.out.print("(" + temp.data + ", " + temp.priority + ") -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }





    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.push(10, 2);
        pq.push(20, 3);
        pq.push(30, 1);
        pq.push(40, 2);
        pq.push(50, 4);

        System.out.println("Queue:");
        pq.printQueue();

        System.out.println("Top element is " + pq.peek());

        pq.pop();
        System.out.println("Queue after pop:");
        pq.printQueue();

        System.out.println("Top element is " + pq.peek());
    }
}
