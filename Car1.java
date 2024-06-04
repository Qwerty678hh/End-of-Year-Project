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
    private int speed;
    private int oilTime; 
    
    public Car1() {
        speed = 4;
        oilTime = 10000;
    }
    
    public void act()
    {
        checkKeyPress();
        checkLocation();
        checkCollision();
        oilCounter();
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + speed);
        }
    }
    
    private void checkLocation() {
        if (getY() == 0) {
            setLocation(116, 328);
        }
    }
    
    private void checkCollision() {
        Play_Page playPage = (Play_Page)getWorld();
        if (isTouching(Car3.class)) {
            playPage.addCar1Health(-10);
            removeTouching(Car3.class);
        }
        if (isTouching(FinishLine.class) && !playPage.getWin()) {
            playPage.win(0);
        }
        if (isTouching(OilSpill.class)) {
            speed = 1;
            removeTouching(OilSpill.class);
        }
    }
    
    private void oilCounter() {
        if (oilTime == 0) {
            speed = 4;
            oilTime = 10000;
        }
        else {
            oilTime -= 100;
        }
    }
}
