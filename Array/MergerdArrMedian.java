import java.util.*;
public class MergerdArrMedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        array 1:
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        for (int l=0;l<n;l++){
//            System.out.println(arr[l]);
//        }

//        array 2:
        int n1=sc.nextInt();
        int arr2[]=new int[n1];
        for(int j=0;j<n1;j++){
            arr2[j]=sc.nextInt();
        }

        int tot_size=n+n1;
        int res_Arr[]=new int[tot_size];
        System.arraycopy(arr, 0, res_Arr, 0, n);
        System.arraycopy(arr2, 0, res_Arr, n, n1);

//        for (int aa=0;aa<tot_size;aa++){
//            System.out.println(res_Arr[aa]);
//        }


        if(tot_size%2==0){
            int even_div=tot_size/2;
            double med_Add=res_Arr[even_div]+res_Arr[even_div-1];
            double median= med_Add/2;
            System.out.println(median);
        }
        else{
            int odd_div=tot_size/2;
            System.out.println(res_Arr[odd_div]);
        }
    }
}
