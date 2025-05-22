public class Majority {
    static int majority(int[] arr) {
        int j = 0;
        int count = 1;
        int target = 0;
        for (int i = 1; i < arr.length; i++) {
            target = arr[j];
            if (target == arr[i]) {
                count++;
            }
            if (target != arr[i]) {
                count--;
            }
            if (count == 0) {
                count = 1;
                j = i;
            }
        }
        if (count > 0) {
            return target;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 1, 1, 1, 3, 2, 2, 2, 1, 1, 1, 1 };
        System.out.println(majority(arr));
    }
}
