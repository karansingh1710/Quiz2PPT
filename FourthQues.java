/*
 * Create an interface called Drawable with a method draw() that has no implementation. Implement this interface in classes Circle and Rectangle. Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.
 */
interface Drawable{
    void draw();
}

class Circle implements Drawable{
    @Override
   public void draw(){
        System.out.println("Drawing Circle .........");
    }
}

class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle .........");
    }
}
public class FourthQues {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();

        Rectangle r=new Rectangle();
        r.draw();
    }
}
