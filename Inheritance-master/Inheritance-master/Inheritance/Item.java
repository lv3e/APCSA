
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    ArrayList<Integer> item = new ArrayList<Integer>();
    String Name;
    public Item(String name){
       name = name;   
    }
    
    public String getName(){
      return Name;                 
    }
    
    public void itemBought(){
       System.out.println("You have bought an item: " + Name);         
    }
    
    public boolean itemSold(){
        for (int i = 0; i < item.size(); i++){
            if(item.get(i).equals(item)){
                item.remove(i);
                return true;
            }
        }
        System.out.println("You have sold: " + Name);
        return false;
    }   
}
