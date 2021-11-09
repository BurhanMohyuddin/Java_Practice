package Inheritance;

public class MountainBike extends bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed , int seatHeight) {
        super(gear, speed);
        this.seatHeight= seatHeight;
    }

    public void setHeight(int newVal){
        this.seatHeight = newVal;
    }
}
