import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bee extends Actor
{

    public void act()
    {
        move(-7);
        if(getX() <= 0) {
            resetbanana();
        }
        if(isTouching(hero.class)) {
            bee bee = new bee();
            getWorld().addObject(loser, 300, 200);
            getWorld().removeObject(this);
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
