import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normalworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hardworld extends World
{
    public int score = 0;
    public Label scoreLabel;
    GreenfootSound gamesound3 = new GreenfootSound("gamesound1.mp3");
    /**
     * Constructor for objects of class Normalworld.
     * 
     */
    public Hardworld()
    {    
        super(650, 500, 1, false); 
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        Maintankhard maintankhard = new Maintankhard();
        addObject(maintankhard,50, getHeight()/2);
        
        createEnemies();

        Explode explode = new Explode();
        
        gamesound3.setVolume(40);
        gamesound3.play();
    }
    
    /** 
     * myworld adds an enemy1 everytime a random number is less than 3
     * myworld adds an enemy2 everytime a random number is less than 2
     * myworld adds an enemy3 everytime a random number is less than 1
     */
    public void act() {
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Enemy1(), 600, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(500) <2) {
            addObject(new Enemy2(), 600, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(500) <1) {
            addObject(new Enemy3(), 600, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(500) <5) {
            addObject(new Powerup(), 600, Greenfoot.getRandomNumber(500));
        }
    }
    
    /** 
     * creates enemies and spawns it randomly on the y-axis 
     */
    private void createEnemies() {
        Enemy1 enemy1 = new Enemy1();
        int x = 600;
        int y = Greenfoot.getRandomNumber(500);
        addObject(enemy1, x, y);
        
        int z = Greenfoot.getRandomNumber(500);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, x, z);
        
        int a = Greenfoot.getRandomNumber(500);
        Enemy3 enemy3 = new Enemy3();
        addObject(enemy3, x, a);
    }
    
    private void createPowerups() {
        Powerup powerup = new Powerup();
        int a = 600;
        int b = Greenfoot.getRandomNumber(500);
        addObject(powerup, a, b);
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
    }
}
