package projetoPDS.FacadeSolution;

public class Main {
	
	public static void main(String[] args) {	
	FacadeWonders fw = new FacadeWonders();
	Hero MichaelTheCleric = fw.createHero("Michael",HeroClass.CLERIC);
	Hero JackTheMage = fw.createHero("Jack",HeroClass.MAGE);
	
	fw.fight(MichaelTheCleric,JackTheMage);

	Hero FornicFaceTheWarrior = fw.createHero("FornicFace", HeroClass.WARRIOR);
	Hero NibBusterTheRogue = fw.createHero("NibBuster", HeroClass.HUNTER);
	
	fw.fight(FornicFaceTheWarrior, NibBusterTheRogue);
	
	}
}