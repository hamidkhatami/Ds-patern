package main.java.com.pattern.singletone;

public class StaticBlockInstance {
    private static StaticBlockInstance myStaticBlock;

    static {
        try {
            myStaticBlock = new StaticBlockInstance();
        } catch (Exception e) {
            throw new RuntimeException("block instance exceptions!!");
        }
    }

    private StaticBlockInstance() {
    }

    public static StaticBlockInstance instance() {
        return myStaticBlock;
    }

    public static void hello() {
        System.out.println("Hello from Static Block Instance!!!");
    }
}
