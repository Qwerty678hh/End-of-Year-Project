import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car1Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1Button extends Actor
{
    /**
     * Act - do whatever the Car1Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.car1();
        }
        if (endGame.getHome()) {
            getWorld().removeObject(this);
        }
    }
}
