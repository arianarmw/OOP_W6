/* Author : Ariana Rahmawati
 * Date   : September 29th 2022
 * Lesson : Inheritance, Abstract Class, and Interface
 * Course : Object Oriented Programming (OOP)
 * Program ini merupakan hasil revisi dan pengembangan dari modul yang diberikan oleh dosen
 */

package Exercise2;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square kotak = new Square(20);
		System.out.println(kotak);
		System.out.println(kotak.getArea());
		System.out.println(kotak.getPerimeter());
		System.out.println("");
		
		Rectangle persegi = new Rectangle(20,10);
		System.out.println(persegi);
		System.out.println(persegi.getArea());
		System.out.println(persegi.getPerimeter());
		System.out.println("");
		
		Circle bulat = new Circle(10);
		System.out.println(bulat);
		System.out.println(bulat.getArea());
		System.out.println(bulat.getPerimeter());
	}

}
