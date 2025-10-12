package java_practice.nobugs;

public class StaticTrick {
    static {
        System.out.println("Static block 1");
    }

    static int x = initializeX();

    static {
        System.out.println("Static block 2, x = " + x);
    }

    int y = initializeY();

    {
        System.out.println("Instance block, y = " + y);
    }

    public StaticTrick() {
        System.out.println("Constructor");
    }

    private static int initializeX() {
        System.out.println("Initializing X");
        return 10;
    }

    private int initializeY() {
        System.out.println("Initializing Y");
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Main start");
        StaticTrick obj1 = new StaticTrick();
        System.out.println("Main end");
    }

}
