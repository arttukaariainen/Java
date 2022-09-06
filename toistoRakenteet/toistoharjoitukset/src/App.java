
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    
    int sijoitus = 4;
    
    switch (sijoitus) {
        case 1:
            System.out.println("Numero 1");
            break;
        case 2:
            System.out.println("Numero 2");
            break;
        default:
            System.out.println("Sijoitus joku muu");
            break;
    }


    /*for (int i = 0; i < 10; i++) {
            
    }

    System.out.println("Nyt loppui");
    */

    /*teht. 1
    int i = 0;

    while(i<3){
        System.out.println("Tervetuloa");
        i++;
    }*/

    /*teht. 2
    int i = 1;

    while(i<4){
        System.out.println(i);
        i++;
    }*/

    /*teht. 3
    int i = 1;

    while(i<10){
        System.out.println((i++) + "*5");
    }*/

    /*teht. 4
    int i = 0;

    while(i<21){
        System.out.println(i);
        i+=2;
    }*/

    /*teht. 5 
    Scanner sc = new Scanner(System.in);
    int luku = 1;

    while(luku !=0){
        System.out.println("Anna luku");
        luku = Integer.parseInt(sc.nextLine());
    }*/

    /*teht.6
    Scanner sc = new Scanner(System.in);

    int luku = 0;
    int summa = 0;

    while( luku++ <5){
        System.out.println("Anna 5 lukua");
        summa += Integer.parseInt(sc.nextLine());
    }
    System.out.println(summa);
    sc.close();*/

    /*teht. 7
    Scanner sc = new Scanner(System.in);

    int luku = 0;

    while(luku < 1 || luku  >10){
        System.out.println("Anna numero");
        luku = Integer.parseInt(sc.nextLine());
    }*/

    

}
}
