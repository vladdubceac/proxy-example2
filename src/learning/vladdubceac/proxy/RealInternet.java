package learning.vladdubceac.proxy;

public class RealInternet implements Internet {

    public RealInternet(){
    }

    @Override
    public void connect(String host) throws Exception {
        System.out.println("Connecting to "+host);
    }
}
