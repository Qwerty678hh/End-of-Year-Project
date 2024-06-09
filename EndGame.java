import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{

    /**
     * Constructor for objects of class EndGame.
     * 
     */
    private int car1Health;
    private int car2Health;
    private int car1Speed;
    private int car2Speed; 
    private PlayAgain pa;
    private Shop shop; 
    private StatsButton statsButton;
    private SkinsButton skinsButton;
    private HealthUpgrade healthUpgrade;
    private SpeedUpgrade speedUpgrade;
    private HealthBar healthBar;
    private SpeedBar speedBar;
    private Car1Button car1Button;
    private Car2Button car2Button;
    private Home homeButton;
    private int player;
    private boolean home;
    
    public EndGame(int car1Health, int car2Health, int car1Speed, int car2Speed)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        // Play Again Button
        pa = new PlayAgain();
        addObject(pa, 300, 100);
        // Shop button
        shop = new Shop();
        addObject(shop, 300, 300);
        // Stats button
        statsButton = new StatsButton();
        // Skins button
        skinsButton = new SkinsButton();
        // Health upgrade button
        healthUpgrade = new HealthUpgrade();
        // Speed upgrade button
        speedUpgrade = new SpeedUpgrade();
        // Health and speed bars
        healthBar = new HealthBar();
        speedBar = new SpeedBar();
        // Car1 and Car2 Buttons
        car1Button = new Car1Button();
        car2Button = new Car2Button();
        // Starting health variables
        this.car1Health = car1Health;
        this.car2Health = car2Health;
        // Home
        homeButton = new Home();
    }
    
    public int getCar1Health() {
        return car1Health;
    }
    
    public int getCar2Health() {
        return car2Health;
    }
    
    public int getCar1Speed() {
        return car1Speed;
    }
    
    public int getCar2Speed() {
        return car2Speed;
    }
    
    public boolean getHome() {
        return home;
    }
    
    public void shop() {
        removeObject(pa);
        removeObject(shop);
        addObject(car1Button, 300, 200);
        addObject(car2Button, 300, 300);
        addObject(homeButton, 100, 550);
    }
    
    public void car1() {
        removeObject(car1Button);
        removeObject(car2Button);
        addObject(statsButton, 300, 200);
        addObject(skinsButton, 300, 300);
        player = 1;
    }
    
    public void car2() {
        removeObject(car1Button);
        removeObject(car2Button);
        addObject(statsButton, 300, 200);
        addObject(skinsButton, 300, 300);
        player = 2;
    }
    
    public void stats() {
        removeObject(statsButton);
        removeObject(skinsButton);
        addObject(healthUpgrade, 250, 150);
        addObject(speedUpgrade, 250, 450);
        addObject(healthBar, 550, 150);
        addObject(speedBar, 550, 450);
        if (player == 1) {
            // Health
            if (car1Health == 25) {
                healthBar.setImage("Level1.png");
            }
            else if (car1Health == 30) {
                healthBar.setImage("Level2.png");
            }   
            else if (car1Health == 35) {
                healthBar.setImage("Level3.png");
            }
            else if (car1Health == 40) {
                healthBar.setImage("Level4.png");
            }
            else if (car1Health == 45) {
                healthBar.setImage("Level5.png");
            }
            // Speed
            if (car1Speed == 25) {
                speedBar.setImage("Level1.png");
            }
            else if (car1Speed == 30) {
                speedBar.setImage("Level2.png");
            }   
            else if (car1Speed == 35) {
                speedBar.setImage("Level3.png");
            }
            else if (car1Speed == 40) {
                speedBar.setImage("Level4.png");
            }
            else if (car1Speed == 45) {
                speedBar.setImage("Level5.png");
            }
        }
        else if (player == 2) {
            if (car2Health == 25) {
                healthBar.setImage("Level1.png");
            }
            else if (car2Health == 30) {
                healthBar.setImage("Level2.png");
            }   
            else if (car2Health == 35) {
                healthBar.setImage("Level3.png");
            }
            else if (car2Health == 40) {
                healthBar.setImage("Level4.png");
            }
            else if (car2Health == 45) {
                healthBar.setImage("Level5.png");
            }
        }
    }
    
    public void healthUpgrade() {
        if (player == 1) {
            if (car1Health == 25) {
                car1Health += 5;
                healthBar.setImage("Level2.png");
            }   
            else if (car1Health == 30) {
                car1Health += 5;
                healthBar.setImage("Level3.png");
            }
            else if (car1Health == 35) {
                car1Health += 5;
                healthBar.setImage("Level4.png");
            }
            else if (car1Health == 40) {
                car1Health += 5;
                healthBar.setImage("Level5.png");
            }
        }
        else if (player == 2) {
            if (car2Health == 25) {
                car2Health += 5;
                healthBar.setImage("Level2.png");
            }   
            else if (car2Health == 30) {
                car2Health += 5;
                healthBar.setImage("Level3.png");
            }
            else if (car2Health == 35) {
                car2Health += 5;
                healthBar.setImage("Level4.png");
            }
            else if (car2Health == 40) {
                car2Health += 5;
                healthBar.setImage("Level5.png");
            }
        }
    }
    
    public void home() {
        removeObject(car1Button);
        removeObject(car2Button);
        removeObject(healthBar);
        removeObject(healthUpgrade);
        removeObject(shop);
        removeObject(skinsButton);
        removeObject(speedBar);
        removeObject(speedUpgrade);
        removeObject(statsButton);
        addObject(pa, 300, 100);
        addObject(shop, 300, 300);
    }
}
