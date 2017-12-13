public class Goblin extends Monster {
    
    public Goblin() {
        super();
        defense += 10;
    }

    public String toString() {
        String ans = super.toString();
        ans += "Type: Goblin" + "\n";
        return ans;
    }

}
