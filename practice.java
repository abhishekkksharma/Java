import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqReturn("", "abc"));
        skip("", "apple", 'p');
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //include
        subseq(p+ch, up.substring(1));
        //exclude
        subseq(p, up.substring(1));

    }
    static ArrayList<String> subseqReturn(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqReturn(p+ch, up.substring(1)); 
        ArrayList<String> right = subseqReturn(p, up.substring(1)); 
        left.addAll(right);
        return left;
    }

    static void skip(String p,String up,char target){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch==target){
            skip(p, up.substring(1), target);
        }else{
            skip(p+ch, up.substring(1), target);
        }
    }
}
