/**
 * This will be the driver class to test the implementation of the GameObject class
 * 
 * @author kevinma
 * @studentID 300867968
 * @date Friday, September 16, 2016
 * @file GameObjectTest.java
 *
 */

package exercise3;

import javax.swing.JOptionPane;

public class GameObjectTest {

	public static void main(String[] args) {

		// Write a driver class to test the GameObject class. The driver class
		// (main class) interacts with the user and calls GameObject methods to
		// initialize or update the game object.

		// Use the methods of JOptionPane class for providing input/output in
		// the driver class.

		// VARIABLE DECLARATIONS
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		int x;
		int y;
		double velocity;
		int gameObjectState;
		double rotation;
		GameObject gameObject;

		// Instantiating objects from GameObject class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// prompting user input using JOptionPane class
		x = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the integer x-value of the center of the game object: "));
		y = Integer.parseInt(
				JOptionPane.showInputDialog("Please enter the integer y-value of the center of the game object: "));
		velocity = Double.parseDouble(JOptionPane.showInputDialog("Please enter the velocity of the game object: "));
		gameObjectState = Integer.parseInt(JOptionPane.showInputDialog(
				"Please enter an integer to represent the state of the game object (1 for Alive, 2 for Dead): "));
		rotation = Double.parseDouble(JOptionPane.showInputDialog("Please enter the rotation of the game object: "));
		gameObject = new GameObject(x, y, velocity, gameObjectState, rotation);

		// Invoking public methods of the GameObject class
		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		// Initial State post initialization
		JOptionPane.showMessageDialog(null, String.format("Initial Game Object status: %n%s%n%s%n",
				"----------------------------------------------------------------------", gameObject.getGameObject()));

		// Invoking killGameObject method
		gameObject.killGameObject();
		JOptionPane.showMessageDialog(null, String.format("Updated Game Object status: %n%s%n%s%n",
				"----------------------------------------------------------------------", gameObject.getGameObject()));
		
		gameObject.killGameObject();
		JOptionPane.showMessageDialog(null, String.format("Updated Game Object status: %n%s%n%s%n",
				"----------------------------------------------------------------------", gameObject.getGameObject()));

		// Updating center from User input
		// X
		x = Integer.parseInt(JOptionPane.showInputDialog("Please enter the x coordinate of the new center: "));
		gameObject.setGameObjectCenterX(x);

		JOptionPane.showMessageDialog(null, String.format("Updated Game Object status: %n%s%n%s%n",
				"----------------------------------------------------------------------", gameObject.getGameObject()));

		// Y
		y = Integer.parseInt(JOptionPane.showInputDialog("Please enter the y coordinate of the new center: "));
		gameObject.setGameObjectCenterY(y);

		JOptionPane.showMessageDialog(null, String.format("Updated Game Object status: %n%s%n%s%n",
				"----------------------------------------------------------------------", gameObject.getGameObject()));

	}

}
