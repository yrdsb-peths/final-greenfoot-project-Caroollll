import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulletnormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulletnormal extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * Act - do whatever the Bulletnormal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        Enemy2 enemy2 = (Enemy2) getOneIntersectingObject(Enemy2.class);
        Enemy3 enemy3 = (Enemy3) getOneIntersectingObject(Enemy3.class);
        if(enemy1 != null&& getWorld() != null) {
            ((Normalworld) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy1);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            //getWorld().increaseScore();
            explosion1.play();
            
        }
        if(enemy2 != null && getWorld() != null) {
            ((Normalworld) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy2);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            explosion1.play();
            
        }
    }
}
