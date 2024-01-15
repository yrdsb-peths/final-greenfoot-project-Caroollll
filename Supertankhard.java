import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * supertank does the same things as maintank hard, but supertank does not
 * have any HP, meaning it cannot die when in this state. Supertank can also
 * shoot super bullets faster than maintankhard. 
 * Player can only stay supertank for 5 seconds
 * 
 * @Carol Li
 * @01/15/24
 */
public class Supertankhard extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
     * supertank moves up and down, and shoots 
     * when supertank timer is up, maintankhard is added back and supertank is removed
     */
    public void act()
    {
        checkKeyPressed();
        shoot();
        
        if(timer.millisElapsed() > 5000) {
            getWorld().addObject(new Maintankhard(), getX(), getY());
            getWorld().removeObject(this); 
        }
    }
    
    /** 
     * supertankhard constructor, starts supertank timer 
     */
    public Supertankhard() {
        GreenfootImage supertankhard = new GreenfootImage("images/supertank.png");
        supertankhard.scale(90, 80);
        setImage(supertankhard);
        
        timer.mark();
    }
    
    /** 
     * move supertank up and down by pressing up and down key
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
     * supertank shoots SUPERbullets when space button is pressed
     */
    public void shoot() {
        if(Greenfoot.isKeyDown("space")) {
            Superbullet superbullet = new Superbullet();
            sleepFor(5);
            getWorld().addObject(superbullet,getX()+25,getY());
            
        }
    }
}
