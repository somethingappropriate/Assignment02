/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.icons.Icon;

/**
 *
 * @author dhila4674
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        Robot Karel = new Robot(Ajay, 3, 2, Direction.NORTH);
        new Thing(Ajay, 0, 0);
        
        while(Karel.frontIsClear()){
            Karel.move();
            Karel.move();
            Karel.move();
            Karel.turnLeft();
            Karel.move();
            Karel.move();
            
             while(Karel.canPickThing()){
                 Karel.pickThing();
        }
                 break;
                     
                }
      
    }

  
        }
    
            
    
    
