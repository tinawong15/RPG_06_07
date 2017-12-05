public class Monster extends Character{
	
	public Monster(){
		health = 150;
		strength = 20 + (int) (Math.random() * 45); // random number btwn 20 and 65 
		defense = 20;
		attackRating = 1;
	}



}  
