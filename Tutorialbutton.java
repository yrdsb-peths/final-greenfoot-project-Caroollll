import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * tutorial button actor 
 * 
 * @Carol Li
 * @01/15/24
 */
public class Tutorialbutton extends Actor
{
    /**
     * checks if the actor is pressed, and if pressed, change the world
     * into tutorial and stops the sound
     * button also gets smaller, as if literally getting squished
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()+0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Tutorial());
            ((Titlepage) getWorld()).intromusic.stop();
        }
    }
    
}
