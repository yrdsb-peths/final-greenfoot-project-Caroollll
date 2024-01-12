import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    public int score = 0;
    public Label scoreLabel;
    /** 
     * tutorial adds an enemy1 everytime a random number is less than 1
     */
    public void act() {
        if(Greenfoot.getRandomNumber(500) < 1) {
            addObject(new Enemy1(), 600, getHeight()/2);
        }
    }

    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {    
        super(650, 500, 1, false); 
        prepare();
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        MaintankTutorial maintanktutorial = new MaintankTutorial();
        addObject(maintanktutorial,50, getHeight()/2);
        
        Base base = new Base();
        addObject(base, -10, getHeight()/2);
        
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 600, getHeight()/2);
        
        Explode explode = new Explode();
    
    }
 
    public void prepare() {
        Label button = new Label("Use \u2191 and \u2193 to Move",60);
        addObject(button, getWidth()/2, 100); 
        Label shoot = new Label("Press <space> to shoot", 40);
        addObject(shoot, getWidth()/2, 140);
        Home home = new Home();
        addObject(home, getWidth()/2, 400);
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
    }
}
