import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutBackground extends Actor
{
    /**
     * Act - do whatever the TutBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage bg = new GreenfootImage("images/background0.png");
        bg.scale(500,500);
        setImage(bg);
    }
}
