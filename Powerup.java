import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * powerup will give the maintank in hardworld a boost and turn into 
 * supertank. 
 * 
 * @Carol Li 
 * @01/15/24
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
