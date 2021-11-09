package Interface;

public class mBike implements Bicycle{

    private int seatHeight;
    private int speed;
    private int gear;

    public mBike(int seatHeight, int speed, int gear) {
        this.seatHeight = seatHeight;
        this.speed = speed;
        this.gear = gear;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed-decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed+increment;
    }
}
