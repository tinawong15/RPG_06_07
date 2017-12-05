public class Archer extends Protagonist{
	public Archer() {
		super(String name);
		attackRating += .2;
	}

	public String toString() {
		String ans = super();
		ans += "Type: Archer" + "\n";
		return ans;
	}
}