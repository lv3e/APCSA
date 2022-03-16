
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character
{
    String name;
    int health;
    int damage;
    int speed;
    int defense;
    boolean dead;
    public Character (String name){
        name = name;
        health = 100;
        damage = (int)(Math.random() * 8 + 15);
        defense = (int)(Math.random() * 10 + 5);
        speed = 12;
    }
    public void liveordeath(){
        if (health <= 0){
            dead = true;
            System.out.println("You died... sounds like a skill issue");           
        } else {
            dead = false;
            System.out.println("Survive!");
        }
    }
}
