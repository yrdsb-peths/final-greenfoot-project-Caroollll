import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    public Label scoreLabel;
    int level = 1;
    
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
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        MainTank maintank = new MainTank();
        addObject(maintank,50, getHeight()/2);
        
        createEnemy1();
        
        Explode explode = new Explode();
        //addObject(explode, 100, 100);
        
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
