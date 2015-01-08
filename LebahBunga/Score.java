import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private GreenfootImage imgl=new GreenfootImage(205,100);
    //private Waktu waktu = new Waktu();
    int score = 0;
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score : " + score, 25, Color.GREEN, Color.BLACK));
    }
    
    public void addScore()
    {
        if(score==9)
        {
            Greenfoot.stop();
            setImage(new GreenfootImage("MISSION COMPLETE!" + ("")/*10*/, 100, Color.GREEN, Color.BLACK));
            setLocation(410, 301);
        }else{
            score++;
        }
    }
}
