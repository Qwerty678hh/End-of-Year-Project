import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Actor
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int oilTime; 
    private int speedTime;
    private int a;
    private int b;
    
    public Car2(int speed) {
        this.speed = speed;
        oilTime = 1000;
        speedTime = 1000;
        a = 0;
        b = 0;
    }
    
    public void act()
    {
        Play_Page playPage = (Play_Page)getWorld();
        //if (playPage.countDistance()) {
            //getWorld().removeObject(this);
        //}
        checkKeyPress();
        checkCollision();
        oilCounter();
        speedCounter();
        checkLocation();
    }
    
    public int getSpeed() {
        return speed;
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
            setLocation(getX(), getY() + 6);
        }
        if(Greenfoot.isKeyDown("shift")){
            getWorld().addObject(new Rocket(), getX(), getY() + 20);
            //
            setLocation(getX(), getY() + speed);
        }
    }
    
    private void checkCollision() {
        Play_Page playPage = (Play_Page)getWorld();
        if (isTouching(Car3.class)) {
            //playPage.addCar2Health(-10);
            removeTouching(Car3.class);
        }
         if (isTouching(FinishLine.class) && !playPage.getWin()) {
            playPage.win(1);
        }
        if (isTouching(OilSpill.class)) {
            speed = 1;
            a = 1;
            removeTouching(OilSpill.class);
        }
        if (isTouching(SpeedBoost.class)) {
            speed = 8;
            b = 1; 
            removeTouching(SpeedBoost.class);
        }
         if (isTouching(Coin.class)) {
            playPage.addCar2Coins(10);
            removeTouching(Coin.class);
        }
    }   
    private void oilCounter() {
        if (oilTime == 0) {
            speed = 4;
            oilTime = 1000;
            a = 0;
        }
        else if (a == 1) {
            oilTime -= 50;
        }
    }
    private void speedCounter() {
        if (speedTime == 0) {
            speed = 4;
            speedTime = 1000;
            b = 0;
        }
        else if (b == 1) {
            speedTime -= 50;
        }
    }
    
    private void checkLocation() {
        if (getY() == 0) {
            setLocation(getX(), 450);
        }
        if(getX()==340){
            setLocation(476, getY());
        }
    }
}
