import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world of the normal version of tank wars. Spawns 2 different
 * tanks randomly along the y-axis. When an enemy is shot, the score
 * increases. 
 * 
 * @Carol
 * @01/15/24
 */
public class Normalworld extends World
{
    public int score = 0;
    public Label scoreLabel;
    GreenfootSound gamesound2 = new GreenfootSound("gamesound3.mp3");
    /**
     * Constructor for objects of class Normalworld.
     * 
     */
    public Normalworld()
    {    
        super(650, 500, 1, false); 
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        Base base = new Base();
        addObject(base, -10, getHeight()/2);
        
        Maintanknormal maintanknormal = new Maintanknormal();
        addObject(maintanknormal,50, getHeight()/2);
        
        createEnemies();
        
        Explode explode = new Explode();
        
        gamesound2.setVolume(40);
        gamesound2.play();
    }
    
    /** 
     * normalworld adds an enemy1 everytime a random number is less than 3
     * adds an enemy2 everytime a random number is less than 2
     */
    public void act() {
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Enemy1(), 600, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(500) <2) {
            addObject(new Enemy2(), 600, Greenfoot.getRandomNumber(500));
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
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
    }
}
