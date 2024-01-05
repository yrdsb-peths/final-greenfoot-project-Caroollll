import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Replay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replay extends Actor
{
    /**
     * Act - do whatever the Replay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage replay = new GreenfootImage("images/replay.png");
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Difficultypage());
        }
    }
}
