import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
    Score score = new Score();
    Lives lives = new Lives();
    Waktu waktu = new Waktu();
    SplashScreen ss = new SplashScreen();
    EndMessage endmsg = new EndMessage();
    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    public Score getScore()
    {
        return score;
    }
    
    public Lives getLives()
    {
        return lives;
    }
    
    public Waktu getWaktu()
    {
        return waktu;
    }
    
    public SplashScreen getSplashScreen()
    {
        return ss;
    }
    
    public EndMessage getEndMessage()
    {
        return endmsg;
    }
    
    private void prepare()
    {
        addObject(score, 700, 50);
        addObject(lives, 700, 75);
        addObject(waktu, 700, 100);
        addObject(ss, 367, 305);
        bunga bunga1 = new bunga();
        addObject(bunga1, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        bunga bunga2 = new bunga();
        addObject(bunga2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        bunga bunga3 = new bunga();
        addObject(bunga3, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        bunga bunga4 = new bunga();
        addObject(bunga4, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Lebah lebah = new Lebah();
        addObject(lebah, 78, 300);
        batu batu1 = new batu();
        addObject(batu1, 76, 120);
        batu batu2 = new batu();
        addObject(batu2, 714, 298);
        batu batu3 = new batu();
        addObject(batu3, 85, 508);
    }
}
