package Tasks;

import java.util.*;

public class Task8 {
    public static void main(String[] args){
        final int ARR_SIZE = 100;
        int[] arr = randomIntArray(ARR_SIZE, 4);
        System.out.println("Here's your array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("K: ");
        int K;
        Scanner in = new Scanner(System.in);
        K = in.nextInt();
        HashMap<Integer, Integer> KFirst = findFirstKMostCommon(arr, K);
        System.out.printf("Here's first %d common numbers here:%n",K);
        System.out.print(KFirst.toString());
    }

    private static HashMap<Integer, Integer> findFirstKMostCommon(int[] arr, int K){
        if(K>arr.length) {
            throw new ArrayIndexOutOfBoundsException("K can't be more than the array size in findFirstKMostCommon!");
        }

        HashMap<Integer, Integer> stat = new HashMap<>();
        for (int i: arr) {
            if(stat.containsKey(i)){
                stat.replace(i,stat.get(i)+1);
            }else{
                stat.put(i,1);
            }
        }

        while(stat.size()>K){
            Map.Entry<Integer,Integer> min = null;
            for (Map.Entry<Integer,Integer> entry : stat.entrySet()) {
                if (min == null || entry.getValue().compareTo(min.getValue()) < 0) {
                    min = entry;
                }
            }
            stat.remove(min.getKey(),min.getValue());
        }

        return stat;
    }

    private static int[] randomIntArray(int size, int upperBound){
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt() % upperBound;
        }
        return arr;
    }
}

