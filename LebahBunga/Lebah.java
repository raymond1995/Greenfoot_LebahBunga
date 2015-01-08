import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lebah extends Actor
{
    /**
     * Act - do whatever the Lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        if(Greenfoot.isKeyDown("up"))
        {
            turn(10);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-10);
        }
        if(isAtEdge())
            {
                turn(90);
            }
     
        Actor batu=(batu)getOneIntersectingObject(batu.class);
        if(batu!=null)
        {
            getWorld().removeObject(batu);
            Dunia dunia = (Dunia)getWorld();
            Lives lives = dunia.getLives();
            lives.minLives();
        }
        
        Actor bunga=(bunga)getOneIntersectingObject(bunga.class);
        if(bunga!=null)
        {
        getWorld().removeObject(bunga);
        Dunia dunia = (Dunia)getWorld();
        Score score = dunia.getScore();
        score.addScore();
        getWorld().addObject(new bunga(), Greenfoot.getRandomNumber(getWorld().getWidth()-1)+8,1);
        }
    }    
    
    /*public void dead()
    {
        if(isTouching(batu.class))
        {
            removeTouching(batu.class);
            Dunia dunia = (Dunia)getWorld();
            Lives lives = dunia.getLives();
            lives.minLives();
            nyawa++;
            if(nyawa>3)
            {
                Greenfoot.stop();
            }
        }
    }*/
}
