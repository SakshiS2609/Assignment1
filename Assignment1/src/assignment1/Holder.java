package assignment1;

public class Holder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Quadrilateral a=new Square(3,4);
  System.out.println("Area of Square is:");
   a.area();
  Quadrilateral b=new Rectangle(4,5);
  System.out.println("Area of Rectangle is:");
  b.area();
  
  Quadrilateral c=new Parallelogram(6,7);
  System.out.println("Area of Parallelogram is:");
 c.area();
	}

}
