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
        Label titleLabel = new Label("Tank wars", 80);
        addObject(titleLabel, getWidth()/2, 150);
        
    }
    
    private void prepare() {
        Difficulty difficulty = new Difficulty();
        addObject(difficulty, 320, 250);
        
        Tutorialbutton tutorialbutton = new Tutorialbutton();
        addObject(tutorialbutton, getWidth()/2, 360);
    }
}
