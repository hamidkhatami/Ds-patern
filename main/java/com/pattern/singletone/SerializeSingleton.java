package main.java.com.pattern.singletone;

/**
 * @author Hamid Khatami (Khatami@caspco.ir)
 * @version 1.0 2023.0409
 * @since 1.0
 */
public  class SerializeSingleton {
  private static final long serialVersionUID = -7604766932017737115L;

  private SerializeSingleton() {}

  private static class SingletonHelper {
    private static final SerializeSingleton instance = new SerializeSingleton();
  }

  public static SerializeSingleton myInstance() {
    return SingletonHelper.instance;
  }

  protected Object readResolve(){
      return myInstance();
  }

  public void hello(){
    System.out.println("Hello World From Serial Singleton");
  }

}
