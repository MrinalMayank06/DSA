package Queue;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode (int x ){
        val = x;
        left = null;
        right = null;
    }
}
class QueueNode{
    TreeNode node;
    int depth;

    QueueNode(TreeNode node,int depth){
        this.node =node;
        this.depth= depth;
    }
}
class Queue{
    private QueueNode[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;


    public Queue(int capacity){
        this.capacity = capacity;
        elements = new QueueNode[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public void enqueue(QueueNode node){
        if (size == capacity){
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1)%capacity;
        elements[rear] =node;
        size++;
    }
    public QueueNode dequeue(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        QueueNode node = elements[front];
        front = (front + 1)%capacity;
        size--;
        return node;
    }
}



public class min_depth_Binary_tree {
    public static int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        Queue queue = new Queue(1000);
        queue.enqueue(new QueueNode(root,1));

        while (!queue.isEmpty()){
            QueueNode current = queue.dequeue();
            TreeNode node = current.node;
            int depth = current.depth;

            if (node.left == null &&  node.right == null ){
                return depth;
            }
            if (node.left != null){
                queue.enqueue(new QueueNode(node.left,depth+1));
            }
            if (node.right != null){
                queue.enqueue(new QueueNode(node.right,depth+1));
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(" Find Minimum Depth of a Binary Tree ");
TreeNode root = new TreeNode(50);
root.left = new TreeNode(50);

        System.out.println("Minimum Depth: "+minDepth(root));
    }
}




















