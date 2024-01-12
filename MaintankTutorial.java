import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MaintankTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MaintankTutorial extends Actor
{
    /**
     * Act - do whatever the MaintankTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPressed();
        shoot();
    
        if(isTouching(Bullet2.class)) {
            Warning warning = new Warning();
            ((Tutorial) getWorld()).addObject(warning, 325, 300);
        }
    }
    
    /** 
     * maintank constructor
     */
    public MaintankTutorial() {
        GreenfootImage maintanktutorial = new GreenfootImage("images/maintank.png");
        maintanktutorial.scale(60, 50);
        setImage(maintanktutorial);
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
            BulletTutorial bullettutorial = new BulletTutorial();
            sleepFor(20);
            getWorld().addObject(bullettutorial,getX()+25,getY());
            
        }
        
    }
}
