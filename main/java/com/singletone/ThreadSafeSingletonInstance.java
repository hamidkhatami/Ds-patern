package main.java.com.singletone;

public class ThreadSafeSingletonInstance {

    private static ThreadSafeSingletonInstance threadSafeSingletonInstance;

    private ThreadSafeSingletonInstance() {
    }
    public static synchronized ThreadSafeSingletonInstance instance(){
        if(threadSafeSingletonInstance==null)
            return new ThreadSafeSingletonInstance();
        return threadSafeSingletonInstance;

    }
    public void hello(){
        System.out.println("Hello World! From ThreadSafe Instance!!!!!");
    }
}
