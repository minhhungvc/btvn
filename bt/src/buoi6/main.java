package buoi6;

public class main {
	public static void main (String a[]) {
		Triangle triangle= new Triangle ("red",10,5);
		System.out.println("dien tich tam giac la :"+ triangle.getArea()+"mau :"+triangle.getColor());
		Rectangle rectangle=new Rectangle("pink",10,10);
		System.out.println("dien tich chu nhat là :"+ rectangle.getArea()+"mau :"+rectangle.getColor());
	}

}
