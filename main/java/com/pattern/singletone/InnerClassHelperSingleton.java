package main.java.com.pattern.singletone;

public class InnerClassHelperSingleton {
    private InnerClassHelperSingleton(){}
    private static class helper{
        private static final InnerClassHelperSingleton INSTANCE = new InnerClassHelperSingleton();
    }
    public static InnerClassHelperSingleton instance(){
        return helper.INSTANCE;
    }

    public  void hello() {
        System.out.println("Hello From InnerClassHelper Instance!!!!!");
    }
}
