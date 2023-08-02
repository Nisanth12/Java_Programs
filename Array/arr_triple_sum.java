import java.util.Scanner;
import java.util.Arrays;

public class arr_triple_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[N];
        int temp;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr);

        }
        // for (int j = 0; j < N; j++) {
        // // System.out.println(arr[j]);

        // temp = arr[0] + arr[1] + arr[2];
        // if (temp == target) {
        // System.out.print(target);
        // break;
        // } else {
        // temp = arr[0] + arr[2] + arr[N - 1];
        // System.out.print(temp);
        // continue;
        // }

        // if((temp)==target){
        // System.out.println(target);
        // }

        // }
    }
}