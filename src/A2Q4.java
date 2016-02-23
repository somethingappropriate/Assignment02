/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author dhila4674
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 1, 1, Direction.NORTH);
        new Wall(Ajay, 1, 1, Direction.WEST);
        new Wall(Ajay, 1, 1, Direction.EAST);
        new Wall(Ajay, 1, 1, Direction.SOUTH);
        new Wall(Ajay, 1, 4, Direction.NORTH);
        new Wall(Ajay, 1, 4, Direction.EAST);
        new Wall(Ajay, 1, 4, Direction.WEST);
        new Wall(Ajay, 1, 4, Direction.SOUTH);
        new Wall(Ajay, 4, 4, Direction.NORTH);
        new Wall(Ajay, 4, 4, Direction.SOUTH);
        new Wall(Ajay, 4, 4, Direction.EAST);
        new Wall(Ajay, 4, 4, Direction.WEST);
        new Wall(Ajay, 4, 1, Direction.NORTH);
        new Wall(Ajay, 4, 1, Direction.SOUTH);
        new Wall(Ajay, 4, 1, Direction.EAST);
        new Wall(Ajay, 4, 1, Direction.WEST);
        new Wall(Ajay, 2, 2, Direction.NORTH);
        new Wall(Ajay, 2, 2, Direction.WEST);
        new Wall(Ajay, 2, 3, Direction.NORTH);
        new Wall(Ajay, 2, 3, Direction.EAST);
        new Wall(Ajay, 3, 2, Direction.SOUTH);
        new Wall(Ajay, 3, 2, Direction.WEST);
        new Wall(Ajay, 3, 3, Direction.SOUTH);
        new Wall(Ajay, 3, 3, Direction.EAST);
        Robot Batman = new Robot(Ajay, 2, 1, Direction.NORTH);
        
      while(!Batman.frontIsClear())
        { while(!Batman.frontIsClear()){
            Batman.turnLeft();
            Batman.move();}
            
            
            while(Batman.frontIsClear()){
                Batman.turnLeft();
                Batman.turnLeft();
                Batman.turnLeft();
                Batman.move();
                if(Batman.frontIsClear())
                Batman.move();}
            while(!Batman.frontIsClear()){
            Batman.turnLeft();
            Batman.move();}
            
            while(Batman.frontIsClear()){
                Batman.turnLeft();
                Batman.turnLeft();
                Batman.turnLeft();
                Batman.move();
                if(Batman.frontIsClear())
                Batman.move();}
                
        }
        }
       
        }
    

  

