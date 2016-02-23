
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 1, 1, Direction.WEST);
        new Wall(Ajay, 2, 1, Direction.WEST);
        new Wall(Ajay, 3, 1, Direction.WEST);
        new Wall(Ajay, 4, 1, Direction.WEST);
        new Wall(Ajay, 5, 1, Direction.WEST);
        new Wall(Ajay, 6, 1, Direction.WEST);
        new Wall(Ajay, 7, 1, Direction.WEST);
        new Wall(Ajay, 8, 1, Direction.WEST);
        new Wall(Ajay, 9, 1, Direction.WEST);
        new Wall(Ajay, 10, 1, Direction.WEST);
        new Wall(Ajay, 1, 2, Direction.EAST);
        new Wall(Ajay, 2, 2, Direction.EAST);
        new Wall(Ajay, 3, 2, Direction.EAST);
        new Wall(Ajay, 4, 2, Direction.EAST);
        new Wall(Ajay, 5, 2, Direction.EAST);
        new Wall(Ajay, 6, 2, Direction.EAST);
        new Wall(Ajay, 7, 2, Direction.EAST);
        new Wall(Ajay, 8, 2, Direction.EAST);
        new Wall(Ajay, 9, 2, Direction.EAST);
        new Wall(Ajay, 10, 2, Direction.EAST);
        new Wall(Ajay, 1, 3, Direction.EAST);
        new Wall(Ajay, 4, 3, Direction.EAST);
        new Wall(Ajay, 6, 3, Direction.EAST);
        new Wall(Ajay, 7, 3, Direction.EAST);
        new Wall(Ajay, 10, 3, Direction.EAST);
        new Wall(Ajay, 10, 3, Direction.SOUTH);
        new Wall(Ajay, 2, 4, Direction.NORTH);
        new Wall(Ajay, 2, 5, Direction.NORTH);
        new Wall(Ajay, 2, 6, Direction.NORTH);
        new Wall(Ajay, 2, 7, Direction.NORTH);
        new Wall(Ajay, 2, 7, Direction.EAST);
        new Wall(Ajay, 3, 4, Direction.SOUTH);
        new Wall(Ajay, 3, 5, Direction.SOUTH);
        new Wall(Ajay, 3, 6, Direction.SOUTH);
        new Wall(Ajay, 3, 7, Direction.SOUTH);
        new Wall(Ajay, 3, 7, Direction.EAST);
        new Wall(Ajay, 5, 4, Direction.NORTH);
        new Wall(Ajay, 5, 4, Direction.SOUTH);
        new Wall(Ajay, 5, 5, Direction.NORTH);
        new Wall(Ajay, 5, 5, Direction.SOUTH);
        new Wall(Ajay, 5, 6, Direction.NORTH);
        new Wall(Ajay, 5, 6, Direction.SOUTH);
        new Wall(Ajay, 5, 6, Direction.EAST);
        new Wall(Ajay, 8, 4, Direction.NORTH);
        new Wall(Ajay, 8, 5, Direction.NORTH);
        new Wall(Ajay, 8, 6, Direction.NORTH);
        new Wall(Ajay, 8, 7, Direction.NORTH);
        new Wall(Ajay, 8, 8, Direction.NORTH);
        new Wall(Ajay, 8, 8, Direction.EAST);
        new Wall(Ajay, 9, 4, Direction.SOUTH);
        new Wall(Ajay, 9, 5, Direction.SOUTH);
        new Wall(Ajay, 9, 6, Direction.SOUTH);
        new Wall(Ajay, 9, 7, Direction.SOUTH);
        new Wall(Ajay, 9, 8, Direction.SOUTH);
        new Wall(Ajay, 9, 8, Direction.EAST);
        new Thing(Ajay, 2, 3);
        new Thing(Ajay, 2, 4);
        new Thing(Ajay, 2, 5);
        new Thing(Ajay, 2, 6);
        new Thing(Ajay, 3, 3);
        new Thing(Ajay, 3, 5);
        new Thing(Ajay, 3, 7);
        new Thing(Ajay, 5, 3);
        new Thing(Ajay, 5, 4);
        new Thing(Ajay, 5, 5);
        new Thing(Ajay, 8, 3);
        new Thing(Ajay, 8, 4);
        new Thing(Ajay, 8, 8);
        new Thing(Ajay, 9, 4);
        new Thing(Ajay, 9, 5);
        new Thing(Ajay, 9, 7);
        Robot Butler = new Robot(Ajay, 1, 3, Direction.SOUTH);
        Robot Alfred = new Robot(Ajay, 1, 3, Direction.SOUTH);
        Alfred.setColor(Color.blue);
    
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        Alfred.move();
        
        
        
        
        
        while(true){
        if(Butler.frontIsClear()){
        Butler.move();
        Butler.turnLeft();
        if(Butler.canPickThing())
            Butler.pickThing();
        
        }
        if(!Butler.frontIsClear()){
            Butler.turnLeft();
            Butler.turnLeft();
            Butler.turnLeft();
        }
        if(Butler.countThingsInBackpack()==16)
            break;
    }
       
       
        Butler.move();
        Butler.turnLeft();
        Butler.move();
        Butler.putThing();
        Alfred.pickThing();
        
    }         
    }         
       
    
    
    
