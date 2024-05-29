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
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare() {
        Title title = new Title();
        addObject(title, 300, 100);
        PlayButton play = new PlayButton();
        addObject(play, 300, 200);
        SettingsButton settings = new SettingsButton();
        addObject(settings, 300, 300);
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("a")) {
            setBackground("Speed-Busters-Hypercar.png");
        }
    }
}