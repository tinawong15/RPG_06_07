public class Monster extends Character{
	
	public Monster(){
		health = 150;
		strength = 20 + (int) (Math.random() * 45); // random number btwn 20 and 65 
		defense = 20;
		attackRating = 1;
	}

        public String toString() {
	String output = "";
	output +=
	    "Health: " + health + "\n"
	    + "Strength:" + strength + "\n"
	    + "Defense: " + defense + "\n"
	    + "Attack Rating: " + attackRating + "\n";
	return output;
    }

    public static void main(String[] args) {
	Monster james = new Monster();
	System.out.println(james);
    }



}  
