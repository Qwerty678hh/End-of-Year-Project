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
    private int distance;
    private boolean win;
    
    private int score;
    private int score2;
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page(Car1 p1, Car2 p2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new RaceTrack(), 150, 0);
        addObject(new RaceTrack(), 450, 0);
        addObject(p1, 372, 328);
        addObject(p2, 116, 328);
        car1Health = 100;
        car2Health = 100;
        distance = 500000;
        win = false;
    }
    
    public boolean getWin() {
        return win;
    }

    public void act(){
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Car3(), Greenfoot.getRandomNumber(600), 0);
        }
        if (Greenfoot.getRandomNumber(1000) < 7)
        {
            addObject(new OilSpill(), Greenfoot.getRandomNumber(600), 0);
        }
        if (Greenfoot.getRandomNumber(1000) < 7)
        {
            addObject(new SpeedBoost(), Greenfoot.getRandomNumber(600), 0);
        }
        showScore();
        showScore2();
        results();
        countDistance(); 
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
            distance = 1000;
        }
        if (car2Health == 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
            distance = 1000;
        }
    }
    
    public void win(int a) {
        if (a == 0) {
            showText("Car1 has won the race!", 300, 300);
            win = true;
        }
        else if (a == 1) {
            showText("Car2 has won the race!", 300, 300);
            win = true;
        }
    }
    
    public boolean countDistance() {
        if (distance > 0) {
            distance -= 10000;
        }
        else if (distance == 0) {
            setBackground("Bluerock.png");
            return true;
        }
        showDistance();
        if (distance == 6000000) {
            addObject(new FinishLine(), 300, 0); 
        }
        return false;
    }
    
    private void showDistance() {
        showText("Distance: " + distance, 100, 100);
    }
    
    private void showScore() {
        showText("Car1 Health: " + car1Health, 80, 25);
    }
    
    private void showScore2() {
        showText("Car2 Health: " + car2Health, 500, 25);
    }

}
