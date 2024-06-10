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
    private int car1Coins;
    private int car2Coins;
    private boolean win;
    
    private int score;
    private int score2;
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page(Car1 p1, Car2 p2, int car1Health, int car2Health, int car1Speed, int car2Speed)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        // Adds racetrack and cars
        addObject(new RaceTrack(), 100, 0);
        addObject(new RaceTrack(), 500, 0);
        addObject(p1, 372, 328);
        addObject(p2, 116, 328);
        // Current health
        this.car1Health = car1Health;
        this.car2Health = car2Health;
        // Stores original speed
        initSpeed1 = car1Speed;
        initSpeed2 = car2Speed;
        // Stores original health
        initHealth1 = car1Health;
        initHealth2 = car2Health;
        distance = 9000000;
        
        //scaling p1 - ryan
            GreenfootImage p1Img = new GreenfootImage(p1.getImage());
            p1Img.scale(p1Img.getWidth()/3, p1Img.getHeight()/3);
            p1.setImage(p1Img);
        
        //scaling p2 - ryan
            GreenfootImage p2Img = new GreenfootImage(p2.getImage());
            p2Img.scale(p2Img.getWidth()/3, p2Img.getHeight()/3);
            p2.setImage(p2Img);
        win = false;
        car1Coins = 0;
        car2Coins = 0;
    }
    
    public int getCar1Health() {
        return car1Health;
    }
    
    public int getCar2Health() {
        return car2Health;
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
        if (Greenfoot.getRandomNumber(1000) < 7)
        {
            addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);
        }
        showScore();
        showScore2();
        results();
        if (countDistance()) {
            Greenfoot.setWorld(new EndGame(initHealth1, initHealth2, initSpeed1, initSpeed2));
        }
    }
    
    public void addPlayer1Health(int damage) {
        player1Health += damage;
    }
    
    public void addPlayer2Health(int damage) {
        player2Health += damage;
    }
    
    public void addCar1Coins(int coins) {
        car1Coins += coins;
    }
    
    public void addCar2Coins(int coins) {
        car2Coins += coins;
    }
    
    private void results() {
        if (player1Health == 0) {
            showText("Car1 has died in a crash! Car2 has won!", 300, 200);
        }
        if (player2Health == 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
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
        showText("Car1 Health: " + player1Health, 80, 25);
    }
    
    private void showScore2() {
        showText("Car2 Health: " + player2Health, 500, 25);
    }

}
