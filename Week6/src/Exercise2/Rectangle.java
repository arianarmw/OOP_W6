/* Author : Ariana Rahmawati
 * Date   : September 29th 2022
 * Lesson : Inheritance, Abstract Class, and Interface
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Exercise2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	//1st Constructor
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	// 2nd constructor
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	//3rd Constructor
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return (2*width) + (2*length);
	}
	
	@Override
	public String toString() {
		
		return "A Rectangle with width " + width + " and length " + length + " which is a sublass of" + super.toString();
	}
	
}
