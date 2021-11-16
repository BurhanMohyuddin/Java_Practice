package Abstraction;

public class Rectangle extends GraphicObject{


    public Rectangle(int i, int i1, String rectangle) {
        super(i , i1 , rectangle);
    }

    void draw() {
        System.out.println("Drawing " +this.name+ " at location of X-axis : " + this.x + " and Y-axis : " + this.y );
    }

    void resize() {
        System.out.println("Resizing rectangle");
    }
}
