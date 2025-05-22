public class SubSequence {

    public static void main(String[] args) {
        String ip = "abc";
        subseq(ip, "");
    }

    static void subseq(String ip, String op) {
        if (ip.isEmpty()) {
            System.out.println(op);
            return;
        }
        char ch = ip.charAt(0);
        subseq(ip.substring(1), op + ch);
        subseq(ip.substring(1), op);
    }
}
