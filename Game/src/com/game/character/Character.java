package com.game.character;
import com.game.weapon.Weapon;

/**
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 * 
 * This class represents a Character. It has a 'name' property and 
 * a 'currentWeapon' property of the type Weapon. 
 *
 */
public abstract class Character {
	
	// Encapsulation the name property [Encapsulation]
	private String name;
	
	// Encapsulation the name currentWeapon [Encapsulation]
	private Weapon currentWeapon;
	
	/**
	 * Using the current weapon
	 */
	public void toUseCurrentWeapon() {
		if (currentWeapon != null) {
			currentWeapon.behavior();
		} else {
			System.err.println("Character doesn't have a weapon.");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the currentWeapon
	 */
	public Weapon getCurrentWeapon() {
		return currentWeapon;
	}

	/**
	 * @param currentWeapon the currentWeapon to set
	 */
	public void setCurrentWeapon(Weapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}
	

}
