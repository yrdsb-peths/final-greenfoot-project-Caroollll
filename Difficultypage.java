import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player can choose between playing three different levels, when
 * the button actors are clicked, they are brought to the world they 
 * choose. 
 * 
 * @Carol
 * @01/15/24
 */
public class Difficultypage extends World
{
    public int difficulty;
    GreenfootSound difficultysound = new GreenfootSound("difficultypage.mp3");
    /**
     * Constructor for objects of class Difficultypage.
     * 
     */
    public Difficultypage()
    {    
        super(650, 500, 1);
        difficulty = 0; 
        prepare();
        
    }
    
    /**
     * prepare the page to display the needed buttons and sounds 
     */
    private void prepare() {
        Easybutton easybutton = new Easybutton();
        addObject(easybutton, getWidth()/2, 130);
        
        Normalbutton normalbutton = new Normalbutton();
        addObject(normalbutton, getWidth()/2, 250);
        
        Hardbutton hardbutton = new Hardbutton();
        addObject(hardbutton, getWidth()/2, 370);
        
        difficultysound.setVolume(40);
        difficultysound.play();
    }
}
