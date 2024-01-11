import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosions extends Actor
{
    GreenfootImage[] explosion2 = new GreenfootImage[7];
    SimpleTimer animationTimer2 = new SimpleTimer();
    GreenfootImage explode2 = new GreenfootImage("images/explosions/explosions0.png");
    /**
     * Act - do whatever the Explosions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(imageIndex < explosion2.length)
            explosion2();
    }
    
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
