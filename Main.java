import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = keyboard.nextInt();
        int toplam = 0;

for (int i = 0; i < sayi; i++) {
    toplam +=i;

}
        System.out.println("Girilen sayıya kadar olan pozitif tam sayıların toplamı:"+toplam);
    }
}