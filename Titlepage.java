import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * adds all the assets the page needs, buttons, labels, and sound
 * 
 * @Carol
 * @01/15/24
 */
public class Titlepage extends World
{
    GreenfootSound intromusic = new GreenfootSound("intromusic.mp3");
    /**
     * Constructor for objects of class Titlepage.
     * 
     */
    public Titlepage()
    {    
        super(650, 500, 1); 
        prepare();
    }
    
    /** 
     * prepare the page, add the labels, all the buttons needed and 
     * start the music 
     */
    private void prepare() {
        Label titleLabel = new Label("Tank wars", 90);
        addObject(titleLabel, getWidth()/2, 130);
        
        Difficulty difficulty = new Difficulty();
        addObject(difficulty, 500, 380);
        
        Tutorialbutton tutorialbutton = new Tutorialbutton();
        addObject(tutorialbutton, 500, 440);
        
        intromusic.setVolume(40);
        intromusic.play();
        
        Sound sound = new Sound();
        addObject(sound, 50, 450);
    }
}
