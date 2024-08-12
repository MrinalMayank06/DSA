package stack;
/*
public class ReverseWordbyStack {
    static class Stack{
        private int maxsize;
        private char[] stackarray;
        private int top;

        public Stack(int size){
            this.maxsize= size;
            this.stackarray= new char[maxsize];
            this.top = -1;
        }
        public void push(char j){
            stackarray[++top] = j;
        }

public char pop(){
            return stackarray[top--];
}
public boolean isEmpty(){
            return (top == -1);
}
    }
    public static String reverseIndividualwords(String input){
        int length = input.length();
        Stack stack = new Stack(length);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i< length ;i++){
            char ch = input.charAt(i);

            if (ch != ' '){
                stack.push(ch);
            }else {
                while (!stack.isEmpty()){
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }


    public static void main(String[] args) {
String input ="Ahdag Iah Ut";
String output = reverseIndividualwords(input);

        System.out.println("Input:  "+ input);
        System.out.println("output: "+ output);
    }
}



*/












