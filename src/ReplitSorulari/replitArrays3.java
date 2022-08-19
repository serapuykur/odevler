package ReplitSorulari;

public class replitArrays3 {
    public static void main(String[] args) {
        int [] arr={20,30,25,35,-16,60,-100};
        int toplam=0;
        double ort=0;
        for(int i=0;i<arr.length;i++){
            toplam+=arr[i];
             ort=toplam/arr.length;
        }
        System.out.println(ort);
    }
}
