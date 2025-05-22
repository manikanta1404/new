import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    // static int[] sum(int[] arr, int target) {
    //     int i = 0, j = arr.length - 1;
    //     while (i < j) {
    //         int sum = arr[i] + arr[j];
    //         System.out.println(sum);
    //         if (sum == target) {
    //             return new int[] { i, j };
    //         } else if (sum > target) {
    //             i++;
    //         } else {
    //             j--;
    //         }
    //     }
    //     return new int[] { 0 };

    // }

    // static int sum(int[] arr, int target, int[] values){
    //      for (int i : arr) {
    //         int remain = target- i;
            
            
    //      }

    }

    public static void main(String[] args) {
        int[] arr = { 2,7,11,15 };
        int target = 9;
        // System.out.println(Arrays.toString(sum(arr, target)));

        Set <Integer> values = new HashSet<>();
        for (int i : arr) {

            values.add(i);

            int remain = target - i;
            if(values.contains(remain)){
                System.out.println(remain+" ," +i);
            }


        }


    }

