import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        titleLabel();
        prepare();
    }
    
    /** 
     * add all the labels needed in the titlepage
     */
    private void titleLabel() {
        Label titleLabel = new Label("Tank wars", 90);
        addObject(titleLabel, getWidth()/2, 130);
        
    }
    
    /** 
     * prepare the page, add all the buttons needed and start the music 
     */
    private void prepare() {
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
