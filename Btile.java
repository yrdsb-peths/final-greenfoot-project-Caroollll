import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Btile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Btile extends Actor
{
    /**
     * Act - do whatever the Btile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 5;
        setLocation(x, y);
        
        Tutorial tutorial = (Tutorial) getWorld();
        if(getY() >= tutorial.getHeight())
        {
            tutorial.removeObject(this);
        }
    }
}
