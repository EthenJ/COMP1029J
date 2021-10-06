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

        
        /**
         * Task 2 - Shoot the bullet
         */
        
        // If the player presses the spacebar key
        if (Greenfoot.isKeyDown("space")) {
            //    if there is currently no bullet in the game
            //if (getWorld().getObjects(Bullet.class).isEmpty()) {
                //        add a bullet
                for (int i=Greenfoot.getRandomNumber(60);i<360;i+=Greenfoot.getRandomNumber(60)){
                Bullet bullet = new Bullet();
                getWorld().addObject(bullet, getX(), getY());
                bullet.setRotation(i);
            }
            //}
        }
        
    
        // Check if a rock hits the spaceship
        if (!getObjectsInRange(60, Rock.class).isEmpty()) {
            // Add an explosion at the spaceship position
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, getX(), getY());

            // Remove the spaceship from the world
            getWorld().removeObject(this);
            
            // Stop the game
            Greenfoot.stop();
        }
    }
}
