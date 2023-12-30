import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficultypage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficultypage extends World
{

    /**
     * Constructor for objects of class Difficultypage.
     * 
     */
    public Difficultypage()
    {    
        super(650, 500, 1); 
        prepare();
    }
    
    /**
     * prepare the page to display the needed buttons
     */
    private void prepare() {
        Easybutton easybutton = new Easybutton();
        addObject(easybutton, getWidth()/2, 130);
        
        Normalbutton normalbutton = new Normalbutton();
        addObject(normalbutton, getWidth()/2, 250);
        
        Hardbutton hardbutton = new Hardbutton();
        addObject(hardbutton, getWidth()/2, 370);
    }
}
