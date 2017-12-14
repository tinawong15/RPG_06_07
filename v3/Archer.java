public class Archer extends Protagonist{
	public Archer( String name) {
		super( name);
		attackRating += .2;
	}

    public String toString() {
          String output = "";
        output += "Protagonist " + name + "'s stats" + "\n"
            + "Health: " + health + "\n"
            + "Strength:" + strength + "\n"
            + "Defense: " + defense + "\n"
            + "Attack Rating: " + attackRating + "\n";
 
         output += "Type: Archer" + "\n";
         return output;
     }
/*	public String toString() {
		String ans = super.toString();
		ans += "Type: Archer" + "\n";
		return ans;
	}
*/
}
