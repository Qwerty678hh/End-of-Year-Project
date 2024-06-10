import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2Button extends Actor
{
    /**
     * Act - do whatever the Car2Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.car2();
        }
        if (endGame.getHome()) {
            getWorld().removeObject(this);
        }
    }
}
