import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends Actor
{
    private GreenfootImage imgl=new GreenfootImage(205,100);
    /**
     * Act - do whatever the SplashScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        // Add your action code here.
         setImage(new GreenfootImage("WELCOME", 25, Color.GREEN, Color.BLACK));
         Greenfoot.delay(100);
         getWorld().removeObject(this);
         Greenfoot.delay(0);
    }    
    
}
