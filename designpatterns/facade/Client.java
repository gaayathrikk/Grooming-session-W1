package designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeperImplementation() {
        
        VMenu v = keeper.getVmenu();
        NVMenu nv = keeper.getNVMenu();
        };
    }
}
