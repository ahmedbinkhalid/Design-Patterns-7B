/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonTest;



/**
 *
 * @author fa20-bse-062
 */
import static org.junit.Assert.assertEquals;
       import static org.junit.Assert.assertNotNull;
       import org.junit.Test;

/**
 * Test implementation of the Singleton pattern.
 */
public class SingletonTest {

  @Test
  public void testSingleton() {

    // invokes Singleton.getInstance() for first time,
    // object will be created
    Singleton singleton = Singleton.getInstance();
    assertNotNull(singleton);

    // invokes Singleton.getInstance() for second time,
    // reference to the same object will be returned
    Singleton secondSingleton;
      secondSingleton = Singleton.getInstance();
    assertEquals(singleton, secondSingleton);
  }

    private static class Singleton {

        private static Singleton getInstance() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Singleton() {
        }
    }
}
