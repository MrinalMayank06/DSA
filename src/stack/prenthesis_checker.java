//package stack;
//
//class Stack {
//    private int maxSize;
//    private char[] stackArray;
//    private int top;
//
//    // Constructor to initialize the stack
//    public Stack(int size) {
//        this.maxSize = size;
//        this.stackArray = new char[maxSize];
//        this.top = -1;
//    }
//
//    // Method to push an element onto the stack
//    public void push(char value) {
//        if (top < maxSize - 1) {
//            stackArray[++top] = value;
//        }
//    }
//
//    // Method to pop an element from the stack
//    public char pop() {
//        if (top >= 0) {
//            return stackArray[top--];
//        }
//        return '\0'; // Return null character if stack is empty
//    }
//
//    // Method to peek the top element of the stack
//    public char peek() {
//        if (top >= 0) {
//            return stackArray[top];
//        }
//        return '\0'; // Return null character if stack is empty
//    }
//
//    // Method to check if the stack is empty
//    public boolean isEmpty() {
//        return top == -1;
//    }
//}
//
//public class  prenthesis_checker {
//    // Function to check if brackets are balanced
//    public static boolean areBracketsBalanced(String exp) {
//        // Initialize the stack with the length of the expression
//        Stack1 stack = new Stack1(exp.length());
//
//        // Traverse the expression
//        for (int i = 0; i < exp.length(); i++) {
//            char current = exp.charAt(i);
//
//            // If the character is an opening bracket, push it to the stack
//            if (current == '(' || current == '{' || current == '[') {
//                stack.push(current);
//            }
//            // If the character is a closing bracket
//            else if (current == ')' || current == '}' || current == ']') {
//                // If stack is empty, it means there is no opening bracket for this closing bracket
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                // Pop the top element from the stack
//                char topChar = stack.pop();
//                // Check if the popped element matches the current closing bracket
//                if ((current == ')' && topChar != '(') ||
//                        (current == '}' && topChar != '{') ||
//                        (current == ']' && topChar != '[')) {
//                    return false;
//                }
//            }
//        }
//
//        // If stack is empty, all opening brackets have matching closing brackets
//        return stack.isEmpty();
//    }
//
//    // Main method to test the function
//    public static void main(String[] args) {
//        String exp1 = "[()]{}{[()()]()}";
//        String exp2 = "[(])";
//
//        System.out.println("Expression: " + exp1);
//        if (areBracketsBalanced(exp1)) {
//            System.out.println("Output: Balanced");
//        } else {
//            System.out.println("Output: Not Balanced");
//        }
//
//        System.out.println("Expression: " + exp2);
//        if (areBracketsBalanced(exp2)) {
//            System.out.println("Output: Balanced");
//        } else {
//            System.out.println("Output: Not Balanced");
//        }
//    }
//}
//
