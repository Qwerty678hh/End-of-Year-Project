import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Home()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 6, image.getHeight() / 6);
        setImage(image);
    }
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            EndGame endGame = (EndGame)getWorld();
            endGame.home();
            getWorld().removeObject(this);
        }
    }
}
