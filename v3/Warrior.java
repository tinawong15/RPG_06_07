public class Warrior extends Protagonist{
	public Warrior(String name) {
		super( name);
		strength += 10;

	}

	public String toString() {
		String ans = super.toString();
		ans += "Type: Warrior" + "\n";
		return ans;
	}
}
