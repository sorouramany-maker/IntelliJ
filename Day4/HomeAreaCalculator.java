package Day4;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(20);
        room1.setWidth(10);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("The area of the room is " + areaOfRoom1);
        System.out.println("The counter is " + Rectangle.getCounter());

        Rectangle room2 = new Rectangle();
        room2.setLength(10);
        room2.setWidth(5);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("The area of the room is " + areaOfRoom2);
        System.out.println("The counter is " + Rectangle.getCounter());

        Rectangle room3 = new Rectangle();
        double areaOfRoom3 = room3.calculateArea();
        System.out.println("The area of the room is " + areaOfRoom3);

        Rectangle room4 = new Rectangle(50, 60);
        double areaOfRoom4 = room4.calculateArea();
        System.out.println("The area of the room is " + areaOfRoom4);
        System.out.println("The total area : " + (areaOfRoom1 + areaOfRoom2 + areaOfRoom3 + areaOfRoom4));
    }
}

