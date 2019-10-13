public class Main {
    public static void main(String[] args) {
        Ip ip   = new Ip();

        System.out.println(ip.evaluate("192.168.2.5", "192.168.2.0/24"));
    }
}
