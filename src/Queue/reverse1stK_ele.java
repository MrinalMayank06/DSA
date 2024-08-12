//package Queue;
//class Queue{
//    private int[] elements;
//    private int front, rear, size, capacity;
//
//    public Queue(int capacity){
//        this.capacity=capacity;
//        elements = new int[capacity];
//        front = 0;
//        size=0;
//        rear = capacity -1;
//    }
//    public boolean isFull(){
//        return (size == capacity);
//    }
//    public boolean isEmpty(){
//        return (size == 0);
//    }
//    public void enqueue(int item) {
//        if (isFull())
//            return;
//        rear = (rear + 1)% capacity;
//        elements[rear]=item;
//        size = size +1;
//    }
//    public int dequeue(){
//        if (isEmpty())
//            return Integer.MIN_VALUE;
//        return elements[front];
//    }
//    public int size(){
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
//public class reverse1stK_ele {
//    public static void main(String[] args) {
//
//    }
//}
