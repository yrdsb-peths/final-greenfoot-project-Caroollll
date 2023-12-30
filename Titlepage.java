import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Titlepage extends World
{

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
    
    private void titleLabel() {
        Label titleLabel = new Label("Tank wars", 90);
        addObject(titleLabel, getWidth()/2, 130);
        
    }
    
    private void prepare() {
        Difficulty difficulty = new Difficulty();
        addObject(difficulty, 500, 380);
        
        Tutorialbutton tutorialbutton = new Tutorialbutton();
        addObject(tutorialbutton, 500, 440);
    }
}
