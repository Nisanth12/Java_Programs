package Array;

import java.util.Arrays;
import java.util.Scanner;

public class rightMostSwapARR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] res=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
//            System.out.println(arr[i]);
        }
        int max=0;
        for(int j=1;j<size;j++){

            max=arr[j];

            for(int k=j+1;k<size;k++){

                if(max<arr[k]){
                    max=arr[k];
                }
                else if(max>arr[k]){
                    max=max;
                }

            }

            System.out.print(max+" ");
            max=0;
            if(j+1==size){
                System.out.print(0);
            }
        }



    }
}
