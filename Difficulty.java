import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * diffulty button actor
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Difficulty extends Actor
{
    /**
     * checks if the actor is pressed, and if pressed, change the world
     * into difficultypage and pauses the sound
     * button also gets smaller, as if literally getting squished
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()+0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Difficultypage());
            ((Titlepage) getWorld()).intromusic.stop();
        }
    }
}
