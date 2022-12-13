import java.util.Scanner;

public class giris {
    public boolean giris(hesap hesap){
        Scanner scn = new Scanner(System.in);
        String kullaniciAdi ;
        String parola ;

        System.out.print("Kullanici Adi :");
        kullaniciAdi = scn.nextLine() ;
        System.out.print("Parola :");
        parola = scn.nextLine();

       if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola) ){
           return true ;
       }else {
           return false ;
       }
    }
}
