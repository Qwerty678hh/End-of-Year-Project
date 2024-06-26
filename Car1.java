import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends Actor {
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int oilTime;
    private int speedTime;
    private int a;
    private int b;
    
    public Car1(int speed) {
        this.speed = speed;
        oilTime = 1000;
        speedTime = 1000;
        a = 0;
        b = 0;
    }
    
    public void act()
    {
        //Play_Page playPage = (Play_Page)getWorld();
        //if (playPage.countDistance()) {
            //getWorld().removeObject(this);
        //}
        checkKeyPress();
        checkLocation();
        checkCollision();
        oilCounter();
        speedCounter();
    }
    
    public int getSpeed() {
        return speed;
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
            setLocation(getX(), getY() + 6);
        }
        if(Greenfoot.isKeyDown("r")){
            getWorld().addObject(new Rocket(), getX(), getY() + 20);
            //Updated upstream
            setLocation(getX(), getY() + speed);
        }
    }
    
    private void checkLocation() {
        if(getX()>=260){
            setLocation(116, getY());
        }
        if (getY() == 0) {
            setLocation(getX(), 450);
        }
    }
    
    private void checkCollision() {
        Play_Page playPage = (Play_Page)getWorld();
        if (isTouching(Car3.class)) {
            playPage.addCar1Health(-5);
            playPage.addCar1Health(-10);
            removeTouching(Car3.class);
        }
        if (isTouching(FinishLine.class) && !playPage.getWin()) {
            playPage.win(0);
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
            playPage.addCar1Coins(10);
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
}
