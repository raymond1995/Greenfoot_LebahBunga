import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bunga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bunga extends Actor
{
    /**
     * Act - do whatever the bunga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.   
        if (isAtEdge())
        {
         turn(180);
         move(10);
            if(getRotation()==180){
                up();
            }else{
                down();
            }
        }else{
            if(getRotation()==0){
                down();
            }else{
                up();
            }
        }
    }
    
    public void up(){
    setLocation(getX(), getY()-10);
    }
    
    public void down(){
    setLocation(getX(), getY()+10);
    }
}
