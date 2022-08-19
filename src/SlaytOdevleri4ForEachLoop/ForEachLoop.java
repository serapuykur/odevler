package SlaytOdevleri4ForEachLoop;

public class ForEachLoop {
    //Soru1=Bir integer array olusturunuz
    // ve bu arraydaki tum sayilarin carpimini For each lopp kullanarak bulunuz .Sonucu ekrana yazdirniz
    public static void main(String[] args) {
        int carpim = 1;
        int[] arr = {1, 2, 3, 4};
        for (int each : arr
        ) {
            carpim *= each;
        }
        System.out.println(carpim);
    }

}