public class Warrior extends Protagonist{
	public Warrior(String name) {
		super( name);
		strength += 10;

	}

	public String toString() {
	    String output = "";
      output += "Protagonist " + name + "'s stats" + "\n"
          + "Health: " + health + "\n"
          + "Strength:" + strength + "\n"
          + "Defense: " + defense + "\n"
          + "Attack Rating: " + attackRating + "\n";
      	
		output += "Type: Warrior" + "\n";
		return output;
	}
}
