import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorialbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorialbutton extends Actor
{
    /**
     * Act - do whatever the Tutorialbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()+0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Tutorial());
        }
    }
    
}
