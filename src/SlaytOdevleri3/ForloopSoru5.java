package SlaytOdevleri3;

import java.util.Scanner;

public class ForloopSoru5 {
    public static void main(String[] args) {
       /* soru5-kullanicidan 100 den kucuk bir tamsayi isteyin 1 `den baslayarak girilen sayiya kadar
       3 un veya 5 in kati olan sayilari yaxdirin

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi yaziniz");
        int tamsayi=scan.nextInt();

        for (int i =1; i <=tamsayi ; i++) {

            if(i%5==0 && i%3==0 ){
                System.out.print(i+" ");
            }else{

            }

        }
    }

}
