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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(350, 500, 1); 
        
        titleLabel();
        
        startButton();
        prepare();
        
        
        
    }
    
    public void act() {
        if(Greenfoot.mouseClicked(null)) 
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
    
    private void titleLabel() {
        Label titleLabel = new Label("Knife Throw", 50);
        addObject(titleLabel, getWidth()/2, 200);
        
    }
    
    private void prepare() {
        Label instructions = new Label("Click to begin!", 30);
        addObject(instructions, getWidth()/2, 300);
    }
    
    private void startButton() {
        StartButton startButton = new StartButton();
        addObject(startButton, getWidth()/2, 300);
        
    }
}
