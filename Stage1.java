import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends BubbleBacground
{
    int gravity =1;
    
    public void setGravity(int gravity){
        this.gravity = gravity;
    }
    
    public int getGravity(){
        return this.gravity;
    }
    public Stage1()
    {
        Player calvin = new Player();
        this.addObject(calvin, 300, 200);  
        this.gravity = 1;
        Player calvin2 = new Player();
        this.addObject(calvin2, 400, 0);
    }
    
    public void act(){
        List<Character1> allchars = this.getObjects(Character1.class);
        for(Character1 chara : allchars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity);
        }
    }   
}
