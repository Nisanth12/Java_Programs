import java.util.*;
public class arrMedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            int even_div=n/2;
            double med_Add=arr[even_div]+arr[even_div-1];
            double median= med_Add/2;
            System.out.println(median);
        }
        else{
            int odd_div=n/2;
            System.out.println(arr[odd_div]);
        }
    }
}
