package java_practice.nobugs;

public class ExceptionTrick {
    public static void main(String[] args) {

        try {
            throw new IllegalArgumentException("Outer");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
            throw new RuntimeException("Inner");
        }

        catch (RuntimeException e) {
            System.out.println("Caught runtime: " + e.getMessage());
        }

        finally {
            System.out.println("Finally block");
        }

        System.out.println("After try-catch-finally");
    }

}
