import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedUpgrade extends Actor
{
    /**
     * Act - do whatever the SpeedUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.speedUpgrade();
        }
    }
}
