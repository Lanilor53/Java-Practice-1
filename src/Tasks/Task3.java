package Tasks;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        final int ARR_SIZE = 10;
        int[] arr = randomIntArray(ARR_SIZE);
        System.out.println("Generated an array: "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
    private static int[] randomIntArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }



    private static void bubbleSort(int[] arr){
        boolean flag = true;
        int buff;
        while(flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i+1]){
                    flag = true;
                    buff = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buff;
                }
            }
        }
    }
}