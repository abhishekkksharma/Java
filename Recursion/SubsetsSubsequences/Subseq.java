package Recursion.SubsetsSubsequences;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        subseqs("", "abc");
        System.out.println(subseqsReturn("", "abc"));     
        subseqsAscii("", "abc");
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

    static ArrayList<String> subseqsReturn(String p,String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        //include 
        ArrayList<String> left = subseqsReturn(p+ch, up.substring(1));
        //exclude
        ArrayList<String> right = subseqsReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqsAscii(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //include 
        subseqsAscii(p+ch, up.substring(1));
        //exclude
        subseqsAscii(p, up.substring(1));

        subseqsAscii(p+(ch+0), up.substring(1));
    }

}
