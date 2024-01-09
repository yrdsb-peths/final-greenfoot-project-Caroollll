import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Supertankhard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Supertankhard extends Actor
{
    /**
     * Act - do whatever the Supertankhard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPressed();
        shoot();
    }
    
    /** 
     * maintankhard constructor
     */
    public Supertankhard() {
        GreenfootImage supertankhard = new GreenfootImage("images/supertank.png");
        supertankhard.scale(90, 80);
        setImage(supertankhard);
    }
    
    /** 
     * move maintank up and down by pressing up and down key
     */
    public void checkKeyPressed() {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+5);
        }
    }
    
    /** 
     * maintank shoots bullets when space button is pressed
     */
    public void shoot() {
        if(Greenfoot.isKeyDown("space")) {
            Superbullet superbullet = new Superbullet();
            sleepFor(5);
            getWorld().addObject(superbullet,getX()+25,getY());
            
        }
    }
}
