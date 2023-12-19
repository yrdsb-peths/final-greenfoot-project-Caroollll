import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    int mSpeed = 1;
    int sSpeed = 1;
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX() - mSpeed;
        int y = getY();
        setLocation(x, y);
        

        shoot();
        //die();
    }

    public Enemy1() {
        GreenfootImage enemy1 = new GreenfootImage("images/enemy1.png");
        enemy1.scale(55, 30);
        setImage(enemy1);
    }
    
    public void shoot() {
        
        Bullet2 bullet2 = new Bullet2();
        MyWorld world = (MyWorld) getWorld();
        sleepFor(20);
        world.addObject(bullet2,getX()-25,getY());
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
