import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settingsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nextButton extends Actor
    {
    //private Player1 p1;
    //private Player2 p2;
    
    public nextButton(){
        //Player1 p1, Player2 p2
        //this.p1 = p1;
        //this.p2 = p2;
        GreenfootImage next = new GreenfootImage("next.png");
        next.scale(next.getWidth()/4, next.getHeight()/4);
        setImage(next);
    }
    
    /**
     * Act - do whatever the settingsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            System.out.println("nextButton clicked");
            ((Settings_Page)getWorld()).incrementStep();
        }
    }
}
