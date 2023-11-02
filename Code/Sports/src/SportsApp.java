/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
// */

import java.util.List;

public interface SportsApp {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
    List<String> getMatches();
}


