public class Mage extends Protagonist {
	public Mage(String name) {
		super( name);
		health += 20;
	}

	public String toString() {
		String ans = super.toString();
		ans += "Type: Mage" + "\n";
		return ans;
	}
}
