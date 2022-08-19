package SlaytOdevleri;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        /*kullanicidan bir cumle ve bir kelime isteyin
        kelimenin cumledeki kullanimina bakarak su cumleleri yaziniz
        -girilen kelime cumlede kullanilmamis
        -girilen kelime cumlede bir kere  kullanilmis
        -girilen kelime cumlede birden fazla kullanilmis

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();


        if(cumle.indexOf(kelime)==-1){
            System.out.println("girilen kelime cumlede kullanilmamistir");
        }else if(cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println("girilen kelime cumlede bir kere  kullanilmis");
        }else{
            System.out.println("girilen kelime cumlede birden fazla kullanilmis");
        }
    }


}
