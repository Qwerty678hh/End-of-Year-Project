import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuButton extends Actor
{
    public menuButton(){
        GreenfootImage menu = new GreenfootImage("back.png");
        menu.scale(menu.getWidth()/4, menu.getHeight()/4);
        setImage(menu);
    }
    
    /**
     * Act - do whatever the menuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        /*if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HomePage());
        }
        */
    }
}
