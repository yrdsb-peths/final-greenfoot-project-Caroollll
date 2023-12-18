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
    public int score = 0;
    public Label scoreLabel;
    int level = 1;
    public Tutorial()
    {    
        super(650, 500, 1, false); 
        
        //MyWorld tutorialWorld = new MyWorld();
        
        //Log log = new Log();
        //addObject(log, getWidth()/2, 200);
        
        //Knife knife = new Knife();
        //addObject(knife, getWidth()/2, 450);
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        Blue blue = new Blue();
        addObject(blue, 100, 450);
        
        Green green = new Green();
        addObject(green, 250, 450);
        
        Red red = new Red();
        addObject(red, 400, 450);
        
        Yellow yellow = new Yellow();
        addObject(yellow, 550, 450);
        
        createGtile();
        createBtile();
    }
    
    public void createGtile() {
        Gtile gtile = new Gtile();
        addObject(gtile, 250, 0);
    }
    
    public void createBtile() {
        Btile btile = new Btile();
        addObject(btile, 100, 0);
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0) {
            level += 1;
        }
    }
}
