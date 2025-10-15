public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public void performClean(int roomNumber){
        hotelService.cleanRoom(roomNumber);
    }

    public void performValet(String plateNumber){
        hotelService.pickUpVehicle(plateNumber);
    }

    public void performRequestCart(int numberOfCarts)
    {
        hotelService.requestCart(numberOfCarts);
    }



}
