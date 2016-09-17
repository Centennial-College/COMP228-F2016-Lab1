/**
 * This class will be the blueprint for the Vector2D object
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file Vector2D.java
 *
 */

package exercise3;

public class Vector2D {

	// INSTANCE VARIABLES
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int _x;
	private int _y;

	// CONSTRUCTORS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Vector2D(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	// GETTER AND SETTER METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getX() {
		return this._x;
	}

	public void setX(int x) {
		this._x = x;
	}

	public int getY() {
		return this._y;
	}

	public void setY(int y) {
		this._y = y;
	}

	// PUBLIC METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This method returns the 2d vector's info in a nicely formatted string.
	 * 
	 * @public
	 * @method getVector2DInfo
	 * @return {String}
	 */
	public String getVector2DInfo() {
		String vectorInfo = String.format("X: %d Y: %d", this.getX(), this.getY());

		return vectorInfo;
	}
}
