import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normalbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normalbutton extends Actor
{
    /**
     * Act - do whatever the Normalbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Normalworld());
        }
    }
}
