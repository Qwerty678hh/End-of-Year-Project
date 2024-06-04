import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OilSpill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OilSpill extends Actor
{
    /**
     * Act - do whatever the OilSpill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public OilSpill(){
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth() / 8, image.getHeight() / 8); 
        setImage(image);
    }
    public void act()
    {
        setLocation(getX(), getY() + 5);
        checkLocation();
    }
    
    private void checkLocation() {
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
