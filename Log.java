import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends Actor
{ 
    //GreenfootImage[] logSpin = new GreenfootImage[4];
    
    //SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage log = new GreenfootImage("images/log/log0");
    /**
     * Act - do whatever the Log wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //animateLog();
        
        /**if(isTouching(Knife.class)) {
            knife = getOneIntersectingObject(Knife.class);
            knife.setLocation(getX(), getY());
        }  **/
    }
    
    public Log() {
        /**for(int i = 0; i< logSpin.length; i++) 
        {
           logSpin[i] = new GreenfootImage("images/logSpin/log" + i + ".png");
        }
        
        animationTimer.mark();
        
        //initial log image
        setImage(logSpin[0]);  **/
        int myRotation = 20;
        setRotation(myRotation);
        move(10);
        setRotation(0);
    }
    
    /**
     * animate the log
     */
    //int imageIndex = 0;
    public void animateLog() {
        /**if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        setImage(logSpin[imageIndex]);
        imageIndex = (imageIndex +1) % logSpin.length;  **/
    } 
} 