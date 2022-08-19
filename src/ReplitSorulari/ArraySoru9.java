package ReplitSorulari;

public class ArraySoru9 {
    public static void main(String[] args) {
       /* Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

                Array: [1,2,3,4,5,6,7,8,9]

        Beklenen Çıktı:
        Tek Sayilar: 5
        Cift Sayilar: 4

        */


        int []arr={1,2,3,4,5,6,7,8,9};
        int tekSayisayaci=0;
        int ciftsayiSayaci=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                ciftsayiSayaci++;
            }else{
                tekSayisayaci++;
            }

        }
        System.out.println(tekSayisayaci);
        System.out.println(ciftsayiSayaci);
    }
}
