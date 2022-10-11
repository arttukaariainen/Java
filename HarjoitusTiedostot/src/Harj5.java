import java.util.Scanner;
import java.io.File;

public class Harj5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Anna polku");
        String path = sc.nextLine();

        sc.close();
        sc = new Scanner(new File(path));

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
}
}