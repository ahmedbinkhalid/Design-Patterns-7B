

 
package Singleton;

/**
 *
 * @author fa20-bse-062
 */
class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
 public class Main {

  public static void main(String[] args) {
    // Get the single instance of Singleton
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    // Check if both instances are the same
    if (singleton1 == singleton2) {
      System.out.println("singleton1 and singleton2 are the same instance.");
    } else {
      System.out.println("singleton1 and singleton2 are different instances.");
    }
  }
}
