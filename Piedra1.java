import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Piedra1 extends Actor
{
    private int rejugar;
    private int Tecla;
    public void act()
    {
        move();
        eat(rejugar);
        while (getTecla() == 1){
            if (getrejugar() == 1){
                Rejugar();
            }
        }
        remove();
    }
    public void setrejugar(int volverajugar){
        this.rejugar = volverajugar;
    }
    public int getrejugar(){
        return rejugar;
    }
    public void setTecla(int tecla){
        this.Tecla = tecla;
    }
    public int getTecla(){
        return Tecla;
    }
    public Piedra1 ()
    {
        GreenfootImage myImage = getImage ();
        myImage.scale (150, 250);
    }
    
    public int eat(int rejugar)
    {
        Actor Nave;
        Nave = getOneObjectAtOffset(0,0, Nave.class);
        if (Nave != null)
        {
            int tecla = 1;
            setTecla(tecla);
            int volverajugar = 1;
            World world;
            world = getWorld();
            world.removeObject(Nave);
            setrejugar(volverajugar);
            return rejugar;
        }
        return rejugar;
    }
    public void move()
    {
        setLocation(getX(), getY()+5);
    }
    
    public void remove()
    {
        if (getY() == 770)
        {
            getWorld().removeObject(this);
        }
    }
    public void Rejugar()
    {
        if (Greenfoot.isKeyDown("y"))
        {
            Greenfoot.setWorld(new Stage1());
            int tecla = 0;
            setTecla(tecla);
            int volverajugar = 0;
            setrejugar(volverajugar);
        }
        if (Greenfoot.isKeyDown("n"))
        {
            World world;
            world = getWorld();
            GameOver gameover = new GameOver();
            world.addObject(gameover,600,400);
            Greenfoot.stop();
            int tecla = 0;
            setTecla(tecla);
            int volverajugar = 0;
            setrejugar(volverajugar);
        }
    }
}
