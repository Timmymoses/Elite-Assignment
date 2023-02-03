package elitesHotel;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotelBay = new Hotel(10);
        System.out.println(hotelBay.displayHotelMenu());
        hotelBay.userSelection();

        System.out.println("Do you wish to continue? yes/no");
        String userChoice = input.next();

        do {
            if(userChoice.equalsIgnoreCase("yes")){
                System.out.println(hotelBay.displayHotelMenu());
                hotelBay.userSelection();
                System.out.println("Do you wish to continue? yes/no");
                userChoice = input.next();
            }
            else{
                hotelBay.displayHotelMenu();
            }
        }while (userChoice.equalsIgnoreCase("yes"));
    }
}