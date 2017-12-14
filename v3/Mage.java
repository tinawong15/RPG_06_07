public class Mage extends Protagonist {
	public Mage(String name) {
		super( name);
		health += 20;
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
/*	public String toString() {
		String ans = super.toString();
		ans += "Type: Mage" + "\n";
		return ans;
	}
*/
}
