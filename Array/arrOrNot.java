import java.util.Scanner;

public class arrOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int j=1;j<n/2;j++){
            if(arr[j-1]<arr[j]){
                count++;
            }
            else if(arr[(n/2)-1]==arr[j-1]){
                count++;
            }
            else{
                count=0;
            }
        }
        System.out.println(count);
    }
}
