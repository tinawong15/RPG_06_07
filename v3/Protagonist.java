public abstract class Protagonist extends Character{
    //without naming the class abstract: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
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

    public abstract String toString(); 
 //    {
	// String output = "";
	// output += "Protagonist " + name + "'s stats" + "\n"
	//     + "Health: " + health + "\n"
	//     + "Strength:" + strength + "\n"
	//     + "Defense: " + defense + "\n"
	//     + "Attack Rating: " + attackRating + "\n";
	// return output;
 //    }

    public static void main(String[] args) {
	//when instantiating a protagonist: error: Protagonist is abstract; cannot be instantiated
 //    Protagonist james = new Protagonist("Michael");
	// System.out.println(james);
    }
	
	    
}
