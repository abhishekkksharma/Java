package Recursion.SubsetsSubsequences;

public class RemoveChar {
    public static void main(String[] args) {
        String str = "baccdah";
        skip("", str);
        System.out.println(skip2(str));
    }

    // with 2 argumenrts
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    // with 1 aurgument 
    static String skip2(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return skip2(s.substring(1));
        }else{
            return ch+skip2(s.substring(1));
        }
    }
}
