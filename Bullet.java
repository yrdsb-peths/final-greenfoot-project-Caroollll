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
        setLocation(getX() +5, getY());
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        if(enemy1 != null) {
            getWorld().removeObject(enemy1);
            getWorld().removeObject(this);
        }
    }
    
    public Bullet() {
        GreenfootImage bullet = new GreenfootImage("images/bullet.png");
        setImage(bullet);
        
    }
}
