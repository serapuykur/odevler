package SlaytOdevleri;

import java.util.Scanner;

public class stringSorulari {
    public static void main(String[] args) {
    //kullanicidan bir cumle ve bir harf isteyin
        // harfin cumlede var olup olmadigini yazdirin isteyin ve harfin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle =scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        System.out.println(cumle.indexOf(harf));

    }


}
