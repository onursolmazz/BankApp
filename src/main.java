public class main {
    public static void main(String []args){

      atm atm = new atm();
      hesap hesap = new hesap("Onur","12345",10000.0);

      atm.calis(hesap);

      System.out.println("Programdan cikiliyor ..");
    }
}
