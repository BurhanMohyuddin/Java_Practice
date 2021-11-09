package Abstraction;

public abstract class GraphicObject {

    int x , y;

    GraphicObject(){
        System.out.println("Parent abstract class");
    }

    void moveTo(int x , int y){
        System.out.println("Move X to : " + x +  " and move Y to : "+ y);
    }

    abstract void draw();
    abstract void resize();
}
