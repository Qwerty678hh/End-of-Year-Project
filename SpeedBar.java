import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedBar extends Actor
{
    /**
     * Act - do whatever the SpeedBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        EndGame endGame = (EndGame)getWorld();
        if (endGame.getHome()) {
            getWorld().removeObject(this);
        }
    }
}
