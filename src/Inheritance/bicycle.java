package Inheritance;

public class bicycle {
    protected int gear;
    protected int speed;

    public bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void applyBreak(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }
}
