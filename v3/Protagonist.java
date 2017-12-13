public abstract class Protagonist extends Character{
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

    public static void main(String[] args) {

	/*
	  Error Message for making toString() abstract without changing header

	  Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
	  public class Protagonist extends Character{
	  ^
       Protagonist.java:30: error: abstract methods cannot have a body
       public abstract String toString() {
                           ^
			   2 errors
	*/

	/*
	  Error Message for instantiating a Protagonist

	  Protagonist.java:64: error: Protagonist is abstract; cannot be instantiated
	  Protagonist james = new Protagonist();
                            ^
			    1 error

	*/

	//	Protagonist james = new Protagonist();

	/*
	  Error Message for not overriding toString() in a subclass

	  Archer.java:1: error: Archer is not abstract and does not override abstract method toString() in Protagonist
	  public class Archer extends Protagonist{
	  ^
	  1 error
	*/

    }
	
	    
}
