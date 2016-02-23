/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author dhila4674
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       City Ajay = new City();
       Robot Karel = new Robot(Ajay, 1, 1, Direction.EAST );
       new Thing(Ajay, 1, 2);
       new Thing(Ajay, 1, 3);
       new Thing(Ajay, 1, 4);
       new Thing(Ajay, 1, 5);
       new Thing(Ajay, 1, 6);
       new Thing(Ajay, 1, 7);
       new Thing(Ajay, 1, 8);
       new Thing(Ajay, 1, 9);
       new Thing(Ajay, 1, 10);
       new Thing(Ajay, 1, 11);
       
      Karel.move();
       while(Karel.canPickThing())
{
   Karel.pickThing();
   
   Karel.countThingsInBackpack();
   
   if(Karel.countThingsInBackpack()>6)
       break;
   Karel.move();
  
   
   } 
   Karel.move();
   Karel.move();
   Karel.move();
   Karel.move();
   
   }
   
}
      
   
                     
           
  