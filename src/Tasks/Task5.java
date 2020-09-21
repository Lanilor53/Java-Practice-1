package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        int N;
        Scanner in = new Scanner(System.in);
        System.out.printf("Which Fibonacci number do you want: ");
        N = in.nextInt();
        System.out.printf("%dth Fibonacci number is %d!", N, fibonacci(N));
    }
    private static int fibonacci(int n){
        if(n<2) return n;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
}
