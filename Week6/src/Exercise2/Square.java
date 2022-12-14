/* Author : Ariana Rahmawati
 * Date   : September 29th 2022
 * Lesson : Inheritance, Abstract Class, and Interface
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Exercise2;

public class Square extends Rectangle{
	
	//1st Constructor
	public Square() {
		super();
	}
	
	// 2nd constructor
	public Square(double side) {
		super(side, side);
	}
	
	//3rd Constructor
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	//Getter and Setter
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		
		return "A Square with side " + getSide() + " which is a sublass of " + super.toString();
	}
	
	public double getArea() {
		return getSide()*getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}
}
