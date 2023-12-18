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
        super(650, 500, 1); 
        
        //MyWorld tutorialWorld = new MyWorld();
        
        //Log log = new Log();
        //addObject(log, getWidth()/2, 200);
        
        //Knife knife = new Knife();
        //addObject(knife, getWidth()/2, 450);
        
        Blue blue = new Blue();
        addObject(blue, 100, 450);
        
        Green green = new Green();
        addObject(green, 250, 450);
        
        Red red = new Red();
        addObject(red, 400, 450);
        
        Yellow yellow = new Yellow();
        addObject(yellow, 550, 450);
        
    }
}
