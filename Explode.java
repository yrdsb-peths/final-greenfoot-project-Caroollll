import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * animation of the explosion used for maintank
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Explode extends Actor
{
    GreenfootImage[] explosion = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage explode = new GreenfootImage("images/explode/explode0.png");
    /**
     * keep changing the animation image until it reaches the end
     */
    public void act()
    {
        if(imageIndex < explosion.length)
           explosion();
    }
    
    /** 
     * constructor for expode 
     */
    public Explode() {
        for(int i = 0; i< explosion.length; i++) 
        {
           explosion[i] = new GreenfootImage("images/explode/explode" + i + ".png");
        }
        
        animationTimer.mark();
        
        //initial explosion image
        setImage(explosion[0]); 
        
    }
    
    /** 
     * 
     */
    int imageIndex = 0;
    public void explosion() {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        setImage(explosion[imageIndex]);
        imageIndex = (imageIndex +1);
    } 
}
