import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easybutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easybutton extends Actor
{
    /**
     * checks if the actor is pressed, and if pressed, change the world
     * into myworld and stops the sound
     * button also gets smaller, as if literally getting squished
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()+0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MyWorld());
            ((Difficultypage) getWorld()).difficulty = 1;
            ((Difficultypage) getWorld()).difficultysound.stop();
        }
    }
}
