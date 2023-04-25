package designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public interface Internet {
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }
}

class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;
      
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
    }
      
    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
          
        internet.connectTo(serverhost);
    }
  
}