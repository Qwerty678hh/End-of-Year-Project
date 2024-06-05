import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class redCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redCar extends Actor
{
    /**
     * Act - do whatever the redCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("a")) {
            if(Settings_Page.getplayer()==0){
                Settings_Page.redclick();
            }
        }
    }
}
