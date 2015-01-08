import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    private GreenfootImage imgl=new GreenfootImage(205,100);
    int lives = 2;
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Lives  : " + (lives+1), 25, Color.WHITE, Color.BLACK));
    }
    
    public void minLives()
    {
        if(lives==0)
        {
            Greenfoot.stop();
            //setImage(new GreenfootImage("Lives  : " + (lives-lives), 25, Color.WHITE, Color.BLACK));
            setImage(new GreenfootImage("MISSION FAILED!" + ("")/*10*/, 125, Color.RED, Color.BLACK));
            setLocation(416, 300);
        }else{
            lives--;
        }
    }
    
    
}
