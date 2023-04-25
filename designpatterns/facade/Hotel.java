package designpatterns.facade;

public interface Hotel {
    public Menus getMenus();
}

class NVRestaurant implements Hotel{
    public Menus getMenus(){
        NVMenu nv = new NVMenu();
        return nv;
    }
}

class VRestaurant implements Hotel{
    public Menus getMenus(){
        VMenu veg = new VMenu();
        return veg;
    }
}