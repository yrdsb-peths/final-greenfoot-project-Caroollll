import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //setLocation(getX() +5, getY());
        move(10);
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        Enemy2 enemy2 = (Enemy2) getOneIntersectingObject(Enemy2.class);
        Enemy3 enemy3 = (Enemy3) getOneIntersectingObject(Enemy3.class);
        if(enemy1 != null) {
            Explode exp = new Explode();
            getWorld().removeObject(enemy1);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            //getWorld().increaseScore();
            
        }
        if(enemy2 != null) {
            Explode exp = new Explode();
            getWorld().removeObject(enemy2);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
        }
        if(enemy3 != null) {
            Explode exp = new Explode();
            getWorld().removeObject(enemy3);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
        }
    }
    
    /** 
     * bullet constructor 
     */
    public Bullet() {
        GreenfootImage bullet = new GreenfootImage("images/bullet.png");
        setImage(bullet);
        
    }
}
