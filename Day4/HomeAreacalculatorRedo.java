package Day4;

import java.util.Scanner;

public class HomeAreacalculatorRedo {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreacalculatorRedo home=new HomeAreacalculatorRedo();
        Rectangle kitchen=home.getRoomDimensions();
        Rectangle bathroom=home.getRoomDimensions();
        home.sc.close();
        double total;

    }
    Rectangle getRoomDimensions()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Room Length: ");
        double length = input.nextDouble();
        System.out.println("Enter Room Width: ");
        double width = input.nextDouble();
        Rectangle room = new Rectangle(length, width);
        return room;

    }
}