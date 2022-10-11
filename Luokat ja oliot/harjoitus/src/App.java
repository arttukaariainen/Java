public class App {
    public static void main(String[] args) throws Exception {
        /*Player pelaaja = new Player();

        Player pelaaja2 = new Player();

        Player pelaaja3 = new Player();


        pelaaja.name = "John";
        pelaaja.points = 14;

        pelaaja2.name = "Matt";
        pelaaja2.points = 11;

        pelaaja3 = pelaaja2;

        System.out.println("Pelaajan 1 nimi on " + pelaaja.name + " ja pisteet on " + pelaaja.points);
        System.out.println("Pelaajan 2 nimi in " + pelaaja2.name + " ja pisteet on " + pelaaja2.points);
        System.out.println("Pelaajan 3 nimi in " + pelaaja3.name + " ja pisteet on " + pelaaja3.points);
    */

    Player p = new Player();
    p.setName("Matt");

    p.addPoints(10);
    p.addPoints(3);
    p.addPoints(6);

    System.out.println(p.getInfo());

    p.setName("John");

    System.out.println(p.getInfo());

    Player  p2 = new Player("Liisa");
    p2.addPoints(-4);
    System.out.println(p2.getInfo());
    }
}
