//package Queue;
//
//import com.sun.tools.javac.Main;
//
//class Node{
//    int data;
//    Node left,right;
//
//    public Node(int item){
//        data = item;
//        left =right = null;
//    }
//}
//
//class Queue {
//    private Node[] arr;
//    private int front, rear, capacity;
//
//    public Queue(int size) {
//        capacity = size;
//        arr = new Node[size];
//        front = rear = 0;
//    }
//
//    public void enqueue(Node node) {
//        if (rear == capacity) {
//            System.out.println("Queue is full");
//            return;
//        }
//        arr[rear++] = node;
//        rear++;
//    }
//
//    public Node dequeue() {
//        if (front == rear) {
//            System.out.println("Queue is empty");
//            return null;
//        }
//        return arr[front++];
//    }
//
//    public boolean isEmpty() {
//        return front == rear;
//    }
//}
//class BinaryTree{
//    Node root;
//
//    public void printLevelOrder(){
//        if (root == null){
//            return;
//        }
//        Queue queue = new Queue(100);
//        queue.enqueue(root);
//        queue.enqueue(null);
//
//        while (!queue.isEmpty()){
//            Node node = queue.dequeue();
//
//            if (node != null){
//                System.out.print(node.data+" ");
//                if (node.left != null){
//                    queue.enqueue(node.left);
//                }
//                if (node.right != null){
//                    queue.enqueue(node.right);
//                }
//            }
//            else {
//                System.out.print(" ");
//                if (!queue.isEmpty()){
//                    queue.enqueue(null);
//                }
//            }
//        }
//    }
//}
//
//
//public class traversal_order {
//    public static void main(String[] args) {
//BinaryTree tree = new BinaryTree();
//    tree.root =new Node(1);
//    tree.root.left =new Node(2);
//    tree.root.right =new Node(5);
//    tree.root.left.left =new Node(9);
//    tree.root.left.right =new Node(4);
//    tree.root.right.left =new Node(2);
//    tree.root.right.right =new Node(1);
//
//    tree.printLevelOrder();
//}
//}
