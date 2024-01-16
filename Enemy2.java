import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * enemy2 does the same things as enemy1. 
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Enemy2 extends Actor
{
    int mSpeed = 1; //move speed
    int sSpeed = 1; //shoot speed
    
    int wait;
    /**
     * enemy2 waits until wait is 0, then starts shooting so it doesn't shoot too fast
     * when enemy2 moves to the left side and behind the main tank, gameover 
     */
    public void act()
    {
        int x = getX() - mSpeed;
        int y = getY();
        setLocation(x, y);
        
        if(wait > 0)
            wait --;
        
        if(wait == 0)
            shoot();

        if(getX() <= 0) {
            removeTouching(Enemy2.class);
            Greenfoot.setWorld(new Gameover());
        }
    }
    /** 
     * enemy2 constructor 
     */
    public Enemy2() {
        wait = 50;
        GreenfootImage enemy2 = new GreenfootImage("images/enemy2.png");
        enemy2.scale(60, 40);
        setImage(enemy2);
    }
    
    /**
     * enemy2 shoots, bullet gets spawned in world
     */
    public void shoot() {
        Bullet2 bullet2 = new Bullet2();
        getWorld().addObject(bullet2, getX()-25, getY());
        wait = 200;
    }
}
