import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Waktu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Waktu extends Actor
{
    /**
     * Act - do whatever the Waktu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jumdetik = 0;
    boolean ulang = true;
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("0.0.0", 25, Color.YELLOW, Color.BLACK));
        
        do{
            jumdetik++;
            int jam = jumdetik/3600;
            int menit = jumdetik%3600/60;
            int detik = jumdetik%60; //% MOD = Pembagian angka sampai habis
            setImage(new GreenfootImage("Time : "+jam+"."+menit+"."+detik, 25, Color.YELLOW, Color.BLACK));
        }
        while(ulang=false);
    }    
}
