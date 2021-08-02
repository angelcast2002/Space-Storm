import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reinicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reinicio extends Actor
{
    /**
     * Act - do whatever the Reinicio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        remove();
    }
    
    public void move()
    {
        setLocation(getX(), getY()+3);
    }
    
    public void remove()
    {
        if (getY()>760 && getY()>790)
        {
            getWorld().removeObject(this);
        }
    }
    
    public Reinicio()
    {
        GreenfootImage myImage = getImage ();
        myImage.scale (60, 60);
    }
}
