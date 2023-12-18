import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Green here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Green extends Actor
{
    /**
     * Act - do whatever the Green wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Gtile.class) && Greenfoot.isKeyDown("f")) {
            removeTouching(Gtile.class);
            Tutorial tutorial = (Tutorial) getWorld();
            tutorial.createGtile();
            tutorial.increaseScore();
        }
    }
    
    public Green() {
        GreenfootImage green = new GreenfootImage("images/button-green.png");
        green.scale(70, 70);
        setImage(green);
    }
    
}
