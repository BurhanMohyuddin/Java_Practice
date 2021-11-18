package Abstraction;

public class Circle extends GraphicObject{

    public int radius;

public Circle(int i, int i1, String circle , int radius) {

    super(i , i1 , circle);
    this.radius = radius;
}


    @Override
    void draw() {
        System.out.println("Drawing a " + this.name + " at location of X-axis : " + this.x + " and Y-axis : " + this.y + " and radius is : " + this.radius);

    }

    @Override
    void resize() {
        System.out.println("Resizing circle");
    }
}
