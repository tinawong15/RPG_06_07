public class UserOfRPGv2 {
	public static void main(String[] commandLine){
		Warrior walrus = new Warrior("walrus");
		Mage marge = new Mage("marge");
		Archer archie =  new Archer("archie");
		Goblin gobbles = new Goblin();
		CookieMonster nom = new CookieMonster();
		Slime squish = new Slime();

		//Character[] agents = { walrus, marge, archie, gobbles, nom, squish,	};
		Protagonist[] agents = { 
			 walrus, 
			 marge, 
			 archie, 
			// gobbles, 
			// nom, 
			//squish,	
            };
		//It will fail when it reaches characters that are of type Protagonist.
		//error: incompatible types: Warrior cannot be converted to Monster
		for(Character agent : agents) {
			System.out.println(agent);
		}
/*
		for(int counter = 0; counter < agents.length; counter++) {
			System.out.println(Protagonist.getName(agents[counter]));
		}
		//It will fail because monsters do not have names.
		//error: method getName in class Protagonist cannot be applied to given types;
		//required: no arguments
		//found: Monster
		//reason: actual and formal argument lists differ in length
*/
	}
}
