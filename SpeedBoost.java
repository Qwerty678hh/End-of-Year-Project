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
<<<<<<< HEAD
<<<<<<< HEAD
    public void act()
    {
        setLocation(getX(), getY() + 4);
        checkLocation();
    }
=======
=======
>>>>>>> 9e2e1491d4019ade770548f795f4975f899e799c
    public SpeedBoost(){
        GreenfootImage image = getImage(); 
        image.scale(image.getWidth() / 8, image.getHeight() / 8); 
        setImage(image);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 5);
        checkLocation();
    }
    
<<<<<<< HEAD
>>>>>>> 9e2e1491d4019ade770548f795f4975f899e799c
=======
>>>>>>> 9e2e1491d4019ade770548f795f4975f899e799c
    private void checkLocation() {
        if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
