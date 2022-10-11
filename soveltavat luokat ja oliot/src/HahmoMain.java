public class HahmoMain {
    public static void main(String[] args) throws Exception {
        Hahmo h1 = new Hahmo("Pete", 1.1, 21);
    
        System.out.println(h1.getName());
        System.out.println(h1.kerroOlomuoto());

        Hahmo h2 = new Hahmo();
         h2.setName("Sirkku");
         h2.setLength(1.5);
         h2.setWeight(30);

         System.out.println(h2.getName());
         System.out.println(h2.kerroOlomuoto());
    }
}
