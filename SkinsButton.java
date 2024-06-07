import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SkinsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkinsButton extends Actor
{
    /**
     * Act - do whatever the SkinsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        EndGame endGame = (EndGame)getWorld();
        if (endGame.getHome()) {
            getWorld().removeObject(this);
        }
    }
}
