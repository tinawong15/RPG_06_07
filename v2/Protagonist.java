public class Protagonist extends Character{
    private String name;
    private int baseDef; // for normalization
    private double baseAtk;
    
    public Protagonist(String name){
        this.name = name;
        health = 125;
        strength = 100;
        defense = 40;
        attackRating = 0.4;
        baseDef = 40; // "normal" values
        baseAtk = 0.4;
    }

    public String getName() {
        return name;
    }
  
    public void specialize() {
        defense -= 10;
        attackRating += 0.1;
     }
  
    public void normalize() {
        defense = baseDef;
        attackRating = baseAtk;
     }
}
