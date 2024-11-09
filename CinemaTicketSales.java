import java.util.Scanner;
public class CinemaTicketSales {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTicketsSold = 0;
        double totalSales = 0;
        final int TICKET_PRICE = 50000;

        while (true) {
            System.out.print("Enter number of tickets (or type -1 to finish): ");
            int tickets = scanner.nextInt();
            if (tickets == -1) {
                break;
            }
            if (tickets < 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                continue;
            }
            double ticketCost = tickets * TICKET_PRICE;
            if (tickets > 10) {
                ticketCost *= 0.85; 
            } else if (tickets > 4) {
                ticketCost *= 0.90; 
            }

            totalTicketsSold += tickets;
            totalSales += ticketCost;
            System.out.printf("Total price for this purchase: Rp %.2f%n", ticketCost);
        }
        System.out.printf("Total tickets sold today: %d%n", totalTicketsSold);
        System.out.printf("Total sales today: Rp %.2f%n", totalSales);
    }
}
