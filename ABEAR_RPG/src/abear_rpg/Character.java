
package abear_rpg;


public class Character {
    
    private int health;
    private int damage;
    private int shield;
    
    public Character (int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
        
    }
    
    public int getHealth (){
        return health;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getShield(){
        return shield;
    }
    
    public void setHealth (int health){
        this.health = health;
    }
    
    public void reeiveDamage (int damage){
        health = health - (damage-shield);
        
        if (health <= 0){
            System.out.println("Character has died");
        }
    }

    void receiveDamage(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
