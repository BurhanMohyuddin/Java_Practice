package Abstraction;

public class AbstractDemo {
    public static void main(String[] args) {
        GraphicObject[] graphicObjects = new GraphicObject[3];
        graphicObjects[0]  = new Circle(3,7 , "small_circle" , 7);
        graphicObjects[1] = new Rectangle(60,70,"huge_rectangle");
        graphicObjects[2] = new Circle(5,9 , "big_circle" , 20);


        System.out.println("\n" + "Circle : "+ "\n");
        GraphicObject Object;
        Object = graphicObjects[0];
        Object.draw();
        graphicObjects[2].draw();
        Object.moveTo(30,40);
        graphicObjects[2].moveTo(50,60);
        Object.resize();

        System.out.println("\n"+"Redraw circles on new coordinates"+"\n");
        Object.draw();
        graphicObjects[2].draw();

        System.out.println("\n" + "Rectangle : "+ "\n");

        Object = graphicObjects[1];
        Object.draw();
        Object.moveToRectangle(22,33);
        Object.resize();

        System.out.println("\n" + "Redraw rectangle on new coordinates : "+ "\n");
        Object.draw();

    }


}


