import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Create and add a spaceship in the world
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 300, 200);
    }
}
