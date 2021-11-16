package Abstraction;

public abstract class GraphicObject {

    public int x , y;
    public String name;
//    public int radius;

//    public GraphicObject(int x, int y, String name , int radius) {
//        this.x = x;
//        this.y = y;
//        this.name = name;
//        this.radius = radius;
//    }

    public GraphicObject(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    GraphicObject(){
        System.out.println("Parent abstract class");
    }

//    String currentLocation(int x , int y) {
//        return (" and current location of X-axis : " + x +  " and Y-axis : "+ y);
//    }
    void moveTo(int x , int y){
        this.x= x;
        this.y = y;
        System.out.println("Move X-axis of circle to : " + x +  " and move Y-axis of circle to : "+ y);
    }
    void moveToRectangle(int x , int y){
        this.x= x;
        this.y = y;
        System.out.println("Move X-axis of Rectangle to : " + x +  " and move Y-axis of Rectangle to : "+ y);
    }

    abstract void draw();
    abstract void resize();


}
