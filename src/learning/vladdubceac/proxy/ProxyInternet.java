package learning.vladdubceac.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
    private static List<String> bannedSites =new ArrayList<String>();
    private RealInternet internetConnection;

    static {
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
        bannedSites.add("denied.site");
        bannedSites.add("dark.net");
        bannedSites.add("pirate.bay");
        bannedSites.add("illegal.com");
        bannedSites.add("restricted.test");
    }

    public ProxyInternet(){
    }


    @Override
    public void connect(String host) throws Exception {
        if(bannedSites.contains(host.toLowerCase())){
            throw new Exception("Access denied");
        }else {
            if (internetConnection == null) {
                internetConnection = new RealInternet();
            }
            internetConnection.connect(host);
        }
    }
}
