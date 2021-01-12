package hotelbooking;

import java.util.Scanner;

public class HotelBooking {

    static Scanner scan = new Scanner(System.in);
    static double price = 0;
    static double priceND = 0;
    static int days = 0;
    

    public static void main(String[] args) {

        System.out.println("What room would you like:\n1-Single \n2-Double \n3-Family");
        int roomType = scan.nextInt();
        switch (roomType) {
            case 1:
                singleRoom();
                break;
            case 2:
                doubleRoom();
                break;
            case 3:
                familyRoom();
                break;
            default:
                System.out.println("This is not a valid input!");
                break;
        }
        board();
        System.out.println("Your price before discount is: £" + priceND);
        System.out.println("Your price after discount is: £" + price);
    }

    public static void singleRoom() {
        System.out.print("How many days would you like to stay: ");
        days = scan.nextInt();
        priceND = price + (50*days);
        if(days > 7){
            price = price + (50*7) + ((days-7)*(50*0.8));
        }else{
            price = price + (50*days);
        }
        
    }

    public static void doubleRoom() {
        System.out.print("How many days would you like to stay: ");
        days = scan.nextInt();
        priceND = price + (75*days);
        if(days > 7){
            price = price + (75*7) + ((days-7)*(75*0.8));
        }else{
            price = price + (75*days);
        }
    }

    public static void familyRoom() {
        System.out.print("How many days would you like to stay: ");
        days = scan.nextInt();
        priceND = price + (75*days);
        if(days > 7){
            price = price + (105*7) + ((days-7)*(105*0.8));
        }else{
            price = price + (105*days);
        }
    }
    
    public static void board(){
        System.out.println("What type of board would you like:\n1- Self-Catering \n2- Half-Board \n3- Full-Board");
        int board = scan.nextInt();
        switch(board){
            case 1:
                break;
            case 2:
                priceND = priceND + (10*days);
                price = price + (10*days);
                break;
            case 3:
                priceND = priceND + (20*days);
                price = price + (20*days);
                break;
            default:
                System.out.println("Incorrect choice");
                break;
        }
    }

}
