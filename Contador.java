import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    double Puntaje = 1;
    double Reloj = 0.1;
    int Mostrar = 0;
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Reloj= Reloj + 0.000001;
        Puntaje = Puntaje + Reloj;
        Mostrar = (int) Puntaje;
        //Mostrar++;
        setImage(new GreenfootImage("Puntaje Actual: " + Mostrar, 50, Color.GREEN, Color.BLACK));
    }

}