import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.println("Anna ikäsi");
       int age = Integer.parseInt(sc.nextLine());

       String teksti = age <18 ? "Olet alaikäinen" : "Olet aikuinen";

       if( age < 18) {
        System.out.println("Olet nuori");
       }else if( age > 50 ) {
        System.out.println("Olet vanha");
       }else if( age <= 50 && age >= 35) {
        System.out.println("Olet keski-ikäinen");
       }else{
        System.out.println("Normi ikä");
       }
    }
}
