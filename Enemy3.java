import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * enemy3 does the same things as enemy1 and enemy2. 
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Enemy3 extends Actor
{
    int mSpeed = 1; //move speed
    int sSpeed = 1; //shoot speed
    
    int wait;
    /**
     * enemy3 waits until wait is 0, then starts shooting so it doesn't shoot too fast
     * when enemy3 moves to the left side and behind the main tank, gameover 
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
            removeTouching(Enemy3.class);
            Greenfoot.setWorld(new Gameover());
        }
    }
    /** 
     * enemy3 constructor 
     */
    public Enemy3() {
        wait = 50;
        GreenfootImage enemy3 = new GreenfootImage("images/enemy3.png");
        enemy3.scale(60, 40);
        setImage(enemy3);
    }
    
    /**
     * enemy3 shoots, bullet gets spawned in world
     */
    public void shoot() {
        Bullet2 bullet2 = new Bullet2();
        getWorld().addObject(bullet2, getX()-25, getY());
        wait = 200;
    }
}
