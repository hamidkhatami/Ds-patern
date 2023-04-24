package main.java.com.pattern.singletone;

public class LazySingletonInstance {

    private static LazySingletonInstance mySingleton;

    private LazySingletonInstance() {
    }

    public static LazySingletonInstance instance() {
        if (mySingleton != null)
            return mySingleton;
        return new LazySingletonInstance();
    }

    public  void hello() {
        System.out.println("Hello From Lazy Instance!!!!!");
    }
}
