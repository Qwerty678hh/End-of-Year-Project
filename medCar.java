import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class medCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class medCar extends characterselect
{
    public medCar(){
        GreenfootImage ambulance = new GreenfootImage("ambulance.png");
        ambulance.scale(ambulance.getWidth() / 4, ambulance.getHeight() / 4);
        ambulance.rotate(90);
        setImage(ambulance);
    }
    /**
     * Act - do whatever the medCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void updateImage()
    {
        // Add your action code here.
    }
}
