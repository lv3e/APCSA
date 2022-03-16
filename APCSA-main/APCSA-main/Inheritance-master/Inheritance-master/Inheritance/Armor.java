
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armor extends Item
{
    int defense;
    public Armor(String name, int armorDefense){
        super(name);
        name = name;
        defense = armorDefense;
        Used = true;
    }
}
