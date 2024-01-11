import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Powerup extends Actor
{
    int wait;
    /**
     * if maintankhard is intersecting the powerup actor, the maintankhard will 
     * be removed, and supertankhard will be added
     */
    public void act()
    {
        setLocation(getX() -5, getY());
        Maintankhard maintankhard = (Maintankhard) getOneIntersectingObject(Maintankhard.class);
        Supertankhard supertankhard = new Supertankhard();
        if(maintankhard != null) {
            getWorld().removeObject(maintankhard);
            //Supertankhard supertankhard = new Supertankhard();
            getWorld().addObject(supertankhard, getX(),getY());
        }
        
        /**wait = 600;
        if(wait > 0)
            wait --;
        
        if(wait == 0)
            getWorld().removeObject(supertankhard);
            //Maintankhard maintankhard = new Maintankhard();
            getWorld().addObject(maintankhard, getX(), getY()); **/
            
            
    }
}
