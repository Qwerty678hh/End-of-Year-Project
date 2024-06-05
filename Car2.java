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
    private int speed;
    private int oilTime; 
    
    public Car2() {
        speed = 4; 
        oilTime = 10000;
    }
    
    public void act()
    {
        checkKeyPress();
        checkCollision();
        oilCounter();
    }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
        }
    }
    
    private void checkCollision() {
        Play_Page playPage = (Play_Page)getWorld();
        if (isTouching(Car3.class)) {
            playPage.addCar1Health(-10);
            removeTouching(Car3.class);
        }
         if (isTouching(FinishLine.class) && !playPage.getWin()) {
            playPage.win(1);
        }
        if (isTouching(SpeedBoost.class)) {
            removeTouching(SpeedBoost.class);
            setLocation(getX(), getY() -100);

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
