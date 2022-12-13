import java.util.Scanner;

public class atm {
    public void calis(hesap hesap) {
        giris giris = new giris();

        Scanner scn = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("*****************************");
        System.out.println("Kullanici Girisi...");
        int girisHakki = 3;
        while (true) {
            if (giris.giris(hesap)) {
                System.out.println("Giris Basarili..");
                break;
            } else {
                System.out.println("Giris basarisiz ");
                girisHakki -= 1;
                System.out.println("Kalan giris hakki " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz bitti...");
                return;
            }
        }

        System.out.println("*************************************");
        String islemler = "1. Bakiye Goster\n"
                + "2. Para Yatir\n"
                + "3. Para Cek\n"
                + "Cikis icin q ya basin";
        System.out.println(islemler);
        System.out.println("*************************************");

        while (true) {
            System.out.print("Islem Seciniz :");
            String islem = scn.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println(hesap.getBakiye());
            }else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz tutari giriniz :");
                int tutar = scn.nextInt();
                scn.nextLine();
                hesap.paraYatir(tutar);
            }else if(islem.equals("3")) {
                System.out.print("Cekmek istediginiz tutari giriniz :");
                int tutar = scn.nextInt();
                scn.nextLine();
                hesap.paraCek(tutar);
            }else {
                System.out.println("Hatali tus girdiniz..");
            }

        }

    }
}
