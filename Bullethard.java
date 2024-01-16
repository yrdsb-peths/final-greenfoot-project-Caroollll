import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the bullet actor that maintankhard shoots in hardworld
 * 
 * @Carol
 * @01/15/24
 */
public class Bullethard extends Actor
{
    GreenfootSound explosion1 = new GreenfootSound("explosion1.wav");
    /**
     * checks if bullethard is touching enemy1, 2 and 3. If touching, 
     * score increases, explosion animation plays, explode sound plays removes bullet and 
     * removes enemies
     */
    public void act()
    {
        move(10);
        
        //checking if bullethard is intersecting the enemy classes
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        Enemy2 enemy2 = (Enemy2) getOneIntersectingObject(Enemy2.class);
        Enemy3 enemy3 = (Enemy3) getOneIntersectingObject(Enemy3.class);
        if(enemy1 != null&& getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy1);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            explosion1.play();
        }
        if(enemy2 != null && getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy2);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            explosion1.play();
            
        }
        if(enemy3 != null && getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explode exp = new Explode();
            getWorld().removeObject(enemy3);
            getWorld().addObject(exp, getX(),getY());
            getWorld().removeObject(this);
            explosion1.play();
        }
    }
}
