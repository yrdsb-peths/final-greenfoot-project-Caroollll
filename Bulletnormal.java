import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the bullet actor that maintanknormal shoots in normalworld
 * 
 * @Carol
 * @01/15/24
 */
public class Bulletnormal extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * checks if bullethard is touching enemy1 and 2. If touching, 
     * score increases, explosion animation, and removes enemies
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
