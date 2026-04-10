import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 &&  arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
