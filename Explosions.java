import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * animation of the explosion used for supertank during the powerup
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Explosions extends Actor
{
    GreenfootImage[] explosion2 = new GreenfootImage[7];
    SimpleTimer animationTimer2 = new SimpleTimer();
    GreenfootImage explode2 = new GreenfootImage("images/explosions/explosions0.png");
    /**
     * keep changing the animation until it reaches the end
     */
    public void act()
    {
        if(imageIndex < explosion2.length)
            explosion2();
    }
    
    /**
     * constructor for explosions
     */
    public Explosions() {
        for(int i =0; i <explosion2.length; i++) {
            explosion2[i] = new GreenfootImage("images/explosions/explosions" + i + ".png");
        }
        
        animationTimer2.mark();
        
        //initial explosion image
        setImage(explosion2[0]);
    }
    
    int imageIndex = 0;
    public void explosion2() {
        if(animationTimer2.millisElapsed() < 90) {
            return;
        }
        animationTimer2.mark();
        setImage(explosion2[imageIndex]);
        imageIndex = (imageIndex +1);
    }
}
