import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings_Page extends World
{
    //attempting to create cars at menu screen to pass along through screens - ryan
    Car1 p1 = new Car1();
    Car2 p2 = new Car2();
    private static int player = 0;
    /**
     * Constructor for objects of class Settings_Page.
     * 
     */
    public Settings_Page(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        act();
    }
    
    public void prepare(){
        //trying to create image for blueCar on screen - ryan
        GreenfootImage blueCar = new GreenfootImage("car01-n.png");
        getBackground().drawImage(blueCar, 225, 125);
        //trying to create image for redcar on screen - ryan
        addObject(new redCar(), 240, 310);
        //trying to create image for ambulance on screen - ryan
        GreenfootImage ambulance = new GreenfootImage("ambulance.png");
        ambulance.scale(ambulance.getWidth() / 4, ambulance.getHeight() / 4);
        ambulance.rotate(90);
        getBackground().drawImage(ambulance, 325, 120);
        //trying to create image for batmobile on screen - ryan
        GreenfootImage batmobile = new GreenfootImage("batmobile.png");
        batmobile.scale(batmobile.getWidth()/12, batmobile.getHeight()/12);
        batmobile.rotate(180);
        getBackground().drawImage(batmobile, 318, 260);
        //just an example of layout - ryan
        //once a car is picked, it will appear large on each side - ryan
        /*
        ex:
        GreenfootImage batmobile2 = new GreenfootImage("batmobile.png");
        batmobile2.scale(batmobile2.getWidth()/4, batmobile2.getHeight()/4);
        batmobile2.rotate(180);
        getBackground().drawImage(batmobile2, 350, 50);
        */
        //numberplacements - ryan
        //tried to put numbers on screen to indicate which car, but does not work - ryan
        GreenfootImage num1 = new GreenfootImage("num1.png");
        num1.scale(num1.getWidth()/23, num1.getHeight()/23);
        getBackground().drawImage(num1, 20, 300);
        GreenfootImage num2 = new GreenfootImage("num2.png");
        num2.scale(num1.getWidth(), num1.getHeight());
        getBackground().drawImage(num2, 510, 300);
    }

    public void act(){
        if(player == 0){
            showText("Player 1, pick a car", 300, 50);
        }
    }
    
    public static int getplayer(){
        return player;
    }
    
    public void redclick(){
        p1.setImage("car01-n.png");
    }
}
