package DSAClass;

// import java.util.ArrayList;
// import java.util.Collections;

public class variables {
    public static void main(String[] args) {
        // float q=4.0f;
        // Float q1=4.0f;
        // double q3=4.0f;
        // Object q2=4.0f;
        // // Double q4=4.0f; //wont work
        // var b=5.9;

        // double d=2.7_1_8;
        // double d2=2.718;
        //class question 
        String a = "a4b2cd6e564";
        int num = 0;
        // ArrayList<Integer> list = new ArrayList<>();
        // for(char ch : a.toCharArray()){
        //     if(Character.isDigit(ch)) list.add(ch-'0');
        // }
        // Collections.sort(list);
        // for(int i=list.size()-1;i>=0;i--){
        //     num = num*10+list.get(i);
        // }

        int[] freq = new int[10];
        for(char ch : a.toCharArray()){
            if(Character.isDigit(ch)) freq[ch-'0']++;
        }
        for(int i=9;i>=0;i--){
            while(freq[i]>0){
                num=num*10+i;
                freq[i]--;  
            }
        }
        System.out.println(num);
    }

}
