import java.util.Scanner;

public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a kör sugarát!");
        int r = scanner.nextInt();
        double terulet = r*r*Math.PI;

        System.out.println("A kör területe: " + Math.round(terulet) + "\nA kör kerekített területe: " + Math.round(terulet));
    }
}
