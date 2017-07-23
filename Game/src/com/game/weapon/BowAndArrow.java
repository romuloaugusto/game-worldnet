package com.game.weapon;

/**
 * Class BowAndArrow that inherits of Weapon abstract class and overrides the 
 * behavior() method. [Inheritance]
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 */
public class BowAndArrow extends Weapon {

	/**
	 * Constructor from Superclass
	 */
	public BowAndArrow() {
		super();
	}
	
	/**
	 * Specific constructor
	 * 
	 * @param name
	 */
	public BowAndArrow(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * Specific behavior of Revolver
	 */
	@Override
	public void behavior() {
		System.out.println("Attack with Bow-And-Arrow");
	}

	
}
