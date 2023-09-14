/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
class  Animals  {
public String reproduction =  "Baby";
public String outerCovering =  "Mass";
public  void  running()  {
System.out.println("running...");
}
public  void  walking()  {
System.out.println("walking...");
}
}
class  Cheetah  extends Animals {
public String name =  "Cheetah";
public  int lifespan = 10;
}
class  TestCheetahInheritance  {
public  static  void  main(String[] args)  {
Cheetah mycheetah =  new Cheetah();
System.out.println("Name: "  + mycheetah.name);  System.out.println("Reproduction: "  + mycheetah.reproduction);
System.out.println("Outer covering: "  + mycheetah.outerCovering);
System.out.println("Lifespan: "  + mycheetah.lifespan);
mycheetah.running();
mycheetah.walking();
}
}