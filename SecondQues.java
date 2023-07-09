/*
 * Create a superclass called Shape with an abstract method calculateArea() that returns the area of the shape. Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class. Implement the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and triangle, respectively. Then, create a class called ShapeCalculator with a method printArea(Shape shape) that accepts an object of type Shape and prints its area. Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.
 */
abstract class Shape {
    Shape() {

    }

    public float area;

    public abstract float calculateArea();
}

class Rectangle extends Shape {
    float length, width;
    Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
    @Override
    public float calculateArea() {
         area = length * width;
        return area;
    }
}

class Circle extends Shape{
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    @Override
    public float calculateArea(){
         area=3.14f*radius*radius;
         return area;
    }
}

class Triangle extends Shape{
    float base,height;
    Triangle(float base, float height){
        this.base=base;
        this.height=height;
    }
    @Override 
    public float calculateArea(){
        area=(height*base)/2;
        return area;
    }
}
class ShapeCalculator{
    public void printArea(Shape shape){
       System.out.println("Area : "+shape.calculateArea());
    }
}
public class SecondQues {
public static void main(String[] args) {
    Shape rect=new Rectangle(10,20);
    Shape circle=new Circle(10);
    Shape trian=new Triangle(10, 12);

    ShapeCalculator shape=new ShapeCalculator();
    System.out.print("Rectangle ");
    shape.printArea(rect);

    System.out.print("Circle ");
    shape.printArea(circle);

    System.out.print("Triangle ");
    shape.printArea(trian);
}
}
