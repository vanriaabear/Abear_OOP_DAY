
package abear_rpg;


public class Paladin extends Swordsman{
    
    private boolean hasResurrected;
    
    public boolean isHasRessurected(){
        return hasResurrected;
    }
    
    public Paladin(){
        super();
        boolean hasResurrected = false;
    }
    
    
    
    
    public void receiveDamage (int damage){
        if (damage % 2 == 0){
            resurrect ();
        }
    }
    
    public void resurrect(){
        if (hasResurrected){
            hasResurrected = true;
            setHealth(100);
        } else {
            System.out.println("Paladin has died");
        }
    }
    
}
