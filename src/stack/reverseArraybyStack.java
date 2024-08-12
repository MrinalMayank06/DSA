//package stack;
//
//public class reverseArraybyStack {
//
//    static class Stack {
//        private int top;
//        private int[] elements;
//        private int capacity;
//
//        public Stack(int size) {
//            capacity = size;
//            elements = new int[capacity];
//            top = -1;
//        }
//
//        public void push(int element) {
//            if (top == capacity - 1) {
//                throw new RuntimeException("Stack Overflow");
//            }
//            elements[++top] = element;
//        }
//
//        public int pop() {
//            if (top == -1) {
//                throw new RuntimeException("Stack Underflow");
//            }
//            return elements[top--];
//        }
//
//        public boolean isEmpty() {
//            return top == -1;
//        }
//    }
//
//    public static void reverseArraybyStack(int[] arr) {
//        Stack stack = new Stack(arr.length);
//
//        // Push elements onto the stack
//        for (int num : arr) {
//            stack.push(num);
//        }
//
//        // Pop elements from the stack and put them back into the array
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = stack.pop();
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Reverse the array by Stack -> ");
//
//        // Test case 1
//        int[] arr1 = {10, 20, 30, 40, 50};
//        reverseArraybyStack(arr1);
//        System.out.print("Reversed array: ");
//        for (int num : arr1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        // Test case 2
//        int[] arr2 = {1};
//        reverseArraybyStack(arr2);
//        System.out.print("Reversed array: ");
//        for (int num : arr2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//}


