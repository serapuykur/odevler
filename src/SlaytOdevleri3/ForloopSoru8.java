package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru8 {
    public static void main(String[] args) {
        //Kullanicidan bir string   isteyin ve stringi tersine yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir strin giriniz");
        String str=scan.nextLine();
        String tersstr=str.substring(str.length()-1);

        for (int i =str.length()-2; i >=0 ; i--) {
            tersstr+=str.substring(i,i+1);

        }
        System.out.println(tersstr);
    }
}
