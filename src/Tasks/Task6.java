package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println("Array before the deletion:");
        System.out.print(Arrays.toString(arr)+"\n");
        int N;
        System.out.println("Number to delete: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = deleteFromArray(arr,N);
        System.out.println("Array after the deletion:");
        System.out.print(Arrays.toString(arr));
    }
    private static int[] deleteFromArray(int[] arr, int num){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i:arr) {
            if(i!=num) result.add(i);
        }

        int[] ret = new int[result.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
