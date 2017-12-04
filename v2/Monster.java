public class Monster extends Character{
	
	public Monster(){
		health = 150;
		strength = 20 + (int) (Math.random() * 45); // random number btwn 20 and 65 
		defense = 20;
		attackRating = 1;
	}


	public void lowerHP(int amount) {
		health = health - amount;
	}

	public int attack(Protagonist protag) {
    	int damage = 0;
        if ( ((strength * attackRating) - protag.getDefense()) > 0) {
        	damage = (int) ((strength * attackRating) - protag.getDefense());
        }
    	protag.lowerHP(damage); // damages the monster 
      	return damage;
	}
}  
