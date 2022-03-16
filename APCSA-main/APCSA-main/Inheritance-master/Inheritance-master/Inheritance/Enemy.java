
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Enemy
{
    private ArrayList<String>enemy;
    String name;
    int health;
    int damage;
    int defense;
    public Enemy(){
        enemy = new ArrayList<String>();
        enemy.add("Ogre");
        enemy.add("Goblins");
        enemy.add("My wife");
        enemy.add("Zombies");
        enemy.add("Skeletons");
        enemy.add("Witches");
    }
    
    public void enemyInfo(String name, int health, int damage, int defense){
        enemy.add(name);
        name = name;
        health = health;
        damage = damage;
        defense = defense;
    }
    
}
