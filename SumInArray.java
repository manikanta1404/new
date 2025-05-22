import java.util.Arrays;

public class SumInArray {

    static int[] sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i+1, j+1 };
                }
            }
        }
        return new int[] { 0 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 17;
        System.out.println(Arrays.toString(sum(arr, target)));
    }
}
