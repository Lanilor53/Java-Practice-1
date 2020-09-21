package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        // Find sum of 1**k + 2**k + ... + N**k for user N and k

        // Get user input
        Scanner in = new Scanner(System.in);
        int N = 0;
        while(N <= 0){
            System.out.print("N: ");
            // Crashes when input is not int
            N = in.nextInt();
            if(N <= 0){
                System.out.println("Wrong value!");
            }
        }
        System.out.print("k: ");
        int k = in.nextInt();

        // Find the sum
        double sum = 0; // can be non-int if k<1
        for (int i = 1; i < N+1; i++) {
            sum += Math.pow(i,k);
        }

        System.out.printf("The sum of the sequence is %f.", sum);
    }
}
