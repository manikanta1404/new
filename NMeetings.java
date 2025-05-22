import java.util.Arrays;
import java.util.Comparator;

public class NMeetings {

    public static void main(String[] args) {

        int[] starttime = { 3, 1, 5, 8, 2, 6 };
        int[] endtime = { 4, 2, 7, 9, 3, 8 };
        int[][] acti = new int[6][2];
        for (int i = 0; i < 6; i++) {
            acti[i][0] = starttime[i];
            acti[i][1] = endtime[i];
        }
        Arrays.sort(acti, Comparator.comparingInt(a -> a[1]));
        int count = 1, i = 0;
        int[][] res = new int[6][2];
        res[count - 1] = acti[i];
        for (int j = 1; j < 6; j++) {
            if (acti[i][1] < acti[j][0]) {
                count++;
                i = j;
                res[count - 1] = acti[i];
            }
        }

        System.out.println("total N-Meetings -> " + count);

        for (int k = 0; k < count; k++) {
            System.out.println(Arrays.toString(res[k]));
        }
    }
}