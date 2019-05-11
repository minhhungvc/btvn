package buoi6;

public class Triangle extends Shape{
private int base;
private int height;
public Triangle(String color, int base, int height) {
	super(color);
	this.base = base;
	this.height = height;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
@Override
	public double getArea() {
		
		return 0.5*this.base*this.height;
	}
@Override
public String toString() {
	
	return this.getColor();
}
}
