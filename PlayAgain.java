import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Actor
{
    /**
     * Act - do whatever the PlayAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            EndGame endGame = (EndGame)getWorld();
            int speed1 = endGame.getCar1Speed();
            int speed2 = endGame.getCar2Speed();
            int health1 = endGame.getCar1Health(); 
            int health2 = endGame.getCar2Health();
            int coins1 = endGame.getCar1Coins();
            int coins2 = endGame.getCar2Coins();
            boolean med1 = endGame.getMed1();
            boolean bat1 = endGame.getBat1();
            boolean med2 = endGame.getMed2();
            boolean bat2 = endGame.getBat2();
           Greenfoot.setWorld(new Play_Page(new Car1(speed1),new Car2(speed2),health1,health2,speed1,speed2,coins1,coins2,med1,bat1,med2,bat2));
        }
    }
}
