public class Archer extends Protagonist{
	public Archer( String name) {
		super( name);
		attackRating += .2;
	}

	public String toString() {
		String ans = super.toString();
		ans += "Type: Archer" + "\n";
		return ans;
	}
}
