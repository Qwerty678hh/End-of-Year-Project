import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("a")) {
           Greenfoot.setWorld(new Play_Page(new Car1(4),new Car2(4),25,25,4,4,0,0,false,false,false,false));
        }
    }
}
