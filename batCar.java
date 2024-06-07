import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class batCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class batCar extends characterselect
{
    public batCar(){
        GreenfootImage batmobile = new GreenfootImage("batmobile.png");
        batmobile.scale(batmobile.getWidth()/12, batmobile.getHeight()/12);
        batmobile.rotate(180);
        setImage(batmobile);
    }
    
    /**
     * Act - do whatever the batCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void updateImage()
    {
        // Add your action code here.
    }
}
