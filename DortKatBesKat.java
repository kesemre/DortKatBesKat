import java.util.Scanner;

public class DortKatBesKat {
    public static void main(String[] args) {
        int four = 1, five = 1, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();
        System.out.println("4' ün kuvettleri");
        while (four <= number) {
            System.out.println(four);
            four *= 4;
        }
        System.out.println("5' in kuvvetleri");
        while (five <= number) {
            System.out.println(five);
            five *= 5;
        }
    }
}