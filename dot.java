import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dot extends Actor
{
    public dot(){
        GreenfootImage dot = new GreenfootImage("dot.png");
        dot.scale(dot.getWidth() / 6, dot.getHeight() / 6);
        setImage(dot);
    }
    /**
     * Act - do whatever the dot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
