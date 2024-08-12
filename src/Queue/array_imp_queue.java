//package Queue;
//
//class array_imp_queue{
//    private int[] arr;
//    private int front;
//    private int rear;
//    private int size;
//
//
//    public  array_imp_queue(int size){
//    this.size  = size;
//    arr = new int[size];
//    front =0;
//    rear =0;
//    }
//    public void enqueue(int element){
//        if (rear == size){
//            System.out.println("Overflow condition! Queue is full.");
//            return;
//        }
//        arr[rear] =element;
//        rear++;
//    }
//    public void dequeue(){
//        if (front == rear) {
//            System.out.println("Overflow condition! Queue is empty.");
//            return;
//        }
//            System.out.println("Dequeued Element: "+arr[front]);
//            for (int i =front;i< rear-1;i++){
//                arr[i] = arr[i+1];
//            }
//            rear--;
//        }
//        public int front(){
//        if (front== rear){
//            System.out.println("Queue is empty.");
//            return -1;
//        }
//        return arr[front];
//        }
//        public void display(){
//        if (front == rear){
//            System.out.println("Queue is empty.");
//            return;
//        }
//        for (int i = front;i<rear;i++){
//            System.out.print(arr[i]+" ");
//        }
//            System.out.println();
//    }
//    public static void main(String[] args) {
//array_imp_queue queue =new array_imp_queue(5);
//
//queue.enqueue(10);
//queue.enqueue(20);
//queue.enqueue(30);
//queue.enqueue(40);
//queue.enqueue(50);
//queue.enqueue(60);
//queue.enqueue(70);
//queue.enqueue(80);
//queue.enqueue(90);
//queue.enqueue(100);
//queue.enqueue(110);
//queue.enqueue(120);
//queue.enqueue(130);
//queue.enqueue(140);
//queue.enqueue(150);
//queue.enqueue(160);
//queue.enqueue(170);
//queue.enqueue(180);
//queue.enqueue(190);
//queue.enqueue(200);
//queue.enqueue(210);
//queue.enqueue(220);
//queue.enqueue(230);
//queue.enqueue(240);
//queue.enqueue(250);
//queue.enqueue(260);
//queue.enqueue(270);
//queue.enqueue(280);
//queue.enqueue(290);
//queue.enqueue(300);
//
//
//queue .display();
//
//        System.out.println("Front element: "+queue.front());
//
//        queue.dequeue();
//        queue.display();
//    }
//}
