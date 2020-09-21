package Tasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // Find max, min and avg in an array of random real numbers in range [0,1]

        final int ARR_SIZE = 10;
        double[] arr = new double[ARR_SIZE];
        System.out.print("Generating an array: ");
        for(int i=0; i<ARR_SIZE; i++){
            arr[i] = Math.random();
        }
        System.out.println(Arrays.toString(arr));

        System.out.printf("Max in array: %.15f%n", max(arr,ARR_SIZE));
        System.out.printf("Min in array: %.15f%n", min(arr,ARR_SIZE));
        System.out.printf("Avg in array: %.15f", avg(arr,ARR_SIZE));
    }

    private static double max(double[] array, int size){
        double m = Double.MIN_VALUE;
        for (int i=0; i < size; i++){
            if(array[i]>m){
                m = array[i];
            }
        }
        return m;
    }

    private static double min(double[] array, int size){
        double m = Double.MAX_VALUE;
        for (int i=0; i < size; i++){
            if(array[i]<m){
                m = array[i];
            }
        }
        return m;
    }

    private static double avg(double[] array, int size){
        double sum = 0;
        for (int i=0; i < size; i++){
            sum += array[i];
        }
        return sum/((double)size);
    }
}
