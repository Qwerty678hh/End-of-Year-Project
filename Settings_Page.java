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
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
    //trying to create image for redcar on screen - ryan
    redCar clickRed = new redCar();
    //trying to create image for bluecar on screen - ryan
    blueCar clickBlue = new blueCar();
    //trying to create image for batcar on screen - ryan
    batCar clickBat = new batCar();
    
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
  
    public void act(){
        if(player == 0){
            showText("Player 1, pick a car's trunk", 300, 50);
        }
        redClick();
    }
    
    public void prepare(){
        //trying to create image for blueCar on screen - ryan
        addObject(clickBlue, 240, 160);
        //trying to create image for redcar on screen - ryan
        addObject(clickRed, 240, 310);
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
        getBackground().drawImage(num1, 35, 320);
        GreenfootImage num2 = new GreenfootImage("num2.png");
        num2.scale(num1.getWidth(), num1.getHeight());
        getBackground().drawImage(num2, 505, 320);
        //player 1 image -  ryan
        addObject(p1,75,144);
    }
    
    public static int getplayer(){
        return player;
    }
    
    //if the red car is clicked for either player - ryan
    public void redClick(){
        //player1 click
        if (Greenfoot.mouseClicked(clickRed)){
            GreenfootImage redImg = new GreenfootImage("car02-n.png");
            redImg.scale(redImg.getWidth() * 3, redImg.getHeight() * 3);
            p1.setImage(redImg);
        }
    }
    
    public void blueClick(){
        //player1 click
        if (Greenfoot.mouseClicked(clickBlue)){
            GreenfootImage blueImg = new GreenfootImage("car01-n.png");
            blueImg.scale(blueImg.getWidth() * 3, blueImg.getHeight() * 3);
            p1.setImage(blueImg);
        }
    }
    
    public void batClick(){
        //player1 click
        if (Greenfoot.mouseClicked(clickBat)){
            GreenfootImage batImg = new GreenfootImage("batmobile.png");
            batImg.scale(batImg.getWidth() / 10, batImg.getHeight() / 10);
            p1.setImage(batImg);
        }
    }
}
