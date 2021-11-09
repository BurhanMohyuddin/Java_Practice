package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike obj = new MountainBike(20,7,5);
        System.out.println("Gear is : " + obj.gear);
        System.out.println("Speed is : " + obj.speed);
        System.out.println("Seat Height is : " + obj.seatHeight);
        obj.applyBreak(2);
        System.out.println("Speed after applying break is : " + obj.speed);
        obj.speedUp(3);
        System.out.println("Speed after applying speed is : " + obj.speed);
    }
}
