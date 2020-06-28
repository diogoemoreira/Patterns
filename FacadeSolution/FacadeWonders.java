package projetoPDS.FacadeSolution;

import java.util.Scanner;

public class FacadeWonders {
	
	public FacadeWonders() {
	}
	
	public Hero createHero(String charName,HeroClass hc) {
		return new Hero(charName,hc);
	}
	
	public void fight(Hero h1, Hero h2) {
		//player with the highest spd goes first
		//the damage h1 does to h2 will be calculated with dmg from combat class minus half of defense from h2
		Combat playersFight= new Combat();
		double chosenSkill;
		
		//if h2 spd is higher than h1 swap them
		if(h1.getSPD()<h2.getSPD()){Hero htemp=h1;h1=h2;h2=htemp;}
		//
		
		//prints for battle start
		System.out.println(h1.getCharName()+" HP:" +h1.getHP() + " vs "+ h2.getCharName()+" HP:" +h2.getHP());
		Scanner sc = new Scanner(System.in);
		//
		while(true) {
			
			//start of round
			System.out.println(h1.getCharName() + " its your turn!\n");
			System.out.println("Choose your skill: \n1 NORMAL ATTACK \n" + h1.getSkills().toString() + "5 SURRENDER");
			//
			chosenSkill = sc.nextDouble();
			
			if(doChoice(chosenSkill,h1,h2,playersFight)) break; //processes de choice if true h2 wins
			
			System.out.printf("Player "+ h2.getCharName() +" has now: %.2f HP\n",h2.getHP()); //h2 gets damaged if dmg>0
			
			//confirm death
			if (confirmDeath(h1,h2,playersFight)) break; //confirms if one of the players died and ends the game
			//
			
			//h2 turn
			System.out.println(h2.getCharName() + " its your turn!\n");
			System.out.println("Choose your skill: \n1 NORMAL ATTACK \n" + h2.getSkills().toString() + "5 SURRENDER");

			chosenSkill = sc.nextDouble();

			if(doChoice(chosenSkill,h2,h1,playersFight)) break; //processes choice of h2 if true h2 surrendered

			System.out.printf("Player "+ h1.getCharName() +" has now: %.2f HP\n",h1.getHP()); //h1 gets damaged if dmg>0
			
			//confirms death
			if (confirmDeath(h2,h1,playersFight)) break; //confirms if one of the players died and ends the game

		}
		
	}

	public boolean doChoice(Double chosenSkill, Hero h1, Hero h2,Combat playersFight){
		//h1 normal attack
		if(chosenSkill==1) { 
			System.out.printf(h1.getCharName() +" did: %.2f dmg \n", (playersFight.normalDMG(h1,h2)));
			h2.damage(playersFight.normalDMG(h1,h2));
		}
		//
		
		//h1 ability attack
		else if(chosenSkill>1 && chosenSkill<5){
			h1.getSkills().abilityName(chosenSkill);;
			System.out.printf(h1.getCharName() +" did: %.2f dmg \n",(playersFight.abilityDMG(h1, chosenSkill,h2)));
			h2.damage(playersFight.abilityDMG(h1, chosenSkill,h2));
		}
		//
		
		//h1 SURRENDER
		else if(chosenSkill==5) {
			System.out.println("Congrats "+h2.getCharName()+" you win!");
			return true;
		}
		//
		
		//miss
		else {
			System.out.println("Well you did a mistake so you miss\n");
		}
		return false;
	}

	public boolean confirmDeath(Hero h1,Hero h2,Combat playersFight){
		if(playersFight.CombatEnd(h1, h2)==true) {
			System.out.println("Congrats "+h1.getCharName()+" you win! \n");
			return true;
		}
		return false;
	}
	
}
