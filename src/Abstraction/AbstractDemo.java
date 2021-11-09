package Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();

        circle.draw();
        circle.resize();
        circle.moveTo(30,40);

        GraphicObject rectangle = new Rectangle();

        rectangle.draw();
        rectangle.resize();

        rectangle.moveTo(10,20);
    }
}
