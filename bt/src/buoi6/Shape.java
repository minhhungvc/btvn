package buoi6;

public abstract class Shape {
	private String color;
	
	public abstract double getArea() ;
	
	public abstract String toString();
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}