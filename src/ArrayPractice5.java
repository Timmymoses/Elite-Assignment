package Chapter7;

public class ArrayPractice5 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 3, 5, 1};
        int[] products = new int[numbers.length];

        // Multiply each number by itself
        for (int i = 0; i < numbers.length; i++) {
            products[i] = numbers[i] * numbers[i];
        }

// Sort the results in ascending order
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i] > products[j]) {
                    int temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order after multiplication:");
        for (int i : products) {
            System.out.print(i + " ");
        }

// Sort the results in descending order
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i] < products[j]) {
                    int temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }

        System.out.println("\nDescending Order after multiplication:");
        for (int i : products) {
            System.out.print(i + " ");
        }
    }
}