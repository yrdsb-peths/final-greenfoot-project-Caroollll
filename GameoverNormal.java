import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameoverNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameoverNormal extends World
{

    /**
     * Constructor for objects of class GameoverNormal.
     * 
     */
    public GameoverNormal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1); 
        prepare();
    }
    
    /** 
     * prepare the world for the start of the program, displays the information
     */
    private void prepare() {
        GameoverImage gameoverimage = new GameoverImage();
        addObject(gameoverimage, getWidth()/2, 230);
        Home home = new Home();
        addObject(home, 250, 400);
        Replay2 replay2 = new Replay2();
        addObject(replay2, 380, 400);
        
    }
}
