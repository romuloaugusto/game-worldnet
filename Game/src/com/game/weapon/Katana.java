package com.game.weapon;

/**
 * Class Katana that inherits of Weapon abstract class and overrides the behavior() 
 * method. [Inheritance]
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 */
public class Katana extends Weapon {


	/**
	 * Constructor from Superclass
	 */
	public Katana() {
		super();
	}
	
	/**
	 * Specific constructor
	 * 
	 * @param name
	 */
	public Katana(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * Specific behavior of Revolver
	 */
	@Override
	public void behavior() {
		System.out.println("Attack with Katana");
	}

}
