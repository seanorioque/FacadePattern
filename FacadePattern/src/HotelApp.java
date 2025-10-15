import java.util.Scanner;
public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService hotelServiceCart = new Cart();
        FrontDesk facadeCart = new FrontDesk(hotelServiceCart);

        HotelService hotelServiceHouseKeeping = new HouseKeeping();
        FrontDesk facadeHouseKeeping = new FrontDesk(hotelServiceHouseKeeping);

        HotelService hotelServiceValet = new Valet();
        FrontDesk facadeValet = new FrontDesk(hotelServiceValet);

        System.out.println("Enter Choice: \n" + "1. Request Cart." +
                "\n2.Request House Keeping." +
                "\n3. Request Valet");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter number of Carts: ");
                int numCarts = sc.nextInt();
                facadeCart.performRequestCart(numCarts);
                break;
            case 2:
                System.out.print("Enter Room number for HouseKeeping: ");
                int numRoom = sc.nextInt();
                facadeHouseKeeping.performClean(numRoom);
                break;
            case 3:
                System.out.print("Enter your Plate Number: ");
                String plateNumber = sc.next();
                facadeValet.performValet(plateNumber);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}