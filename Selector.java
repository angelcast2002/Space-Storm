import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Selector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Selector extends Actor
{
    /**
     * Act - do whatever the Selector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }
    
    public Selector()
    {
        setRotation(90);
        GreenfootImage myImage = getImage ();
        myImage.scale (75, 125);
    }
}