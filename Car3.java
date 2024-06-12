import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car3 extends Actor
{
    public Car3(){
        turn(180);
    }
    /**
     * Act - do whatever the Car3 wants to do. This method is called whenever
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
    
    private void checkLocation() {
        if(getX()>=250 && getX()<=340){
            getWorld().removeObject(this);
        }
        else if (getY() == 599) {
            getWorld().removeObject(this);
        }
    }
}
