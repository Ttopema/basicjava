package chap06.oop.constructor;

public class Rectangle2 {
	private int width;
	private int length;
	private String color;
	
	public Rectangle2() {
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int area() {
		int result = 0;
		result = width * length;
		return result;
	}
	
	public int perimeter() {
		int result = 0;
		result = (width + length) * 2;
		return result;
	}

}
