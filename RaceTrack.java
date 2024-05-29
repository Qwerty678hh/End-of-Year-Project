import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RaceTrack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaceTrack extends Actor
{
    /**
     * Act - do whatever the RaceTrack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RaceTrack() {
        GreenfootImage track = getImage();
        track.scale(track.getWidth() * 2, track.getHeight());
        setImage(track);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 4);
        if (getY() == 599) {
            setLocation(300,0);
        }
    }
}
