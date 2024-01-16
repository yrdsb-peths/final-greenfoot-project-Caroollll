import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * home button actor
 * 
 * @Carol Li 
 * @01/15/24
 */
public class Home extends Actor
{
    /**
     * checks if the actor is pressed, and if pressed, change the world
     * into titlepage
     * button also gets smaller, as if literally getting squished
     */
    public void act()
    {   
        GreenfootImage home = new GreenfootImage("images/home.png");
        if(Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth()+0.9), (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.delay(2);
            Greenfoot.setWorld(new Titlepage());
        }
    }
}
