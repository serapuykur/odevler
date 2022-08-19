package ReplitSorulari;

public class replitArrays2 {
    public static void main(String[] args) {
        int toplam = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
        System.out.println(toplam);
    }
}