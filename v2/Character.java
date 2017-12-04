public class Character {
	protected int health;
	protected int strength;
	protected int defense;
	protected double attackRating;

	public boolean isAlive() {
		return health > 0;
	}

	public int getDefense() {
		return defense;
	}
  
  protected void lowerHP(int amount) {
		health -= amount;
	}
  
  public int attack(Character c) {
    int damage = 0;
    if (   strength * attackRating   - defense  > 0) {
    	damage = (int) (  strength * attackRating   - c.getDefense());
    }
    c.lowerHP(damage);
    return damage; // damages the monster 
	}
}