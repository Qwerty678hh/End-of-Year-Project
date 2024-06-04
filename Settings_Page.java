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
        prepare();
        act();
        //trying to create image for blueCar on screen
        GreenfootImage blueCar = new GreenfootImage("car01-n.png");
        getBackground().drawImage(blueCar, 50, 200);
        //trying to create image for redcar on screen
        GreenfootImage redCar = new GreenfootImage("car02-n.png");
        getBackground().drawImage(redCar, 100, 200);
    }
    
    public void act(){
        if(player == 0){
            showText("Player 1, pick a car", 300, 100);
        }
    }
    
    public void prepare(){
        settingsButton start = new settingsButton();
        addObject(start, 300, 250);
    }
}
