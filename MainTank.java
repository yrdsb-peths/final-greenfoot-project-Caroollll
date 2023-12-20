import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainTank extends Actor
{
    /**
     * Act - do whatever the MainTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        checkKeyPressed();
        shoot();
        loseHP();
    }
    
    public MainTank() {
        GreenfootImage maintank = new GreenfootImage("images/maintank.png");
        maintank.scale(60, 50);
        setImage(maintank);
    }
    
    public void checkKeyPressed() {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+5);
        }
    }
    
    public void shoot() {
        if(Greenfoot.isKeyDown("space")) {
            
            Bullet bullet = new Bullet();
            MyWorld world = (MyWorld) getWorld();
            
            sleepFor(20);
            world.addObject(bullet,getX()+25,getY());
            
        }
        
    }
    int totalHP = 50;
    public void loseHP() {
        //MyWorld world = (MyWorld) getWorld();
        if(isTouching(Bullet2.class)) {
            totalHP--; 
            if(totalHP < 0) {
                World world = new Gameover();
                Greenfoot.setWorld(world);
            }
        }
    }
}
