package Recursion.Permutations;

import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        // permutation("", "abc");
        ArrayList<String> list = permutationArrayList("", "abc");
        System.out.println(list);

    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.err.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permutationArrayList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationArrayList(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
