package Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        mBike obj = new mBike(20,7,5);
        System.out.println("Gear is : " + obj.getGear());
        System.out.println("Speed is : " + obj.getSpeed());
        System.out.println("Seat Height is : " + obj.getSeatHeight());
        obj.applyBrake(2);
        System.out.println("New Speed after applying break is : " + obj.getSpeed());
        obj.speedUp(5);
        System.out.println("Speed after applying speed is : " + obj.getSpeed());
    }
}
