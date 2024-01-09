import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sound extends Actor
{
    boolean startStop = true;
    /**
     * checking if mouse is clicked on actor
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            startStop();
        }
        //is there a code to check what world i am in? then if true, 
        //then mute the sound for that page only
    }

    /** 
     * start and stops sound, also switches between the two images 
     */
    public void startStop() {
        startStop = !startStop;
        
        if(startStop) {
            GreenfootImage mute = new GreenfootImage("images/mute.png");
            setImage(mute);
            ((Titlepage) getWorld()).intromusic.pause();
        }
        else {
            GreenfootImage sound = new GreenfootImage("images/sound.png");
            setImage(sound);
            ((Titlepage) getWorld()).intromusic.play();
        }
    }
}
