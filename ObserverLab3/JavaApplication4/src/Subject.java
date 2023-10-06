/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-062
 */
import Observer.Observer;
import java.util.ArrayList;
import java.util.List;

// Create the Subject class to represent the subject of observation.
public class Subject {
   
   private List<Observer> observers = new ArrayList<Observer>(); // List to hold registered observers.
   private int state; // The state that observers are interested in.

   // Getter method to retrieve the current state.
   public int getState() {
      return state;
   }

   // Setter method to update the state and notify observers.
   public void setState(int state) {
      this.state = state;
      notifyAllObservers(); // Notify all registered observers when the state changes.
   }

   // Method to attach (register) an observer to the subject.
   public void attach(Observer observer){
      observers.add(observer); // Add the observer to the list of registered observers.		
   }

   // Method to notify all registered observers when the state changes.
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update(); // Call the update method on each registered observer.
      }
   } 	
}

