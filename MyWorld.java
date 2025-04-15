import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        hero hero = new hero();
        addObject(hero, 100, 100);
        bee banana = new bee();
        addObject(bee, 600, 100);
    }
}
