import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Page extends World
{
    /*
    private int[][] exclusionZones = {
        {250, y1, x2, y2}
    };
    */
    private Car1 p1;
    private Car2 p2;
    private RaceTrack raceTrack1;
    private RaceTrack raceTrack2;
    // Instance variables
    private int car1Health;
    private int car2Health;
    private int car1Distance;
    private int car2Distance;
    private int distance;
    private int car1Coins;
    private int car2Coins;
    private int initSpeed1;
    private int initSpeed2;
    private int initHealth1;
    private int initHealth2;
    private boolean win;
    private int time;
    
    private int score;
    private int score2;
    private int play;
    
    // Settings
    private static int player = 0;
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
        
    //make indicator dot
    private dot dot1;
    
    //steps are sequencial order of events - ryan
    //step 0 is player 1 choice, when they are ready to move on they press next
    //step 1 is player 2 choice, when they are ready to move on they press next
    //game starts when start button is pressed
    //players can press back button to reset character
    public int step = 0;
    // Flag to track if next button was clicked
    private boolean nextClicked = false;
    private boolean menuClicked = false;
    private boolean finish = false;
    /**
     * Constructor for objects of class Play_Page.
     * 
     */
    public Play_Page(Car1 p1, Car2 p2, int car1Health, int car2Health, int car1Speed, int car2Speed, int car1Coins, int car2Coins)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        // Adds racetrack and cars
        this.p1 = p1;
        this.p2 = p2;
        dot1 = new dot();
        // Current health
        this.car1Health = car1Health;
        this.car2Health = car2Health;
        // Stores original speed
        initSpeed1 = car1Speed;
        initSpeed2 = car2Speed;
        // Stores original health
        initHealth1 = car1Health;
        initHealth2 = car2Health;
        car1Distance = 9000;
        car2Distance = 9000;
        
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
        time = 30000;
        play = 2;
        prepare();
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
        if (play == 1) {
            if (Greenfoot.getRandomNumber(1000) < 7) {
                addObject(new Car3(), Greenfoot.getRandomNumber(600), 0);
            }
            if (Greenfoot.getRandomNumber(100) < 1) {
                addObject(new SpeedBoost(), Greenfoot.getRandomNumber(600), 0);
            }
            if (Greenfoot.getRandomNumber(1000) < 6)
            {
                addObject(new OilSpill(), Greenfoot.getRandomNumber(600), 0);
            }
            if (Greenfoot.getRandomNumber(1000) < 6)
            {
                addObject(new SpeedBoost(), Greenfoot.getRandomNumber(600), 0);
            }
            if (Greenfoot.getRandomNumber(1000) < 6)
            {
                addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);
            }
            showScore();
            showScore2();
            showBlank();
            results();
            if (countDistance()) {
                Greenfoot.setWorld(new EndGame(initHealth1, initHealth2, initSpeed1, initSpeed2, car1Coins, car2Coins));
            }
            if (time == 0) {
                Greenfoot.setWorld(new EndGame(initHealth1, initHealth2, initSpeed1, initSpeed2, car1Coins, car2Coins));
            }
        }
        else if (play == 2) {
            HandleClicks();
            controlDot();
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
    }
    
    public void addCar1Health(int damage) {
        car1Health += damage;
    }
    
    public void addCar2Health(int damage) {
        car2Health += damage;
    }
    
    public void addCar1Coins(int coins) {
        car1Coins += coins;
    }
    
    public void addCar2Coins(int coins) {
        car2Coins += coins;
    }
    
    public void results() {
        if (car1Health == 0 || car1Health < 0) {
            showText("Car1 has died in a crash! Car2 has won!", 300, 200);
            time -= 300;
        }
        if (car2Health == 0 || car2Health < 0) {
            showText("Car2 has died in a crash! Car1 has won!", 300, 200);
            time -= 300;
        }
        if (win) {
            time -= 300;
        }
        /*if (a == 0) {
            showText("Car1 has won the race!", 300, 300);
            win = true;
            time -= 300;
        }
        else if (a == 1) {
            showText("Car2 has won the race!", 300, 300);
            win = true;
            time -= 300;
        }*/
    }
    
    public void win(int a) {
        if (a == 0) {
            showText("Car1 has won the race!", 300, 300);
        }
        else if (a == 1) {
            showText("Car2 has won the race!", 300, 300);
        }
        win = true;
    }
    
    public boolean countDistance() {
        if (car1Distance > 0) {
            car1Distance -= p1.getSpeed();
        }
        else if (car1Distance == 0) {
            return true;
        }
        if (car2Distance > 0) {
            car2Distance -= p2.getSpeed();
        }
        else if (car2Distance == 0) {
            return true;
        }
        showDistance();
        if (distance == 6000000) {
            addObject(new FinishLine(), 300, 0); 
        }
        return false;
    }
    
    private void showDistance() {
        showText("Distance: " + distance, 106, 100);
    }
    
    private void showBlank() {
        showText("", 300, 50);
    }
    
    private void showScore() {
        showText("Car1 Health: " + car1Health, 80, 25);
    }
    
    private void showScore2() {
        showText("Car2 Health: " + car2Health, 500, 25);
    }
    
    private void play() {
        addObject(new Grass(),200,220);
        addObject(new Grass(),200,120);
        addObject(new Grass(),200,300);
        addObject(new Grass(),200,400);
        //trying to create image for blueCar on screen - ryan
        removeObject(clickBlue);
        //trying to create image for redcar on screen - ryan
        removeObject(clickRed);
        //trying to create image for batmobile on screen - ryan
        removeObject(clickBat);
        //trying to create image for ambulance on screen - ryan
        removeObject(clickMed);
        //add menu button
        removeObject(menu);
        showText("",300,50);
        
        showText("", 300, 50);
        //add next button
        removeObject(next);
        
        //player 1 image -  ryan
        removeObject(p1);
        
        //player 2 image -  ryan
        removeObject(p2);
        getObjects(dot.class);
        
        GreenfootImage p1Img = new GreenfootImage(p1.getImage());
        p1Img.scale(p1Img.getWidth() / 3, p1Img.getHeight() / 3);
        p1.setImage(p1Img);
        
        GreenfootImage p2Img = new GreenfootImage(p2.getImage());
        p2Img.scale(p2Img.getWidth() / 3, p2Img.getHeight() / 3);
        p2.setImage(p2Img);
        
        
        addObject(new RaceTrack(), 110, 0);
        addObject(new RaceTrack(), 490, 0);
        addObject(p2, 476, 470);
        addObject(p1, 116, 470);
    }
    
    private void controlDot(){
        if(step == 0){
            if (!getObjects(dot.class).contains(dot1)) {
                addObject(dot1, 170, 490);
            } else {
                dot1.setLocation(170, 490);
            }
        } 
        else if(step != 0){
            if (getObjects(dot.class).contains(dot1)) {
                dot1.setLocation(420, 490);
            } else {
                addObject(dot1, 420, 490);
            }
        }
    }
    
    // Settings page settings
    public void HandleClicks(){
        redClick();
        blueClick();
        batClick();
        medClick();
        menuReturn();
        incrementStep();
    }
    
    public void prepare(){
        controlDot();
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
        num1.scale(num1.getWidth()/15, num1.getHeight()/15);
        getBackground().drawImage(num1, 35, 440);
        GreenfootImage num2 = new GreenfootImage("num2.png");
        num2.scale(num1.getWidth(), num1.getHeight());
        getBackground().drawImage(num2, 460, 440);
        
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
        addObject(p1,75,230);
        
        //player 2 image -  ryan
        addObject(p2,520,230);
    }
    
    public void incrementStep(){
        // Check for mouse click on next button or key press 'n'
        if (!nextClicked && (Greenfoot.mouseClicked(next) || Greenfoot.isKeyDown("n"))) {

            if(step != 2){
                step++;
            }
            else if (step == 2){
                step++;
                play();
                showText("", 300, 50);
                play = 1; 
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
        medImg.scale(medImg.getWidth() / 2, medImg.getHeight() / 2);
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
