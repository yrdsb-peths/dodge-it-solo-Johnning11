import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        hero hero = new hero();
        addObject(hero, 100, 100);
        Banana banana = new Banana();
        addObject(banana, 600, 100);
    }
}
