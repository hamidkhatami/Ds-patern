package main.java.com.singletone;

public class ThreadSafeSingletonInstance2 {

    private static ThreadSafeSingletonInstance2 threadSafeSingletonInstance;

    private ThreadSafeSingletonInstance2() {
    }

    public static ThreadSafeSingletonInstance2 instance() {
        if (threadSafeSingletonInstance == null) {
            synchronized (ThreadSafeSingletonInstance.class) {
                if (threadSafeSingletonInstance == null)
                    return new ThreadSafeSingletonInstance2();
            }
        }
        return threadSafeSingletonInstance;

    }

    public void hello() {
        System.out.println("Hello World! From ThreadSafe Instance!!!!!");
    }
}
