import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings_Page extends World
{

    /**
     * Constructor for objects of class Settings_Page.
     * 
     */
    public Settings_Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        settings();
    }
    
    private void settings(){
        MusicOn musicOn = new MusicOn();
        addObject(musicOn, 300, 100);
    }
}
