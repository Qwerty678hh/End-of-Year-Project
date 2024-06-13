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
        image.scale(image.getWidth() / 12, image.getHeight() / 12); 
        setImage(image);
    }
    public void act()
    {
        Play_Page playPage = (Play_Page)getWorld();
        //if (playPage.countDistance()) {
            //getWorld().removeObject(this);
        //}
        setLocation(getX(), getY() + 5);
        checkLocation();
    }
    
    private void checkLocation() {
        if(getX()>=250 && getX()<=340){
            getWorld().removeObject(this);
        }
        else if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
