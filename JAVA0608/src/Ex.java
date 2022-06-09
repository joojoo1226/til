
public class Ex {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.CirclePaint();
		
		Rectangle r = new Rectangle();
		r.rDraw();

		Triangle t = new Triangle();
		t.design();
		
		c.draw();
		r.draw();
		t.draw();
		
		System.out.println("==================================================");
		
		Shape s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		System.out.println("==================================================");
		
//		Shape[] sArr = new Shape[3];
//		
//		sArr[0] = new Circle();
//		
//		sArr[1] = new Rectangle();
//		
//		sArr[2] = new Triangle();
		
		Shape[] sArr = {new Circle(), new Rectangle(), new Triangle()};
		
//		sArr[0].draw();
//		sArr[1].draw();
//		sArr[2].draw();
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		
		System.out.println("=================================================");
		
		polymorphismDraw(sArr);
		
		System.out.println("=================================================");
		
		polymorphismDraw2(new Circle());
		polymorphismDraw2(new Rectangle());
		polymorphismDraw2(new Triangle());
		
	}
	
	public static void polymorphismDraw(Shape[] sArr) {
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		
	}
	
	public static void polymorphismDraw2(Shape s) {
		
		s.draw();
		
	}

}

class Shape {
	
	public void draw() {
		System.out.println("도형그리기!");
	}
	
}

class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("원 그리기"); 
	
	}
	
	public void CirclePaint() {
		System.out.println("원 그리기!");
		
	}
	
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	public void rDraw() {
		System.out.println("사각형 그리기");
	}
	
}

class Triangle extends Shape {

	@Override
	public void draw() {
		System.out.println("삼각형 그리기");
	}

	public void design() {
		System.out.println("삼각형 그리기");
	}
	
}
