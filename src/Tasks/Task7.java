package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,4,5,3,2,1};

        int N = findFirstUnique(arr);
        System.out.print(N);
    }
    private static int findFirstUnique(int[] arr){
        boolean isUnique;
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i==j) continue;
                if (arr[i]==arr[j]){
                        isUnique = false;
                        break;
                }
            }
            if (isUnique) return arr[i];
        }
        throw new ArrayIndexOutOfBoundsException("No unique elements found by findFirstUnique function!");
    }
}
