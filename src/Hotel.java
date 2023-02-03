package elitesHotel;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    private String[] rooms;

    private String guest;

    Scanner input = new Scanner(System.in);

    public String displayHotelMenu() {
        return """
                Welcome!!!
                Enter 1 -> for Hotel
                2 -> for bookRoom
                3 -> for getBookedRooms
                4 -> for getRoomGuest
                5 -> for getAllRoomGuests
                6 -> for getAvailableRooms
                7 -> for getRooms
                8 -> for checkOut
                """;
    }

    public Hotel(int roomLength) {
        this.rooms = new String[roomLength];
    }

    public String bookRoom(String user) {
        guest = user;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = user;
                return "Room successfully booked!!!";
            }
        }
        return "Sorry, all rooms are booked.";
    }


//    public String bookRoom(String user){
//        guest = user;
//        for (int i = 0; i < rooms.length; i++){
//            if (rooms[i] == null) {
//                rooms[i] = user;
//                break;
//            }
//        }
//        return "Room successfully booked!!!";
//    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }

    public int getRooms() {
        return rooms.length;
    }

    public int getAvailableRooms() {
        int availableRooms = rooms.length;
        for (String room : rooms) {
            if (room != null) {
                availableRooms -= 1;
            }
        }
        return availableRooms;
    }

    public int getBookedRooms() {
        int bookedRooms = 0;
        for (String room : rooms) {
            if (room != null) {
                bookedRooms += 1;
            }
        }
        return bookedRooms;
    }

    public String getRoomGuest() {
        return guest;
    }

    public String getAllRoomGuests() {
        String allUser = null;
        for (String userInRoom : rooms) {
            if (userInRoom != null) {
                allUser = Arrays.toString(rooms);
            } else {
                break;
            }
        }
        return allUser;
    }


//    public void userSelection(){
//
//        int userInput = input.nextInt();
//        switch (userInput) {
//            case 1:
//                Hotel();
//                break;
//            case 2:
//                bookRoom();
//                break;
//            case 3:
//                getBookedRooms();
//                break;
//            case 4:
//                getAvailableRooms();
//                break;
//            case 5:
//                getRoomGuest();
//                break;
//            case 6:
//                getAllRoomGuests();
//                break;
//            case 7:
//                getRooms();
//            case 8:
//                checkOut();
//            default:
//                System.out.println("Invalid Input!!! Please enter a digit within the range of 1 to 8");
//        }
//    }
//}

    public void userSelection() {
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("");
            case 2:
                System.out.println("Enter guest name: ");
                String guest = input.next();
                System.out.println(bookRoom(guest));
                break;
            case 8:
                System.out.println("Enter room number: ");
                int roomNumber = input.nextInt();
                System.out.println(checkOut(roomNumber));
                break;
            case 3:
                System.out.println(getBookedRooms());
                break;
            case 4:
                System.out.println(getAvailableRooms());
                break;
            case 5:
                System.out.println(getRoomGuest());
                break;
            case 6:
                System.out.println(getAllRoomGuests());
                break;
            case 7:
                System.out.println(getRooms());
                break;
            default:
                System.out.println("Invalid Input!!! Please enter a digit within the range of 1 to 8");
        }
    }
}