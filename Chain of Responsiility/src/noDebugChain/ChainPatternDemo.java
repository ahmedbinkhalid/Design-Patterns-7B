/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noDebugChain;


/**
 *
 * @author FA20-BSE-062
 */
public class ChainPatternDemo {

    private static AbstractLogger ConsoleLogger;
	
   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
      AbstractLogger DatabaseLogger = new DatabaseLogger(AbstractLogger.WARN);
      

      errorLogger.setNextLogger(ConsoleLogger);
      ConsoleLogger.setNextLogger(DatabaseLogger);
      DatabaseLogger.setNextLogger(consoleLogger);

      return errorLogger;	
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   
      loggerChain.logMessage(AbstractLogger.WARN, 
         "This is a Warning.");
}
}
