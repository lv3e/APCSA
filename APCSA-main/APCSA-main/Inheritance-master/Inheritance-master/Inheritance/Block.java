
/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Block
{
    public boolean blocked(){
        int ChancesofBlocked = 10;
        if ((int)(Math.random() * 10 + 10 ) <= ChancesofBlocked){
            return true;
        } else{
            return false;
        }
    }
}
