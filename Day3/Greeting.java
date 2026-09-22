package Day3;

import java.util.Scanner;

public class Greeting {
    static Scanner sc=new Scanner(System.in);
    static String getuserName()
    {
        System.out.println("Please enter your name");

        String name=sc.nextLine();
        return name;
    }
    static void greeting(String name)
    {
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        greeting(getuserName());
    }
}