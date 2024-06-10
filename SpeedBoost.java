import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedBoost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedBoost extends Actor
{
    /**
     * Act - do whatever the SpeedBoost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        Play_Page playPage = (Play_Page)getWorld();
        //if (playPage.countDistance()) {
            //getWorld().removeObject(this);
        //}
        setLocation(getX(), getY() + 4);
        checkLocation();
    }

    public SpeedBoost(){
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth() / 8, image.getHeight() / 8); 
        setImage(image);
    }
    
    

    private void checkLocation() {
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
