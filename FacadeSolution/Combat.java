package projetoPDS.FacadeSolution;

public class Combat {
	
	public Combat() {}
	
	public double normalDMG(Hero h1,Hero h2) {
		return h1.getSTR()-h2.getDEF()/2; //normal hit does dmg equal to STR from h1 to h2
		}
	
    public double abilityDMG(Hero h1, double chosenSkill,Hero h2) {
		return h1.getMAG()*h1.getSkills().abilityDmg(chosenSkill) - h2.getDEF()/2; //calculates dmg of chosen skill
		}
    
    public boolean CombatEnd(Hero h1,Hero h2) {
    	if(h1.getHP()<=0 || h2.getHP()<=0) {
    		return true;
    	}
    	return false;
    }
}