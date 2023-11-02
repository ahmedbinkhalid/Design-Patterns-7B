/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        COMSATSSportsApp comsatsSportsApp = new COMSATSSportsApp();

        User user1 = new User("User1");
        User user2 = new User("User2");

        comsatsSportsApp.attach(user1);
        comsatsSportsApp.attach(user2);

        comsatsSportsApp.addMatch("COMSATS Match CS vs EEE");
        comsatsSportsApp.notifyObservers();
    }
}


