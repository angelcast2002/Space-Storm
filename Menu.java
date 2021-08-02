import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Selector selector = new Selector();
    private int opcion=0;
    Continue Continue = new Continue();
    GreenfootSound menuMusic = new GreenfootSound("MusicadeFondo.wav");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
        menuMusic.setVolume(50);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        started();
        addObject(selector,701,317);
        addObject(Continue,1051,734);
    }
    
    public void started()
    {
        menuMusic.playLoop();
    }
    
    public void stopped()
    {
        menuMusic.pause();
    }
     
    
    
    public void act()
    {
        if (Greenfoot.isKeyDown("UP") && opcion !=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion !=1) {opcion--;}
        
        if (opcion >=2) opcion=0;
        
        if (opcion <0) opcion=1;
        
        if (opcion == 0)
        {
            selector.setLocation(701,317);
        }
        
        if (opcion == 1)
        {
            selector.setLocation(787,487);
        }
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER"))
        {
            switch (opcion)
            {
                case 0:
                    Greenfoot.setWorld(new Stage1());
                    //stopped();
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }
        
        
    }
}
