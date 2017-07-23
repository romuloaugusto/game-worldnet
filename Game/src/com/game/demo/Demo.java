package com.game.demo;
import java.util.ArrayList;

import com.game.character.Character;
import com.game.character.Daryl;
import com.game.character.Michonne;
import com.game.character.Negan;
import com.game.character.Rick;
import com.game.weapon.BaseballBat;
import com.game.weapon.BowAndArrow;
import com.game.weapon.Katana;
import com.game.weapon.Revolver;
import com.game.weapon.Weapon;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * Demonstration class of the game
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		
		//Available Weapons in the game : Baseball Bat wrapped in Barb Wire, Bow-and-Arrow, Revolver and Katana.
		ArrayList<Weapon> weapons = new ArrayList<>();
		weapons.add(new BaseballBat("Baseball Bat wrapped in Barb Wire"));
		weapons.add(new BowAndArrow("Bow-and-Arrow"));
		weapons.add(new Revolver("Revolver"));
		weapons.add(new Katana("Katana"));
		
		//Available Characters in the game: Rick, Daryl, Michonne, Negan
		ArrayList<Character> characters = new ArrayList<>();
		characters.add(new Rick("Rick"));
		characters.add(new Daryl("Daryl"));
		characters.add(new Michonne("Michonne"));
		characters.add(new Negan("Negan"));

		// Creating a player
		Character player1 = characters.get(0);
		
		// Trying to use a weapon.
		player1.toUseCurrentWeapon();
		
		// Set a current weapon
		player1.setCurrentWeapon(weapons.get(0));
		
		// Specific weapon behavior. Here we are using Polymorphism when specific weapon behavior is called
		player1.toUseCurrentWeapon();
		
		// Changing weapon
		player1.setCurrentWeapon(weapons.get(2));
		
		// Specific weapon behavior. Here we are using Polymorphism when specific weapon behavior is called
		player1.toUseCurrentWeapon();
		
		
	}

}
