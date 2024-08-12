package Recursion;

public class print_1_to_n {
    public static void print_1_to_n(int current, int N){
        if (current> N){
            return;
        }
        System.out.print(current+" "+" ");
        print_1_to_n(current+1,N);
    }

    public static void main(String[] args) {
        int N = 100;
          print_1_to_n(1,N);
    }

}
