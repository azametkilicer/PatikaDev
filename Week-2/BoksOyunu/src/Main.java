public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 50 , 100, 100, 80);
        Fighter alex = new Fighter("Alex" , 50 , 100, 100, 80);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
