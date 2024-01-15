import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * enemy1 moves left and shoots bullets. If enemy1 reaches the end of
 * of the screen, the game will be over.
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Enemy1 extends Actor
{
    int mSpeed = 1; //move speed
    int sSpeed = 1; //shoot speed
    
    int wait;
    /**
     * enemy1 waits until wait is 0, then starts shooting so it doesn't shoot too fast
     * when enemy1 moves to the left side and behind the main tank, gameover 
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
        //die();
        
        if(getX() <= 0) {
            removeTouching(Enemy1.class);
            Greenfoot.setWorld(new Gameover());
        }
    }
    /** 
     * enemy1 constructor 
     */
    public Enemy1() {
        wait = 50;
        GreenfootImage enemy1 = new GreenfootImage("images/enemy1.png");
        enemy1.scale(55, 30);
        setImage(enemy1);
    }
    
    /**
     * enemy1 shoots, bullet gets spawned in world
     */
    public void shoot() {
        Bullet2 bullet2 = new Bullet2();
        getWorld().addObject(bullet2, getX()-25, getY());
        wait = 200;
    }
    
    int enemy1HP = 20;
    /**public void die() {
        if(isTouching(Bullet.class)) {
            enemy1HP--;
            if(enemy1HP <0) {
                removeTouching(Enemy1.class);
                MyWorld world = (MyWorld) getWorld();
                world.createEnemy1(); 
            }
        }
    } **/
}
