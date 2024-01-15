import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * player controls maintanktutorial in tutorial world
 * main tank can move and shoot. Maintank also has 3 lives.
 * 
 * @Carol Li
 * @01/15/24
 */
public class MaintankTutorial extends Actor
{
    /**
     * maintank moves up and down, and shoots 
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
