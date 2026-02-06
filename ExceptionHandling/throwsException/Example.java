package ExceptionHandling.throwsException;

public class Example {
    public static void main(String[] args) throws CustomeException {
        try {
            throw new CustomeException("This is a custom exception");
        } catch (CustomeException e) {
            System.out.println("Exception: "+e);
        }
    }
}
