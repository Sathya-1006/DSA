import java.util.*;

public class InsertionKey {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
            
        }
        //13,4,6,7
        for(int i=1;i<n;i++){
            int key=arr[i];// current element = key
            int j= i-1; //prev elem
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j]; //copy
                j--;
            }
            arr[j+1]=key; //shift
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}