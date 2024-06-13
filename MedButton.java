import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmbulanceButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedButton extends Actor
{
    /**
     * Act - do whatever the AmbulanceButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        EndGame endGame = (EndGame)getWorld();
        if (Greenfoot.mouseClicked(this)) {
            endGame.medButton();
        }
    }
}
