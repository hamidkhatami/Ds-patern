package main.java.com;

import main.java.com.singletone.LazySingletonInstance;
import main.java.com.singletone.MemoryUseSingletonInstance;
import main.java.com.singletone.SerializeSingleton;
import main.java.com.singletone.SingletonInstance;
import main.java.com.singletone.StaticBlockInstance;
import main.java.com.singletone.ThreadSafeSingletonInstance;

public class Main {
  public static void main(String[] args) {
    SingletonInstance singletonInstance = SingletonInstance.mySingleton();
    singletonInstance.hello();

    System.out.println("-------------Simple -------------------");
    System.out.println("              ");

    StaticBlockInstance staticBlockInstance = StaticBlockInstance.instance();
    staticBlockInstance.hello();

    System.out.println("--------------Lazy ------------------");
    System.out.println("              ");

    LazySingletonInstance lazySingletonInstance = LazySingletonInstance.instance();
    lazySingletonInstance.hello();

    System.out.println("---------------Thread Safe-----------------");
    System.out.println("              ");

    ThreadSafeSingletonInstance threadSafeSingletonInstance = ThreadSafeSingletonInstance.instance();
    threadSafeSingletonInstance.hello();

    System.out.println("---------------Best Memory Usage-----------------");
    System.out.println("              ");

    MemoryUseSingletonInstance memoryUseSingletonInstance = MemoryUseSingletonInstance.myInstance();
    memoryUseSingletonInstance.hello();

    System.out.println();
    System.out.println("--------------Serials------------------");
    System.out.println();

    SerializeSingleton serializeSingleton = SerializeSingleton.myInstance();
    serializeSingleton.hello();


  }

}
