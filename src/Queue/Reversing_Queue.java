package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Reversing_Queue {
    public static void reverseQueue(Queue<Integer> q)
    {
        if (q.isEmpty()){
            return;
        }
        int front = q.remove();
        reverseQueue(q);

        q.add(front);

    }
    public static void printQueue(Queue<Integer>q){
        for (Integer elem : q){
            System.out.print(elem +" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
Queue<Integer>q = new LinkedList<>();

int[] elements ={99,98,97,96,95,94,93,92,91};
for (int elem: elements){
    q.add(elem);
}
        System.out.println("Original Queue: ");
printQueue(q);

reverseQueue(q);
        System.out.println("Reversed Queue: ");
        printQueue(q);
    }
}











