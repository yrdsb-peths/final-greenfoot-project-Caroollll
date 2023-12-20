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
        super(650, 500, 1); 
        
        titleLabel();
        
        startButton();
        TutButton(); 
        prepare();
        
        TutBackground bg = new TutBackground();
        addObject(bg, 0, 0);
        
    }
    
    /**public void act() {
        if(Greenfoot.mouseClicked(prepare)) 
        {
            Greenfoot.setWorld(new MyWorld());
        }
        
    }  **/
    
    private void titleLabel() {
        Label titleLabel = new Label("Beat Tiles", 60);
        addObject(titleLabel, getWidth()/2, 200);
        
    }
    
    private void prepare() {
        Label instructions = new Label("Start!", 30);
        addObject(instructions, getWidth()/2, 300);
        
        Label tutorial = new Label("Tutorial!", 30);
        addObject(tutorial, getWidth()/2, 370);
    }
    
    private void startButton() {
        StartButton startButton = new StartButton();
        addObject(startButton, getWidth()/2, 300);
        
    }
    
    private void TutButton() {
        TutButton tutButton = new TutButton();
        addObject(tutButton, getWidth()/2, 370);
    }
}
