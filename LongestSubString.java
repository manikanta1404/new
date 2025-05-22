import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubString {

    static int substring(String s) {
        Set<Character> str = new HashSet<>();
        int n = s.length();
        int max = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {
            char cur = s.charAt(r);
            while (str.contains(cur)) {
                str.remove(s.charAt(l));
                l++;
            }
             str.add(cur);
            max = Math.max(max, (r - l + 1));

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(substring(s));
        sc.close();
    }
}
