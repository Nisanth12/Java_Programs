import java.util.Scanner;

public class arrInversionCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(InverisonCount(N,arr));


    }
    public static int InverisonCount(int size, int array[]){
        int count=0;
        for(int j=0;j<array.length;j++){
            for(int k=j;k<array.length;k++){
                if(array[j]>array[k]){
                    int temp;
                    temp=array[j];
                    array[j]=array[k];
                    array[k]=temp;
                    count++;
                }

            }
        }
        return count;
    }
}
