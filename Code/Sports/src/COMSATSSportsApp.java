/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */


import java.util.ArrayList;
import java.util.List;

public class COMSATSSportsApp implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<String> matchList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(matchList);
        }
    }

    @Override
    public List<String> getMatches() {
        return matchList;
    }

    public void addMatch(String match) {
        matchList.add(match);
    }

    public void removeMatch(String match) {
        matchList.remove(match);
    }
}


