import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        checkLocation();
        checkCollision();
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 4, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
        }
    }
    
    private void checkLocation() {
        if (getY() == 0) {
            setLocation(116, 328);
        }
    }
    
    private void checkCollision() {
        if (isTouching(Car3.class)) {
            Play_Page playPage = (Play_Page)getWorld();
            playPage.addCar1Health(-10);
            removeTouching(Car3.class);
        }
    }
}
