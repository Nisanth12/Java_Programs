
import java.util.Scanner;
import java.util.Arrays;
 public class arrDUP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                if(arr[j]==arr[k]){
                    arr1[k]++;
                    count++;
                }
            }
        }
        for (int m=0;m<size;m++){
            if(arr1[m]==0){
                System.out.print(arr[m]+" ");
            }
        }
        System.out.println("\nDuplicate count: "+count);

    }
}