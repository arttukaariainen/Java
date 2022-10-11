public class Alennus {
    static double alennusProsentti=0;

    public static double alennettuHinta(double hinta){
        return hinta-hinta*alennusProsentti/100;
    }


}
