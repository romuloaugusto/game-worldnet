package com.game.weapon;

/**
 * Class Revolver that inherits of Weapon abstract class and overrides the 
 * behavior() method. [Inheritance]
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 */

public class Revolver extends Weapon {

	/**
	 * Constructor from Superclass
	 */
	public Revolver() {
		super();
	}
	
	/**
	 * Specific constructor
	 * 
	 * @param name
	 */
	public Revolver(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * Specific behavior of Revolver
	 */
	@Override
	public void behavior() {
		System.out.println("Shoot with Revolver");
	}
	
	

}
