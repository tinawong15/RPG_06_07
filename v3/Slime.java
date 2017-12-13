public class Slime extends Monster {
    
    public Slime() {
        super();
        strength += 10;
    }

    public String toString() {
        String ans = super.toString();
        ans += "Type: Slime" + "\n";
        return ans;
    }

}
