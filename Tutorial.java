import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shows the instructions of how to play the game, simulates a small
 * game to teach players. 
 * 
 * @Carol
 * @01/15/24
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
            addObject(new Enemy1TUTORIAL(), 600, getHeight()/2);
        }
    }

    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {    
        super(650, 500, 1, false); 
        prepare();
    }
 
    /**
     * prepares the world and adds in all the assets needed
     */
    public void prepare() {
        Label button = new Label("Use \u2191 and \u2193 to Move",60);
        addObject(button, getWidth()/2, 100); 
        Label shoot = new Label("Press <space> to shoot", 40);
        addObject(shoot, getWidth()/2, 140);
        Home home = new Home();
        addObject(home, getWidth()/2, 400);
        Label basewarning = new Label("\u2190 Don't let enemies reach your base!", 38);
        addObject(basewarning, 280, 450);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        MaintankTutorial maintanktutorial = new MaintankTutorial();
        addObject(maintanktutorial,50, getHeight()/2);
        
        Base base = new Base();
        addObject(base, -10, getHeight()/2);
        
        Enemy1TUTORIAL enemy1tutorial = new Enemy1TUTORIAL();
        addObject(enemy1tutorial, 600, getHeight()/2);
        
        Explode explode = new Explode();
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
    }
}
