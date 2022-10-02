/* Author : Ariana Rahmawati
 * Date   : September 29th 2022
 * Lesson : Inheritance, Abstract Class, and Interface
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Exercise2;

public class Shape {
	private String color;
	private boolean filled;
	
	//1st Constructor
	public Shape() {
		color = "red";
		filled = true;
	}
	
	// 2nd constructor
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//Setter & Getter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		String filledStr;
		if(!filled) {
			filledStr = "not Filled";
		} else {
			filledStr = "filled";
		}
		
		return "\nA Shape with color of " + color + " and " + filledStr;
	}
	
	
}
