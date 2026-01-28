package DSAClass.Recursion;

import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        subseq(str, 0,"");
        sc.close();

    }
    static void subseq(String str, int index,String ans){
        if(index==str.length()){
            System.out.println(ans);
            return;
        }
        //include
        subseq(str, index+1, ans+str.charAt(index));

        //exlude
        subseq(str, index+1, ans);
    }
}
