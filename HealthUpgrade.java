import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthUpgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthUpgrade extends Actor
{
    /**
     * Act - do whatever the HealthUpgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthUpgrade() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
    
    public void act()
    {
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.healthUpgrade();
        }
    }
}
