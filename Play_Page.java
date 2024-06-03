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
    
    private int score;
    private int score2;
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new RaceTrack(), 300, 0);
        addObject(new Car1(), 116, 328);
        addObject(new Car2(), 372, 328);
        car1Health = 100;
        car2Health = 100;
        distance = 9000000;
        showScore();
        showScore2();
    }
    
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Car3(), Greenfoot.getRandomNumber(600), 0);
        }
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
            Greenfoot.stop();
        }
        if (car2Health == 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
            Greenfoot.stop();
        }
    }
    
    public void win(int a) {
        if (a == 0) {
            showText("Car1 has won the race!", 300, 300);
        }
        else if (a == 1) {
            showText("Car2 has won the race!", 300, 300);
        }
    }
    
    private void countDistance() {
        if (distance > 0) {
            distance -= 10000;
        }
        else if (distance == 0) {
            Greenfoot.stop();
        }
        showDistance();
        if (distance == 6000000) {
            addObject(new FinishLine(), 300, 0); 
        }
        
    }
    
    private void showDistance() {
        showText("Distance: " + distance, 100, 100);
    }
    public void addScore(int points) {
        score += points;
        showScore();
        if(score <= 0) {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    private void showScore() {
        showText("Score: " + score, 80, 25);
    }
    public void addScore2(int points) {
        score2 += points;
        showScore2();
        if(score2 <= 0) {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
        private void showScore2() {
        showText("Score: " + score2, 180, 25);
    }
    }

}
