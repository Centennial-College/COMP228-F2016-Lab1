/**
 * This class will be the blueprint for the GameObject object
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file GameObject.java
 *
 */

package exercise3;

import javax.swing.JOptionPane;

public class GameObject {

	// In this exercise you will develop a Java application that allows the user
	// to process game objects. Create a class named GameObject. A game object
	// should contain information about object center, velocity, object state
	// (alive or dead), and object rotation. The object center is defined by its
	// x and y coordinates.

	// Provide a constructor that allows the user to initialize game object
	// information. Provide all getter methods. Provide a getGameObject method
	// to return game object information in a nicely formatted string.

	// INSTANCE VARIABLES
	// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private Vector2D _gameObjectCenter;
	private double _velocity;
	private GameObjectState _gameObjectState;
	private double _rotation;

	// CONSTRUCTORS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public GameObject(int x, int y, double velocity, int gameObjectState, double rotation) {
		this._gameObjectCenter = new Vector2D(x, y);
		this._velocity = velocity;
		this._gameObjectState = gameObjectState == 1 ? GameObjectState.Alive : GameObjectState.Dead;
		this._rotation = rotation;
	}

	// GETTER AND SETTER METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Vector2D getGameObjectCenter() {
		return this._gameObjectCenter;
	}

	public double getVelocity() {
		return this._velocity;
	}

	public GameObjectState getGameObjectState() {
		return this._gameObjectState;
	}

	public double getRotation() {
		return this._rotation;
	}

	// Included setters because no way to update game object
	public void setGameObjectCenterX(int x) {
		this._gameObjectCenter = new Vector2D(x, this.getGameObjectCenter().getY());
	}

	public void setGameObjectCenterY(int y) {
		this._gameObjectCenter = new Vector2D(this.getGameObjectCenter().getX(), y);
	}

	public void setVelocity(double velocity) {
		this._velocity = velocity;
	}

	public void setRotation(double rotation) {
		this._rotation = rotation;
	}

	// PUBLIC METHODS
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	/**
	 * This method kills the game object if it is not already dead.
	 * 
	 * @public
	 * @method killGameObject
	 * @return {void}
	 */
	public void killGameObject() {
		if (this.getGameObjectState() == GameObjectState.Alive) {
			this._gameObjectState = GameObjectState.Dead;
			JOptionPane.showMessageDialog(null, "The Game Object has been killed.");
		} else {
			JOptionPane.showMessageDialog(null, "The Game Object is already dead, cannot kill it!");
		}
	}

	/**
	 * This method returns the game object's info in a nicely formatted string.
	 * 
	 * @public
	 * @method getGameObject
	 * @return {String}
	 */
	public String getGameObject() {
		String gameObjectInfo = String.format("Center: %s%nVelocity: %.2f%nState: %s%nRotation: %.2f%n",
				this.getGameObjectCenter().getVector2DInfo(), this.getVelocity(), this.getGameObjectState(),
				this.getRotation());

		return gameObjectInfo;
	}
}
