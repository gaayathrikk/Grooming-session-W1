package designpatterns.facade;

public interface HotelKeeper {
    public NVMenu getNVMenu;
    public Vmenu getVmenu;
}

class HotelKeeperImplementation implements HotelKeeper {
 
    public VMenu getVMenu(){
        VRestaurant v = new VRestaurant();
        VMenu vegMenu = (VMenu)v.getVMenu();
        return vegMenu;
    }
 
    public NVMenu getNVMenu(){
        NVRestaurant v = new NVRestaurant();
        NVMenu NonvegMenu = (NVMenu)v.getNVMenu();
        return NonvegMenu;
    }
}