package main.java.com.pattern.singletone;

//Simple Singleton without any resources
public class SingletonInstance {
    private static final SingletonInstance mySingleton = new SingletonInstance();

    private SingletonInstance() {

    }

    public static SingletonInstance mySingleton() {
        return mySingleton;
    }

    public void hello() {
        System.out.println("hello world!");
    }


}



