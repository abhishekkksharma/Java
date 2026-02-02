package Recursion.SubsetsSubsequences;

public class Subseq {
    public static void main(String[] args) {
        subseqs("", "abc");        
    }
    static void subseqs(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //include 
        subseqs(p+ch, up.substring(1));
        //exclude
        subseqs(p, up.substring(1));
    }
}
