import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normalworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normalworld extends World
{

    /**
     * Constructor for objects of class Normalworld.
     * 
     */
    public Normalworld()
    {    
        super(650, 500, 1, false); 
    
        MainTank maintank = new MainTank();
        addObject(maintank,50, getHeight()/2);
        
        createEnemies();
        
        Explode explode = new Explode();
    }
    
    /** 
     * myworld adds an enemy1 everytime a random number is less than 3
     * myworld adds an enemy2 everytime a random number is less than 2
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
}
