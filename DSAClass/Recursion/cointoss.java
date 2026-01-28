package DSAClass.Recursion;

public class cointoss {
    public static void main(String[] args) {
        int n = 3;
        toss(n, 0, "");
    }
    static void toss(int n, int curr, String result) {
        if (curr == n) {
            System.out.println(result);
            return;
        }
        toss(n, curr + 1, result + "H");
        toss(n, curr + 1, result + "T");
    }
}
