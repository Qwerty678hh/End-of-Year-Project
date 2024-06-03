import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Actor
{
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkCollision();
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 4, getY());
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 4);
        }
    }
    
    private void checkCollision() {
        if (isTouching(Car3.class)) {
            Play_Page playPage = (Play_Page)getWorld();
            playPage.addCar1Health(-10);
            removeTouching(Car3.class);
        }
         if (isTouching(FinishLine.class)) {
            Play_Page playPage = (Play_Page)getWorld();
            playPage.win(1);
        }
    }
}
