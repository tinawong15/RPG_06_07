public class Warrior extends Protagonist{
	public Warrior() {
		super(String name);
		strength += 10;

	}

	public String toString() {
		String ans = super();
		ans += "Type: Warrior" + "\n";
		return ans;
	}
}
