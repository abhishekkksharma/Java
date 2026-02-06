package ExceptionHandling.throwException;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try {
            int a = 10/0;
            System.out.println(a);
            } catch (ArithmeticException e) {
                System.out.println("Exception:"+e.getMessage());
            }
            try{
                int[] a=new int[10];
                a[10]=5;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            System.out.println("other statement");
        }catch(Exception e){
            System.out.println("handeled the exception (outer catch)");
        }

        System.out.println("normal flow..");
    }
}
