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
     * Act - do whatever the Powerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() -5, getY());
        Maintankhard maintankhard = (Maintankhard) getOneIntersectingObject(Maintankhard.class);
        if(maintankhard != null) {
            getWorld().removeObject(maintankhard);
            Supertankhard supertankhard = new Supertankhard();
            getWorld().addObject(supertankhard, getX(),getY());
        }
    }
}
