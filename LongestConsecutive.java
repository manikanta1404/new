import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    static int longc(int[] arr) {
        Set<Integer> values = new HashSet<>();
        for (int i : arr) {
            values.add(i);
        }

        int count = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!values.contains(arr[i] - 1)) {
                int val = arr[i];
                while (values.contains(val)) {
                    count++;
                    val++;
                }
                max = Math.max(max, count);
                count = 0;
            }

        }
        return max;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 101, 3, 102, 3, 103, 4, 1 };
        System.out.println(longc(arr));
    }
}