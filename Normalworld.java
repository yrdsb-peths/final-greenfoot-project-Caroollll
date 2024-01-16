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
    public Label scoreLabelnormal;
    public int health = 50;
    public Label healthScore;
    GreenfootSound gamesound2 = new GreenfootSound("gamesound3.mp3");
    /**
     * Constructor for objects of class Normalworld.
     * 
     */
    public Normalworld()
    {    
        super(650, 500, 1, false); 
        scoreLabelnormal = new Label(0, 30);
        addObject(scoreLabelnormal, 95, 20);
        addObject(new Label("Score:", 25), 50, 20);
        
        addObject(new Label("Health:", 25), 190, 20);
        healthScore = new Label(0, 30);
        addObject(healthScore, 235, 20);
        healthScore.setValue(health);
        
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
        scoreLabelnormal.setValue(score);
        
    }
}
