import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * player controls maintank in easy world
 * main tank can move and shoot. Maintank also has 3 lives.
 * 
 * @Carol Li 
 * @01/15/24
 */
public class MainTank extends Actor
{
    /**
     * maintank moves up and down, shoots and dies when all HP is lost 
     */
    public void act()
    {
        checkKeyPressed();
        shoot();
        loseHP();
    }
    
    /** 
     * maintank constructor
     */
    public MainTank() {
        GreenfootImage maintank = new GreenfootImage("images/maintank.png");
        maintank.scale(60, 50);
        setImage(maintank);
    }
    
    /** 
     * move maintank up and down by pressing up and down key
     */
    public void checkKeyPressed() {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+5);
        }
    }
    
    /** 
     * maintank shoots bullets when space button is pressed
     */
    public void shoot() {
        if(Greenfoot.isKeyDown("space")) {
            Bullet bullet = new Bullet();
            sleepFor(20);
            getWorld().addObject(bullet,getX()+25,getY());
            
        }
        
    }
    
    /** 
     * maintank loses HP when it gets hit by the enemy bullets and dies when
     * loses all it's HP.
     * main tank has 3 lives 
     */
    int totalHP = 50;
    public void loseHP() {
        if(isTouching(Bullet2.class)) {
            totalHP--;
            //system.out.println(totalHP);
            if(totalHP < 0) {
                World world = new Gameover();
                Greenfoot.setWorld(world);
            }
        }
    }
}
