import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void act() {
        prepare();
    }
    
    private void prepare() {
        Title title = new Title();
        addObject(title, 300, 100);
        PlayButton play = new PlayButton();
        addObject(play, 300, 350);
    }
}
