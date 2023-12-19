import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        super(650, 500, 1, false); 
        
    
    }
 
    public void instructions() {
        Label rules = new Label("Press keys d, f, j, k",60);
        addObject(rules, getWidth()/2, getHeight()/2); 
    }
}
