package com.game.weapon;


/**
 * This is the abstract class Weapon that represent an weapon.
 * 
 * @author romuloaugusto
 *
 */

public abstract class Weapon {
	
	// Encapsulation the name property [Encapsulation]
	private String name;
	
	// Behavior that subclasses should implements
	public abstract void behavior();


	//  [Encapsulation]
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	// [Encapsulation]
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
