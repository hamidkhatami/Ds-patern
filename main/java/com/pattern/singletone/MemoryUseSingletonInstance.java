package main.java.com.pattern.singletone;

/**
 * @author Hamid Khatami (Khatami@caspco.ir)
 * @version 1.0 2023.0408
 * @since 1.0
 */
public final class MemoryUseSingletonInstance {
  private MemoryUseSingletonInstance() {}

  private static class SingletonHelper {
    private static final MemoryUseSingletonInstance instance = new MemoryUseSingletonInstance();
  }

  public static MemoryUseSingletonInstance myInstance() {
    return SingletonHelper.instance;
  }

  public void hello() {
    System.out.println("Hello From Best Memory usage For Singleton");

  }

}
