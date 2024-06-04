import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings_Page extends World
{
    public int player = 0;
    /**
     * Constructor for objects of class Settings_Page.
     * 
     */
    public Settings_Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        act();
        //trying to create image for redcar on screen
        //GreenfootImage redcar = new GreenfootImage("car01-n.png");
        //Settings_Page.getBackground().drawImage(redcar, 100, 100);
    }
    
    public void act(){
        if(player == 0){
            showText("Player 1, pick a car", 300, 100);
        }
    }
}
