import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Page extends World
{
    // Instance variables
    private int car1Health;
    private int car2Health;
    
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Car1(), 116, 328);
        addObject(new Car2(), 372, 328);
        car1Health = 100;
        car2Health = 100;
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Car3(), Greenfoot.getRandomNumber(600), 0);
        }
        results();
    }
    
    public void addCar1Health(int damage) {
        car1Health += damage;
    }
    
    public void addCar2Health(int damage) {
        car2Health += damage;
    }
    
    private void results() {
        if (car1Health == 0) {
            showText("Car1 has died in a crash! Car2 has won!", 300, 200);
            Greenfoot.stop();
        }
        if (car2Health == 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
            Greenfoot.stop();
        }
    }
}
