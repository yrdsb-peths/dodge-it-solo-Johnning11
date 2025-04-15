import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class hero extends Actor
{
    boolean atTop = true;
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
            
        }
    }
}
