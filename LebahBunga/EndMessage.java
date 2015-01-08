import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class EndMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndMessage extends Actor
{
    private GreenfootImage imgl=new GreenfootImage(205,100);
    /**
     * Act - do whatever the EndMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }    
    
    public void winMsg()
    {
        setImage(new GreenfootImage("YOU WIN" + (""), 25, Color.WHITE, Color.BLACK));
    }
    
    public void loseMsg()
    {
        setImage(new GreenfootImage("YOU LOSE" + (""), 25, Color.WHITE, Color.BLACK));
    }
}
