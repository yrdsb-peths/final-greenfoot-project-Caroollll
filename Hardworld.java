import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game world of the hard version of tank wars. Spawns 3 different
 * tanks randomly along the y-axis. Also spawns powerups very rarely 
 * along the y-axis. When an enemy is shot, the score increases. 
 * 
 * @Carol
 * @01/15/24
 */
public class Hardworld extends World
{
    public int score = 0;
    public Label scoreLabelhard;
    public int health = 50;
    public Label healthScore;
    GreenfootSound gamesound3 = new GreenfootSound("gamesound1.mp3");
    /**
     * Constructor for objects of class Hardworld.
     * 
     */
    public Hardworld()
    {    
        super(650, 500, 1, false); 
        scoreLabelhard = new Label(0, 30);
        addObject(scoreLabelhard, 95, 20);
        addObject(new Label("Score:", 25), 50, 20);
        
        addObject(new Label("Health:", 25), 190, 20);
        healthScore = new Label(0, 30);
        addObject(healthScore, 235,20);
        healthScore.setValue(health);
        
        Base base = new Base();
        addObject(base, -10, getHeight()/2);
        
        Maintankhard maintankhard = new Maintankhard();
        addObject(maintankhard,50, getHeight()/2);
        
        createEnemies();

        Explode explode = new Explode();
        
        gamesound3.setVolume(40);
        gamesound3.play();
    }
    
    /** 
     * hardworld adds an enemy1 everytime a random number is less than 3
     * adds an enemy2 everytime a random number is less than 2
     * adds an enemy3 everytime a random number is less than 1
     * adds powerup everytime a random number is less than 1
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
        if(Greenfoot.getRandomNumber(500) <1) {
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
    
    /** 
     * creates powerups and spawns it randomly on the y-axis 
     */
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
        scoreLabelhard.setValue(score);
    }
}
