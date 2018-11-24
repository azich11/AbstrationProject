import java.util.ArrayList;

public class Inventory {
    ArrayList<Attribute> bag;
    Hero hero;

    Inventory(){
        this.bag = new ArrayList();
    }
    public void loot(Drop drop){
        for (Attribute i: drop.getDrop()){
            bag.add(i);
        }
    }
    public void use(int i){
        bag.get(i).add(this.hero);
    }

}