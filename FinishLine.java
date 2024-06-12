import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishLine extends Actor
{
    /**
     * Act - do whatever the FinishLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FinishLine() {
        GreenfootImage finish = getImage();
        finish.scale(finish.getWidth() / 2, finish.getHeight());
        setImage(finish);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 2);
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
