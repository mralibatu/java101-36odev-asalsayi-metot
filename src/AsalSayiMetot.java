import java.util.Scanner;
public class AsalSayiMetot {

    static int asalsayi(int a) {
        if (a < 2) {
            System.out.println("Asal degildir");
        } else {
            for (int i = 2; i <= a; i++){
                if (a == 2 || a % i != 0){
                    System.out.println("Asal sayidir");
                    break;
                }else{
                    System.out.println("Asal degildir");
                    break;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int a = input.nextInt();
        asalsayi(a);
    }
}
