package tasks.invoice;

import java.util.Scanner;

public class InvoiceDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Invoice name: \t");
        String invoiceName = scanner.nextLine();

        System.out.print("Monitor price: \t");
        Double monitorPrice = scanner.nextDouble();

        System.out.print("Mouse price: \t");
        Double mousePrice = scanner.nextDouble();

        double totalInvoice = monitorPrice + mousePrice;
        double taxes =  totalInvoice*0.19;

        System.out.println("\n Invoice Name: " + invoiceName +
                "\n Total invoice without taxes: " + totalInvoice +
                "\n Taxes: " + taxes +
                "\n Total invoice with taxes: " + (totalInvoice + taxes)
                );
    }
}
