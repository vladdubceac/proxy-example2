package learning.vladdubceac.proxy;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Internet connection = new ProxyInternet();
        try {
        connection.connect("mysite.test");
        connection.connect("restricted.test");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
