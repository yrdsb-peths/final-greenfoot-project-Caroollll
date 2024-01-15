import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the bullet actor that maintanktutorial shoots in the tutorial world
 * 
 * @Carol
 * @01/15/24
 */
public class BulletTutorial extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * checks if bullettutoiral is touching enemytutorial. if touching, 
     * score increases, explosion animation, and removes enemy
     */
    public void act()
    {
        move(10);
        
        Enemy1TUTORIAL enemy1tutorial = (Enemy1TUTORIAL) getOneIntersectingObject(Enemy1TUTORIAL.class);
        if(enemy1tutorial != null&& getWorld() != null) {
            ((Tutorial) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy1tutorial);
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
