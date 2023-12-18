import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knife extends Actor
{
    /**
     * click mouse to shoot the knife at the log
     */
    private Actor Log;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(null)) {
            if(isTouching(Log.class)) {
                setLocation(Log.getX(), Log.getY());
            }
            else {
                while(getY() >= 300) {
                    setLocation(getX(), getY() - 20);
                }
            }
        }
    }
     
    public Knife() {
        GreenfootImage knife = new GreenfootImage("images/knife.png");
        knife.scale(30, 70);
        setImage(knife);
    }
}
