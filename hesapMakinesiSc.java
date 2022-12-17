import java.util.Scanner;

public class hesapMakinesiSc {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz :");
        n1 = inp.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        n2 = inp.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("seçiminiz : ");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("bölme : " + (n1 / n2));
                }
                System.out.println("bölme : " + (n1 / n2));
                break;
            default:
                System.out.println("yanlış bir seçim yaptınız.Tekrar deneyiniz.");


        }
    }
}
