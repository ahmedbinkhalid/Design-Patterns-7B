/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
interface Cars {
 
    abstract void enginesound();
    abstract void carspeed();
    
    
}
class Audi implements Cars{
    public void enginesound() {
        System.out.println("The sound of the Audi is Laoud");
    } 
    public void carspeed(){
        System.out.println("The car speed is about 420km/h");
    }
}
class Bmw implements Cars{
public void enginesound(){
System.out.println("The sound of BMW is not Very Laoud");

}
public void carspeed(){
    System.out.println("The speed of the car is 320km/h");
}
}
class Main{
public static void main(String[] args){
    Audi myaudi = new Audi();
    myaudi.enginesound();
    myaudi.carspeed();
    Bmw mybmw = new Bmw();
    mybmw.enginesound();
    mybmw.carspeed();
}
}
