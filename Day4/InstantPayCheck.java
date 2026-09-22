package Day_4;

import java.util.Scanner;

public class InstantPayCheck {
    static double requiredSalary = 20000;
    static double requiredScore = 500;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        double salary =getEmployeeSalary();
        double score = getEmployeeScore();
        boolean qualified = isQualified(salary,score);
        notifyUser(qualified);

    }
    static double getEmployeeSalary(){
        System.out.println("Please enter your salary:");
        double salary=sc.nextDouble();
        return salary;
    }
    static double getEmployeeScore(){
        System.out.println("Please enter your score:");
        double score=sc.nextDouble();
        return score;
    }

    static boolean isQualified(double employeeSalary, double employeeCreditScore) {
        if (employeeSalary >= requiredSalary && employeeCreditScore >= requiredScore) {
            return true;

        }
        else  {
            return false;
        }

    }
    static void notifyUser(boolean quailified){
        if(quailified){
            System.out.println(" Congratualtions ! You are qualified for the loan");
        }
        else{
            System.out.println(" Sorry, you are not qualified for the loan");
        }

    }
}