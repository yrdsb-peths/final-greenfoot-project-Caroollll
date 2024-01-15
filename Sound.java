import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * sound button actor
 * 
 * @Carol Li 
 * @01/15/24
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
