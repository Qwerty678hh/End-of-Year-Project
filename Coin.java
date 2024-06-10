import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Coin() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);
        setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 4);
        checkLocation();
    }
    private void checkLocation() {
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
