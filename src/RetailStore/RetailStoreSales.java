package RetailStore;

import java.util.Scanner;
public class RetailStoreSales {
    public void calculateSales(){
        Scanner input = new Scanner(System.in);

        double product1 = 0;
        double product2 = 0;
        double product3 = 0;
        double product4 = 0;
        double product5 = 0;

        int productId = 1;

        while (productId != 6){
            System.out.print("Enter product number (1-5) (6 to stop): ");
            productId = input.nextInt();

            if (productId >=1 && productId <=5){
                System.out.print("Enter quantity sold: ");
                int quantity = input.nextInt();

                switch (productId) {
                    case 1 -> product1 += quantity * 2.98;
                    case 2 -> product2 += quantity * 4.50;
                    case 3 -> product3 += quantity * 9.98;
                    case 4 -> product4 += quantity * 4.49;
                    case 5 -> product5 += quantity * 6.87;
                }
            }
            else if (productId != 6)
                System.out.println("product number must be between 1 to 5 or 0 to stop");
        }

        System.out.println();
        System.out.printf("Product 1: $%.2f\n", product1);
        System.out.printf("Product 2: $%.2f\n", product2);
        System.out.printf("Product 3: $%.2f\n", product3);
        System.out.printf("Product 4: $%.2f\n", product4);
        System.out.printf("Product 5: $%.2f\n", product5);
    }
}