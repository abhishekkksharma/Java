package Functions;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(arr[0]);
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
