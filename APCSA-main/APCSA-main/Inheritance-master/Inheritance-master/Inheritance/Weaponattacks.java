
/**
 * Write a description of class Weaponattacks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Weaponattacks implements WeaponInterface
{
    private ArrayList<Character> weaponmechanics;
    int speed;
    boolean HitForce = false;
    int PowerForce = 0;
    public Weaponattacks(){
        weaponmechanics = new ArrayList<Character>();
    }
    public int attack(){
        int critical = 5;
        return PowerForce;
    }
    public boolean parry(){
        int denied = (int)(Math.random()* 50 + 1);
        if(denied > speed){
            return true;
        } else {
            return false;
        }
    }
}
