import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the superbullet actor that supertankhard shoots in hard world
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Superbullet extends Actor
{
    /**
     * checks if bullethard is touching enemy1, 2 and 3. If touching, 
     * score increases, explosion animation plays, explode sound plays, 
     * DOES NOT removes bullet(makes the button shoot all the enemies behind
     * too and removes enemies
     */
    public void act()
    {
        move(10);
        
        Enemy1 enemy1 = (Enemy1) getOneIntersectingObject(Enemy1.class);
        Enemy2 enemy2 = (Enemy2) getOneIntersectingObject(Enemy2.class);
        Enemy3 enemy3 = (Enemy3) getOneIntersectingObject(Enemy3.class);
        if(enemy1 != null&& getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explosions explosions = new Explosions();
            getWorld().removeObject(enemy1);
            getWorld().addObject(explosions, getX(),getY());
            //getWorld().removeObject(this);
            //explosion1.play();
        }
        if(enemy2 != null && getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explosions explosions = new Explosions();
            getWorld().removeObject(enemy2);
            getWorld().addObject(explosions, getX(),getY());
            //getWorld().removeObject(this);
            //explosion1.play();
        }
        if(enemy3 != null && getWorld() != null) {
            ((Hardworld) getWorld()).increaseScore();
            Explosions explosions = new Explosions();
            getWorld().removeObject(enemy3);
            getWorld().addObject(explosions, getX(),getY());
            //getWorld().removeObject(this);
            //explosion1.play();
        }
    }
}
