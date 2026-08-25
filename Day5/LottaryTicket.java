package Day5;

import java.util.Random;

public class LottaryTicket {

    public static void main(String[] args) {
        int[] ticket = generateTicketNumbers();
        printTicketNumbers(ticket);
    }

    public static int[] generateTicketNumbers() {
        int[] ticket = new int[6];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = random.nextInt(69) + 1;
        }
        return ticket;
    }

    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " /  ");
        }
    }
}