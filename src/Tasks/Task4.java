package Tasks;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args){
        final int LOWER_BOUND = 2;
        final int UPPER_BOUND = 100;
        System.out.printf("Here are the primes from %d to %d: ", LOWER_BOUND, UPPER_BOUND);
        System.out.println(primes(LOWER_BOUND,UPPER_BOUND).toString());
    }

    private static ArrayList<Integer> primes(int from, int to){
        ArrayList<Integer> p = new ArrayList<>();
        boolean flag;
        for(int i = from; i < to; i++) {
            flag = true;
            // Check if it is divisible by any known prime
            for (int n: p) {
                if(i%n==0){
                    flag = false;
                    break;
                }
            }
            // If not - add to known primes
            if(flag) p.add(i);
        }
        return p;
    }

}
