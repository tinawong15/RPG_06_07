public abstract class Protagonist extends Character{
// <<<<<<< HEAD
//=======
    //without naming the class abstract: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
//>>>>>>> 31a75bfb84d9cba08e7b21b664a34b171e47c12d
    protected String name;
    protected int baseDef; // for normalization
    protected double baseAtk;
    
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

// <<<<<<< HEAD
    // Abstract methods cannot have a body

    public abstract String toString();
    
    /*
    public abstract String toString() {
	String output = "";
	output += "Protagonist " + name + "'s stats" + "\n"
	    + "Health: " + health + "\n"
	    + "Strength:" + strength + "\n"
	    + "Defense: " + defense + "\n"
	    + "Attack Rating: " + attackRating + "\n";
	return output;
    }
    */

    
	
	    
}
