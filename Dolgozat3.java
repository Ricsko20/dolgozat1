import java.util.Scanner;

public class Dolgozat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adj meg egy egész számot 10 és 90 között!");
        int szam = scanner.nextInt();

        if (szam < 10 || szam > 90) {
            System.out.println("A megadott szám nem helyes");
        }
        else if (szam % 3 == 0 && szam % 5 == 0) {
                System.out.println("FizzBuzz");
            }
        else if (szam % 3 == 0) {
                System.out.println("Fizz");
            }
        else if (szam % 5 == 0) {
                System.out.println("Buzz");
            }
        else if (szam % 3 != 0 && szam % 5 != 0) {
                System.out.println(szam);
            }
        
    }
}
