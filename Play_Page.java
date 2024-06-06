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
    private int player1Health;
    private int player2Health;
    private int distance;
    private boolean win;
    
    private int score;
    private int score2;
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page(Player1 p1, Player2 p2)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(new RaceTrack(), 150, 0);
        addObject(new RaceTrack(), 450, 0);
        addObject(p1, 372, 328);
        addObject(p2, 116, 328);
        player1Health = 100;
        player2Health = 100;
        distance = 900000000;
        win = false;
    }
    
    public boolean getWin() {
        return win;
    }

    public void act(){
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Car3(), Greenfoot.getRandomNumber(600), 0);
        }
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new SpeedBoost(), Greenfoot.getRandomNumber(600), 0);
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
    
    public void addPlayer1Health(int damage) {
        player1Health += damage;
    }
    
    public void addPlayer2Health(int damage) {
        player2Health += damage;
    }
    
    private void results() {
        if (player1Health == 0) {
            showText("Car1 has died in a crash! Car2 has won!", 300, 200);
            Greenfoot.stop();
        }
        if (player2Health == 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
            Greenfoot.stop();
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
    
    private void showScore() {
        showText("Car1 Health: " + player1Health, 80, 25);
    }
    
    private void showScore2() {
        showText("Car2 Health: " + player2Health, 500, 25);
    }

}
