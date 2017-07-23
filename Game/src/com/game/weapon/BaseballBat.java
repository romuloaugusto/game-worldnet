package com.game.weapon;

/**
 * Class BaseballBat that inherits of Weapon abstract class and overrides 
 * the behavior() method. [Inheritance]
 * 
 * @author Romulo Augusto - romuloaugusto.silva@gmail.com
 */
public class BaseballBat extends Weapon {
	
	/**
	 * Constructor from Superclass
	 */
	public BaseballBat() {
		super();
	}
	
	/**
	 * Specific constructor
	 * 
	 * @param name
	 */
	public BaseballBat(String name) {
		super();
		this.setName(name);
	}
	
	/**
	 * Specific behavior of Revolver
	 */
	@Override
	public void behavior() {
		System.out.println("Attack with Baseball Bat");
	}
	

}
