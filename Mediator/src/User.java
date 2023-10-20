/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
public class User implements AbstractUser{
    private String name;

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public User(String name){
       this.name  = name;
    }

    @Override
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}