import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Poder;
    private int Boost;
    public void setPoder(int valorPoder){
        this.Poder = valorPoder;
    }
    public int getPoder(){
        return Poder;
    }
    public void setBoost(int valorBoost){
        this.Boost = valorBoost;
    }
    public int getBoost(){
        return Boost;
    }
    public void act()
    {
        moveAndTurn();
        eat();
    }
    
    public Nave()
    {
        GreenfootImage myImage = getImage ();
        myImage.scale (75, 125);
    }
    
     public void moveAndTurn()
    {
        
        if (Greenfoot.isKeyDown("a"))
        {
            move(-4-getBoost());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(4+getBoost());
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-4-getBoost());
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+4+getBoost());
        }
    }
    
    public void eat()
    {
        Actor Reinicio;
        Reinicio = getOneObjectAtOffset(0,0, Reinicio.class);
        if (Reinicio != null)
        {   
            int valorPoder = 1;
            setPoder(valorPoder);
            World world;
            world = getWorld();
            world.removeObject(Reinicio);
        }
        Actor Boost;
        Boost = getOneObjectAtOffset(0,0, Boost.class);
        if (Boost != null)
        {   
            int valorBoost = getBoost() +1;
            setBoost(valorBoost);
            World world;
            world = getWorld();
            world.removeObject(Boost);
        }
        Actor Piedra1;
        Actor Piedra2;
        Actor Eliminar;
        Eliminar = getOneObjectAtOffset(0,0, Eliminar.class);
        Piedra1 = getOneObjectAtOffset(0,0, Piedra1.class);
        Piedra2 = getOneObjectAtOffset(0,0, Piedra2.class);
        if (Eliminar != null)
        {   
            World world;
            world = getWorld();
            world.removeObject(Eliminar);
            world.removeObject(Piedra1);
            world.removeObject(Piedra2);
        }
    }
}
