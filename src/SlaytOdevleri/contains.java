package SlaytOdevleri;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {
        //kullanicidan  email adresini girmesini isteyin
        //mail @gmail.com icermiyorsa "Lutfen email yaziniz
        //@gmail ile bitiyorsa "Email adresiniz kaydedildi
        //@gmail.com ile bitmiyorsa "Lutfen yazimi kontrol edin diye yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email=scan.nextLine();

        if(!(email.contains("@gmail"))){
            System.out.println("Lutfen email yaziniz");
        }else if (email.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }
}
