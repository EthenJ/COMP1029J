import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        Score score = (Score) getWorld().getObjects(Score.class).get(0);
        // Move the bullet
        move(6);
        // Remove the bullet if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }      
        else if (!getObjectsInRange(20, Rock.class).isEmpty()) {
            Rock rock = (Rock) getObjectsInRange(20, Rock.class).get(0);
            getWorld().removeObject(rock);
            getWorld().removeObject(this);
            score.increase();
            return;
        }   
    }    
}
