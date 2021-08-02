import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends World
{
    int enemyCount = 0;
    int enemyCount2 = 0;
    int boostCount = 0;
    int reinicioCount = 0;
    int eliminarCount = 0;
    private double Dificultad = 0.0;
    Nave nave = new Nave();
    //GreenfootSound backgroundMusic = new GreenfootSound("MusicadeFondo.wav");
    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
    {    
        super(1200, 800, 1); 
        prepare();
    }
    
    
    

    public void act()
    {
        enemyCount++;
        enemyCount2++;
        boostCount++;
        reinicioCount++;
        eliminarCount++;
        if((nave.getPoder())==1)
        {
            Dificultad = Dificultad *0;
            int valorPoder = 0;
            nave.setPoder(valorPoder);
        }
        Dificultad = Dificultad + 0.001;
        if(enemyCount>(80 - Dificultad))
        {
            Enemigo1();
            enemyCount = 0;
        }
        if(enemyCount2>(100 - Dificultad - 5))
        {
            Enemigo2();
            enemyCount2 = 0;
        }
        if(boostCount>(1000))
        {
            boostCount();
            boostCount = 0;
        }
        if(reinicioCount>(1500))
        {
            reinicioCount();
            reinicioCount = 0;
        }
        if(eliminarCount>(2000000))
        {
            eliminarCount();
            eliminarCount = 0;
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        started();
        Nave nave = new Nave();
        addObject(nave,577,545);
        Contador contador = new Contador();
        addObject(contador,200,36);
    }
    
    public void Enemigo1()
    {
        addObject(new Piedra1(), Greenfoot.getRandomNumber(1200),0);
        addObject(new Piedra1(), Greenfoot.getRandomNumber(1200),0);
        addObject(new Piedra1(), Greenfoot.getRandomNumber(1000),0);
    }
    
    public void Enemigo2()
    {
        int numero = Greenfoot.getRandomNumber(1200);
        addObject(new Piedra2(), numero,0);
        int numero2 = Greenfoot.getRandomNumber(1200);
        addObject(new Piedra2(), numero2,0);
    }
    
    public void boostCount()
    {
        int numero = Greenfoot.getRandomNumber(1200);
        addObject(new Boost(), numero,0);
    }
    
    public void reinicioCount()
    {
        int numero = Greenfoot.getRandomNumber(1200);
        addObject(new Reinicio(), numero,0);
    }
    
    public void eliminarCount()
    {
        int numero = Greenfoot.getRandomNumber(1200);
        addObject(new Eliminar(), numero,0);
    }
}
