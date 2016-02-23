/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author dhila4674
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
       
       new Wall(Ajay, 1, 3, Direction.SOUTH);
       new Wall(Ajay, 1, 4, Direction.SOUTH);
       new Wall(Ajay, 1, 5, Direction.SOUTH);
       new Wall(Ajay, 1, 6, Direction.SOUTH);
       new Wall(Ajay, 1, 7, Direction.SOUTH);
       new Wall(Ajay, 1, 8, Direction.SOUTH);
       new Wall(Ajay, 1, 9, Direction.SOUTH);
       new Wall(Ajay, 1, 10, Direction.SOUTH);
       new Wall(Ajay, 1, 11, Direction.SOUTH);
       new Wall(Ajay, 1, 3, Direction.EAST);
       new Wall(Ajay, 1, 4, Direction.EAST);
       new Wall(Ajay, 1, 6, Direction.EAST);
       new Wall(Ajay, 1, 9, Direction.EAST);
       Robot George = new Robot(Ajay, 1, 3, Direction.EAST);
       new Thing(Ajay, 1, 11);
       
        while(true){
            if(George.frontIsClear())
            George.move();
       
           
        if( !George.frontIsClear()){
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.move();
           George.move();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.turnLeft();
           George.turnLeft();
           George.move();
           George.turnLeft();
           George.move();
         
        
           if(George.canPickThing())
            George.pickThing();
            break;
       }
    }  
    }
}             
    

