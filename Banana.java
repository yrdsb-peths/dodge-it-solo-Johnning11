import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Banana extends Actor
{

    public void act()
    {
        move(-4);
        if(getX() <= 0) {
            resetbanana();
        }
    }
    public void resetbanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num ==0){
            setLocation(600, 100);
        }else{
            setLocation(600, 300);
        }
    }
}
