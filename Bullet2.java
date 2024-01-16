import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bullet that all enemies shoot
 * 
 *@Carol
 * @01/15/24
 */
public class Bullet2 extends Actor
{
    /**
     * the bullet continuously moves 5 to the left
     */
    public void act()
    {
        setLocation(getX() -5, getY());
    }
    
    /** 
     * bullet2 constructor
     */
    public Bullet2() {
        GreenfootImage bullet2 = new GreenfootImage("images/bullet2.png");
        setImage(bullet2);
    }
}