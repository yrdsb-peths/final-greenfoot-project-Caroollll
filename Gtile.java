import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gtile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gtile extends Actor
{
    /**
     * Act - do whatever the Gtile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        Tutorial tutorial = (Tutorial) getWorld();
        if(getY() >= tutorial.getHeight())
        {
            tutorial.removeObject(this);
        }
    }
    
    public void setSpeed(int spd) {
        speed = spd;
    }
}