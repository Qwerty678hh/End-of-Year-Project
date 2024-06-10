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
    //trying to create image for batcar on screen - ryan
    medCar clickMed = new medCar();
    
    //create next button 
    //nextButton next = new nextButton(p1,p2);
    nextButton next = new nextButton();
    
    //create menu button
    menuButton menu = new menuButton();
        
    //steps are sequencial order of events - ryan
    //step 0 is player 1 choice, when they are ready to move on they press next
    //step 1 is player 2 choice, when they are ready to move on they press next
    //game starts when start button is pressed
    //players can press back button to reset character
    public int step = 0;
    // Flag to track if next button was clicked
    private boolean nextClicked = false;
    private boolean menuClicked = false;

    /**
     * Constructor for objects of class Settings_Page.
     * 
     */
    public Settings_Page(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
  
    public void act(){
        HandleClicks();
        
        if(step < 1){
            showText("Player 1, pick a car", 300, 50);
        }
        else if (step == 1){
            showText("Player 2, pick a car", 300, 50);
        }
        
        else if (step == 2){
            showText("Ready? ----->", 300, 50);
        }
    }
    
    public void HandleClicks(){
        redClick();
        blueClick();
        batClick();
        medClick();
        menuReturn();
        incrementStep();
    }
    public void prepare(){
        //trying to create image for blueCar on screen - ryan
        addObject(clickBlue, 240, 200);
        //trying to create image for redcar on screen - ryan
        addObject(clickRed, 240, 340);
        //trying to create image for batmobile on screen - ryan
        addObject(clickBat, 370, 340);
        //trying to create image for ambulance on screen - ryan
        addObject(clickMed, 370, 200);
        
        //numbers on screen to indicate which car - ryan
        GreenfootImage num1 = new GreenfootImage("num1.png");
        num1.scale(num1.getWidth()/23, num1.getHeight()/23);
        getBackground().drawImage(num1, 35, 320);
        GreenfootImage num2 = new GreenfootImage("num2.png");
        num2.scale(num1.getWidth(), num1.getHeight());
        getBackground().drawImage(num2, 505, 320);
        
        //numbers on screen to indicate which car - ryan
        GreenfootImage num1v2 = new GreenfootImage("num1.png");
        num1v2.scale(num1v2.getWidth()/40, num1v2.getHeight()/40);
        getBackground().drawImage(num1v2, 220, 110);
        GreenfootImage num2v2 = new GreenfootImage("num2.png");
        num2v2.scale(num1v2.getWidth(), num1v2.getHeight());
        getBackground().drawImage(num2v2, 220, 250);
        GreenfootImage num3 = new GreenfootImage("num3.png");
        num3.scale(num1v2.getWidth(), num1v2.getHeight());
        getBackground().drawImage(num3, 350, 110);
        GreenfootImage num4 = new GreenfootImage("num4.png");
        num4.scale(num1v2.getWidth(), num1v2.getHeight());
        getBackground().drawImage(num4, 350, 250);
        
        //add menu button
        addObject(menu, 50, 20);
        
        //add next button
        addObject(next, 550, 20);
        
        //player 1 image -  ryan
        addObject(p1,75,190);
        
        //player 2 image -  ryan
        addObject(p2,520,190);
    }
    
    public void incrementStep(){
        // Check for mouse click on next button or key press 'n'
        if (!nextClicked && (Greenfoot.mouseClicked(next) || Greenfoot.isKeyDown("n"))) {

            if(step != 2){
                step++;
            }
            else if (step == 2){
                Greenfoot.setWorld(new Play_Page(p1, p2)); 
            }
            nextClicked = true; // Set the flag to prevent multiple increments
        }

        // Reset the flag when the button is released
        if (!Greenfoot.mouseClicked(next) && !Greenfoot.isKeyDown("n")) {
            nextClicked = false;
        }
    }
    
    //in the following methods; - ryan
    //once a car is picked, it will appear large on each side - ryan
    //if the blue car is clicked for either player - ryan
    public void blueClick(){
        GreenfootImage blueImg = new GreenfootImage("car01-n.png");
        blueImg.scale(blueImg.getWidth() * 3, blueImg.getHeight() * 3);
        if (Greenfoot.mouseClicked(clickBlue)|| Greenfoot.isKeyDown("1")){
            //player1 click
            if(step != 1){
                p1.setImage(blueImg);
            }
            
            //player2 click
            else{
                p2.setImage(blueImg);
            }
        }
    }
    
    public void redClick(){
        GreenfootImage redImg = new GreenfootImage("car02-n.png");
        redImg.scale(redImg.getWidth() * 3, redImg.getHeight() * 3);
        if ((Greenfoot.mouseClicked(clickRed)|| Greenfoot.isKeyDown("2"))){
            if(step != 1){
                //player1 click
               p1.setImage(redImg);
            }
            else {
                //player2 click
                p2.setImage(redImg);
            }
        }
    }
    
    public void medClick(){
        GreenfootImage medImg = new GreenfootImage("ambulance.png");
        medImg.scale(medImg.getWidth() / 2, medImg.getHeight() /2);
        medImg.rotate(90);
        if (Greenfoot.mouseClicked(clickMed) || Greenfoot.isKeyDown("3")){
            if(step != 1){
                //player1 click21
                p1.setImage(medImg);
            }
            else {
                //player2 click
                p2.setImage(medImg);
            }
        }
    }
    
    public void batClick(){
        GreenfootImage batImg = new GreenfootImage("batmobile.png");
        batImg.scale(batImg.getWidth() / 5, batImg.getHeight() / 5);
        batImg.rotate(180);
        if (Greenfoot.mouseClicked(clickBat) || Greenfoot.isKeyDown("4")){
            //player1 click
            if(step != 1){
              p1.setImage(batImg);  
            }
            //player2 click
            else{
                p2.setImage(batImg);
            }
        }
    }
    
    //if menu button is pressed, step goes back 1
    //if step is at 0, returns to menu
    public void menuReturn(){
    if (!menuClicked && (Greenfoot.mouseClicked(menu) || Greenfoot.isKeyDown("b"))) {
        if(step == 0) {
            Greenfoot.setWorld(new HomePage());
        } else {
            step--;
        }
        menuClicked = true; // Set the flag to prevent multiple decrements
    }

    // Reset the flag when the button is released
    if (!Greenfoot.mouseClicked(menu) && !Greenfoot.isKeyDown("b")) {
        menuClicked = false;
    }
}
    
}
