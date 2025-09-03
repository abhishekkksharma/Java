public class arrays {
    public static void main(String[] args) {
        // int[] rollNo = new int[5];
        int[] rollNo2 = {1,2,3,4,5};
        System.out.println(rollNo2[0]);
        int[] ros; // declaration of array. ros is defined in the stack
        ros = new int[5]; //initialization: actually here is being created in the heap memmory
        System.out.println(ros[0]);

        String[] arr = new String[5];
        System.out.println(arr[0]); //null
    }
}
