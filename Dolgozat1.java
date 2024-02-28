import java.util.Scanner;

public class Dolgozat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved!");
        String nev = scanner.nextLine();
        System.out.println("Hello " + nev + "!");
    }
}
