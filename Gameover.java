import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
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
        Replay replay = new Replay();
        addObject(replay, 380, 400);
        
    }
}
