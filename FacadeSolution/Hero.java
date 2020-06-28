package projetoPDS.FacadeSolution;

public class Hero {
	protected double HP,STR,SPD,MAG,DEF;
	protected HeroClass hclass;
	protected String charName;
	protected Abilities skills;
	
	public Hero(String charName,HeroClass hclass) {
		this.charName=charName;
		this.hclass=hclass;
		createStats(hclass);
	}
	
	private void createStats(HeroClass hclass) {
		switch(hclass) {
			case MAGE: HP=40;STR=8;SPD=11;MAG=16;DEF=10;break;	//mage is good at magic attacks
			case HUNTER: HP=48;STR=12;SPD=16;MAG=8;DEF=12;break;//hunter is very fast so he attacks first
			case WARRIOR: HP=60;STR=13;SPD=10;MAG=4;DEF=14;break;//warrior is very tanky but not very fast
			case CLERIC: HP=56;STR=10;SPD=10;MAG=10;DEF=13;break;//well rounded class and can heal himself while doing dmg
			default: System.out.println("class doesn't exist default class will be applied (WARRIOR)");
				this.hclass=HeroClass.WARRIOR;HP=15;STR=13;SPD=10;MAG=4;DEF=14;break; //warrior class is the default
		}
		skills = new Abilities(this.hclass);
	}
	
	public void damage(double dmg) {
		if(dmg>0) {HP-=dmg;}
	}

	
	public double getHP() {
		return HP;
	}

	public double getSTR() {
		return STR;
	}

	public double getSPD() {
		return SPD;
	}

	public double getMAG() {
		return MAG;
	}

	public double getDEF() {
		return DEF;
	}

	public HeroClass getHclass() {
		return hclass;
	}

	public String getCharName() {
		return charName;
	}
	
	public Abilities getSkills() {
		return skills;
	}
	
}
