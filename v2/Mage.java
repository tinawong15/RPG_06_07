public class Mage extends Protagonist {
	public Mage() {
		super(String name);
		health += 25;
	}

	public String toString() {
		String ans = super();
		ans += "Type: Mage" + "\n";
		return ans;
	}
}