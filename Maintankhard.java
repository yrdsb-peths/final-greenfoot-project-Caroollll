import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * player controls maintankhard in hard world
 * main tank can move and shoot. Maintank also has 3 lives.
 * 
 * @Carol Li
 * @01/15/24
 */
public class Maintankhard extends Actor
{
    /**
     * maintankhard moves up and down, shoots and dies when all HP is lost 
     */
    public void act()
    {
        checkKeyPressed();
        shoot();
        loseHP();
    }
    
    /** 
     * maintankhard constructor
     */
    public Maintankhard() {
        GreenfootImage maintankhard = new GreenfootImage("images/maintank.png");
        maintankhard.scale(60, 50);
        setImage(maintankhard);
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
            Bullethard bullethard = new Bullethard();
            sleepFor(20);
            getWorld().addObject(bullethard,getX()+25,getY());
            
        }
    }
    
    /** 
     * maintank loses HP when it gets hit by the enemy bullets and dies when
     * loses all it's HP.
     * main tank has around 3-4 lives 
     */
    public void loseHP() {
        if(isTouching(Bullet2.class)) {
            int hp = ((Hardworld) getWorld()).health--;
            ((Hardworld) getWorld()).healthScore.setValue(hp);
            if(hp <= 0) {
                World world = new Gameover();
                Greenfoot.setWorld(world);
            }
        }
    }
}
