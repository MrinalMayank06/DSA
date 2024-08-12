//class Graph {
//    private int numVertices;
//    private Node[] adjList;
//
//    static class Node {
//        int vertex;
//        Node next;
//
//        Node(int vertex) {
//            this.vertex = vertex;
//            this.next = null;
//        }
//    }
//
//    // Constructor
//    public Graph(int numVertices) {
//        this.numVertices = numVertices;
//        adjList = new Node[numVertices];
//    }
//
//    public void addEdge(int src, int dest) {
//        Node newNode = new Node(dest);
//        newNode.next = adjList[src];
//        adjList[src] = newNode;
//
//        newNode = new Node(src);
//        newNode.next = adjList[dest];
//        adjList[dest] = newNode;
//    }
//
//    public void BFS(int startVertex) {
//        boolean[] visited = new boolean[numVertices];
//        Queue queue = new Queue(numVertices);
//
//        visited[startVertex] = true;
//        queue.enqueue(startVertex);
//
//        while (!queue.isEmpty()) {
//            int currentVertex = queue.dequeue();
//            System.out.print(currentVertex + " ");
//
//            Node temp = adjList[currentVertex];
//            while (temp != null) {
//                int adjVertex = temp.vertex;
//                if (!visited[adjVertex]) {
//                    visited[adjVertex] = true;
//                    queue.enqueue(adjVertex);
//                }
//                temp = temp.next;
//            }
//        }
//    }
//
//    // Custom Queue class
//    static class Queue {
//        private int front, rear, size;
//        private int capacity;
//        private int[] array;
//
//        public Queue(int capacity) {
//            this.capacity = capacity;
//            front = this.size = 0;
//            rear = capacity - 1;
//            array = new int[this.capacity];
//        }
//
//        public boolean isFull() {
//            return (size == capacity);
//        }
//
//        public boolean isEmpty() {
//            return (size == 0);
//        }
//
//        public void enqueue(int item) {
//            if (isFull())
//                return;
//            rear = (rear + 1) % capacity;
//            array[rear] = item;
//            size++;
//        }
//
//        public int dequeue() {
//            if (isEmpty())
//                return Integer.MIN_VALUE;
//            int item = array[front];
//            front = (front + 1) % capacity;
//            size--;
//            return item;
//        }
//    }
//}
//
//public class BFS_queue {
//    public static void main(String[] args) {
//        Graph g = new Graph(6);
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 3);
//        g.addEdge(2, 4);
//        g.addEdge(3, 4);
//        g.addEdge(3, 5);
//
//        System.out.println("Breadth First Traversal starting from vertex 0:");
//        g.BFS(0);
//    }
//}
