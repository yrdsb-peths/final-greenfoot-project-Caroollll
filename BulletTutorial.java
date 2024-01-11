import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BulletTutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BulletTutorial extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * Act - do whatever the BulletTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        if(enemy1 != null&& getWorld() != null) {
            ((Tutorial) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy1);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            explosion1.play();
        }
    }
    
    /** 
     * bullet constructor 
     */
    public BulletTutorial() {
        GreenfootImage bullettutorial = new GreenfootImage("images/bullet.png");
        setImage(bullettutorial);
        
    }
}
