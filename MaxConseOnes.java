import java.util.Scanner;

public class MaxConseOnes {

    static int maxones(int[] num, int k) {
        int max = 0, l = 0, count = 0;
        for (int r = 0; r < num.length; r++) {
            if (num[r] == 0) {
                count++;
            }
            while (count > k) {
                if (num[l] == 0) {
                    count--;
                }
                l++;
            }
            max = Math.max(max, (r - l + 1));
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(maxones(num, k));
        sc.close();
    }
}
