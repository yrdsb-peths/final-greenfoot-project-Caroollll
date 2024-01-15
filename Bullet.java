import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *the bullet actor that maintank shoots in easy world(MyWorld)
 * 
 * @Carol
 * @01/15/24
 */
public class Bullet extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * checks if bullet is touching enemy1, if touching score increases,
     * enemy explodes and gets removed from world
     */
    public void act()
    {
        move(10);
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        if(enemy1 != null&& getWorld() != null) {
            ((MyWorld) getWorld()).increaseScore();
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
    public Bullet() {
        GreenfootImage bullet = new GreenfootImage("images/bullet.png");
        setImage(bullet);
        
    }
}
