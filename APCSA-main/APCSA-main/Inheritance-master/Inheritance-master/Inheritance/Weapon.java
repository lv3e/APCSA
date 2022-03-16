
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weapon extends Item
{
    int dmg;
    int Xtradmg;
    public Weapon(String Name, int power, int xtraPower){
        super(Name);
        Name = Name;
        dmg = power;
        Xtradmg = xtraPower;
        Used = true;
    }
    public void critical(){
        int criticalDamage = 0;
        int critical = (int)(Math.random() * 100 + 1);
        if (criticalDamage <= Xtradmg){
            criticalDamage = dmg * 2;
        }
    }
}
