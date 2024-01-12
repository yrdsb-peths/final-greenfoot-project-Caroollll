import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerup extends Actor
{
    /**
     * if maintankhard is intersecting the powerup actor, the maintankhard will 
     * be removed, and supertankhard will be added
     */
    public void act()
    {
        setLocation(getX() -5, getY());
        Maintankhard maintankhard = (Maintankhard) getOneIntersectingObject(Maintankhard.class);
        
        if(maintankhard != null) {
            getWorld().removeObject(maintankhard);
            getWorld().addObject(new Supertankhard(), 50, getY());
        }
    
    }
}
