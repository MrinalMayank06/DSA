package stack;

public class queueUsingStacks {
    static class stack{
        private int maxsize;
        private int[] stackarray;
        private int top;
        public stack(int size){
            this.maxsize=size;
            this.stackarray= new int[maxsize];
            this.top = -1;
        }
        public void push(int j){
            stackarray[++top] = j;
        }
        public int pop(){
            return stackarray[top--];
        }
        public boolean isEmpty(){
            return (top == -1);
        }
    }
    // queue class
    static class Queue{
        private stack stack1;
        private stack stack2;
        public Queue(int size){
            stack1 = new stack(size);
            stack2 = new stack(size);
        }
        public void enqeue(int value){
            stack1.push(value);
        }
        public int dequeue(){
            if (stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
        public boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
    public static void main(String[] args) {

Queue queue = new Queue(10);
queue.enqeue(1);
queue.enqeue(2);
queue.enqeue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqeue(4);
        queue.enqeue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}































