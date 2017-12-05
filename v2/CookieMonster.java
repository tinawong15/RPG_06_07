public class CookieMonster extends Monster {
    
    public CookieMonster() {
        super();
        health += 10;
    }

    public String toString() {
        String ans = super.toString();
        ans += "Type: Cookie Monster" + "\n";
        return ans;
    }

}
