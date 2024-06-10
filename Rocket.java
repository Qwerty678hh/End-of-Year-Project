import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
   private int speed = 5;
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
    public void act()
    {
        setRotation(90);
        move(-speed);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            checkCollision();
        }
    }
    private void checkCollision(){
        if(isTouching(Car3.class)) {
            Play_Page playPage = (Play_Page) getWorld();
            removeTouching(Car3.class);
            //getWorld().removeObject(this);
            
        }
    }
}
