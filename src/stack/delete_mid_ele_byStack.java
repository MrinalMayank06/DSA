//package stack;
//
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class CustomStack {
//    private Node top;
//    private int size;
//
//    public CustomStack() {
//        this.top = null;
//        this.size = 0;
//    }
//
//    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.next = top;
//        top = newNode;
//        size++;
//    }
//
//    public int pop() {
//        if (top == null) {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        int data = top.data;
//        top = top.next;
//        size--;
//        return data;
//    }
//
//    public boolean isEmpty() {
//        return top == null;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void printStack() {
//        Node temp = top;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public void deleteMiddle() {
//        if (top == null) {
//            return;
//        }
//        int middleIndex = size / 2;
//        deleteMiddleHelper(middleIndex);
//    }
//
//    private void deleteMiddleHelper(int currentIndex) {
//        if (top == null) {
//            return;
//        }
//
//        int topData = pop();
//
//        deleteMiddleHelper(currentIndex - 1);
//
//        if (currentIndex != 0) {
//            push(topData);
//        }
//    }
//}
//
//public class delete_mid_ele_byStack {
//    public static void main(String[] args) {
//        CustomStack s = new CustomStack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        s.push(6);
//        s.push(7);
//        s.push(8);
//        s.push(9);
//        s.push(10);
//
//        System.out.println("Original stack: ");
//        s.printStack();
//
//        s.deleteMiddle();
//
//        System.out.println("Stack after deleting middle element: ");
//        s.printStack();
//
//        CustomStack ss = new CustomStack();
//        ss.push(1);
//        ss.push(2);
//        ss.push(3);
//        ss.push(4);
//        ss.push(5);
//        ss.push(6);
//        ss.push(7);
//        ss.push(8);
//        ss.push(9);
//
//
//        System.out.println("Original stack: ");
//        ss.printStack();
//
//        ss.deleteMiddle();
//
//        System.out.println("Stack after deleting middle element: ");
//        ss.printStack();
//    }
//}
//
//
