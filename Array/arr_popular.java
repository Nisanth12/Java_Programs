import java.util.*;

public class arr_popular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int count = 0;
        int popular = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // for (int k = 0; k < a; k++) {
        // System.out.print(arr[k]);
        // }
        int temp = 0;
        for (int k = 0; k < a; k++) {
            for (int j = 0; j < a; j++) {
                if (arr[k] == arr[j]) {

                    count++;
                    if (count > temp) {
                        temp = count;
                        popular = arr[j];
                    }

                }

            }
            count = 0;
        }
        // System.out.println(arr[a]);
        System.out.println("Popular Number:" + popular);

    }
}