import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Rotate the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        else if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    
        // Move the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
    }
}
