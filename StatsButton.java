import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StatsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StatsButton extends Actor
{
    /**
     * Act - do whatever the StatsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.stats();
        }
        if (endGame.getHome()) {
            getWorld().removeObject(this);
        }
    }
}
