import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world of the easy version of tank wars. Spawns 1 tank
 * randomly along the y-axis. When an enemy is shot, the score increases. 
 * 
 * @Carol
 * @01/15/24
 */
public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel;
    public int health = 50;
    public Label healthScore;
    GreenfootSound gamesound1 = new GreenfootSound("gamesound4.mp3");
    /** 
     * myworld adds an enemy1 everytime a random number is less than 3
     */
    public void act() {
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Enemy1(), 600, Greenfoot.getRandomNumber(500));
        }
    }
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(650, 500, 1, false);
        
        scoreLabel = new Label(0, 30);
        addObject(scoreLabel, 95, 20);
        addObject(new Label("Score:", 25), 50, 20);
        
        addObject(new Label("Health:", 25), 190, 20);
        healthScore = new Label(0,30);
        addObject(healthScore, 235, 20);
        healthScore.setValue(health);
        
        Base base = new Base();
        addObject(base, -10, getHeight()/2);
        
        MainTank maintank = new MainTank();
        addObject(maintank,50, getHeight()/2);
        
        createEnemy1();
        
        Explode explode = new Explode();
        
        gamesound1.setVolume(40);
        gamesound1.play();
        
    }
    
    /** 
     * creates enemy1 and spawns it randomly on the y-axis 
     */
    public void createEnemy1() {
        Enemy1 enemy1 = new Enemy1();
        int x = 600;
        int y = Greenfoot.getRandomNumber(500);
        addObject(enemy1, x, y);
        
    }
    
    /**
     * increases score 
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
        
    }
    
    
}
