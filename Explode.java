import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explode extends Actor
{
    GreenfootImage[] explosion = new GreenfootImage[7];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage explode = new GreenfootImage("images/explode/explode0.png");
    /**
     * Act - do whatever the Explode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(imageIndex < explosion.length)
           explosion();
    }
    
    public Explode() {
        for(int i = 0; i< explosion.length; i++) 
        {
           explosion[i] = new GreenfootImage("images/explode/explode" + i + ".png");
        }
        
        animationTimer.mark();
        
        //initial explosion image
        setImage(explosion[0]); 
        
    }
    
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
