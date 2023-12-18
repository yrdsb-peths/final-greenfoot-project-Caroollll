import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Actor
{
    /**
     * Act - do whatever the Blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Btile.class) && Greenfoot.isKeyDown("d")) {
            removeTouching(Btile.class);
        }
    }
    
    public Blue() {
        GreenfootImage blue = new GreenfootImage("images/blue.png");
        blue.scale(70, 70);
        setImage(blue);
    }
}
