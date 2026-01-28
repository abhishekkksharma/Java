package DSAClass.Recursion;

public class diceRoll {
    public static void main(String[] args) {
        int N=5;
        diceRolling(N, 0, "");
    }
    public static void diceRolling(int N,int curr, String result){
        // Base case: if current roll index reaches n
        if (curr == N) {
            System.out.println(result);
            return;
        }

        // Try all dice faces 1 to 6
        for (int i = 1; i <= 6; i++) {
            diceRolling(N, curr+1, result+i);
        }
    }
}
