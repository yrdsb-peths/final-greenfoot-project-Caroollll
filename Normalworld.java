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
        super(650, 500, 1); 
    
        MainTank maintank = new MainTank();
        addObject(maintank,50, getHeight()/2);
        
        createEnemies();
        
        Explode explode = new Explode();
    }
    
    public void act() {
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Enemy1(), 600, Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(500) <3) {
            addObject(new Enemy2(), 600, Greenfoot.getRandomNumber(500));
        }
        
    }
    
    private void createEnemies() {
        Enemy1 enemy1 = new Enemy1();
        int x = 600;
        int y = Greenfoot.getRandomNumber(500);
        addObject(enemy1, x, y);
        
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, x, y);
    }
}