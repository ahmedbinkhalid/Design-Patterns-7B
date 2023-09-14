/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
class Ahmed {
private String name;
private int weight;
private int numberofsubjects;


public String getName(){
return name;
}
public int getWeight(){
    return weight;
}
public int getNumberofsubjects(){
    return numberofsubjects;
}
public void setName(String Name){
    this.name = Name;
}
public void setWeight(int Weight){
    this.weight = Weight;
    
}
public void setNumberofsubjects(int Numberofsubjects){
    this.numberofsubjects = Numberofsubjects; 
}
}

class Main{
    public static void main(String[] args){
     Ahmed myahmed = new Ahmed();
     myahmed.setName("Ahmed Bin Khalid");
     myahmed.setWeight(92);
     myahmed.setNumberofsubjects(5);
     System.out.println("Full name: " + myahmed.getName());
     System.out.println("Body Weight: " + myahmed.getWeight());
     System.out.println("Subjects studing: " + myahmed.getNumberofsubjects());
     
    }
    
}


