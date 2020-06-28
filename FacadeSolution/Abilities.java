package projetoPDS.FacadeSolution;

import java.util.HashMap;

public class Abilities {
	HeroClass hero;
	HashMap<AllAbilities,Double> skills;
	AllAbilities[] skillModifier = new AllAbilities[3];
	

	public Abilities(HeroClass hclass) {
		this.hero=hclass;
		giveAbilities(hclass);
	}

	@SuppressWarnings("serial")
	public void giveAbilities(HeroClass hero){
		switch(hero){
			case MAGE:skills=new HashMap<AllAbilities,Double>(){
				{
				put(AllAbilities.FIREBALL,0.8);
				put(AllAbilities.STONEBULLET,0.8);
				put(AllAbilities.WINDSTORM,1.0);
				}
			};break;
			case HUNTER:skills=new HashMap<AllAbilities,Double>(){
				{
				put(AllAbilities.DAGGERTHROW,0.8);
				put(AllAbilities.POISONDAGGER,0.8);
				put(AllAbilities.SNEAKATTACK,1.0);
				}
			};break;
			case WARRIOR:skills=new HashMap<AllAbilities,Double>(){
				{
				put(AllAbilities.SWORDSLASH,0.8);
				put(AllAbilities.SHIELDBASH,0.8);
				put(AllAbilities.SKULLBASH,1.0);
				}
			};break;
			case CLERIC:skills=new HashMap<AllAbilities,Double>(){
				{
				put(AllAbilities.GODSTEST,0.8);
				put(AllAbilities.DIVINEATTACK,0.8);
				put(AllAbilities.HOLYSMITE,1.0);
				}
			};break;
			default:break; //o erro de nao ser uma destas classes ja foi tratado
		}
	}
	
	public double abilityDmg(double choice) {
		//used to get the modifier of the ability
		return skills.get(skillModifier[(int)choice-2]);
	}
	public void abilityName(double choice) {
		//used to get the modifier of the ability
		System.out.println("Used: "+skillModifier[(int)choice-2]);
	}
	
	@Override
	public String toString() {
		String str = "";
		int counter=0;
		for(AllAbilities s: skills.keySet()) {
			str+= (counter+2) + " " + s +"\n";
			skillModifier[counter] = s;
			counter++;
		}
		return str;
	}
}
