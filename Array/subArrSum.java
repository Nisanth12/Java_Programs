import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class subArrSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int sum=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int countsum=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                countsum+=arr[j];
                if(sum==countsum){
                    System.out.println((i+1)+" "+(j+1));
                    break;
                }
            }
            if(sum==countsum){
                break;
            }



            countsum=0;
        }
        if(sum!=countsum){
            System.out.println(-1);
        }
    }
}
