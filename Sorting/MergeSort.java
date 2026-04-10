
import java.util.*;


public class MergeSort {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        ms(arr,0,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void ms(int[] arr,int low,int high){
        if(low >= high) return;

        int mid= (low+high) / 2;

        ms(arr,low,mid);
        ms(arr,mid+1,high);

        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right = mid+1;
        int temp[]=new int[high-low + 1];
        int index=0;

        //compare and add into temp[]
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index]=arr[left];
                index++;
                left++;
            }
            else{
                temp[index]=arr[right];
                index++;
                right++;
            }
        }
        //add remaining elem in left
        while(left <= mid){
            temp[index]=arr[left];
            index++;
            left++;

        }

        //add remaining elem in right
        while(right <= high){
            temp[index]=arr[right];
            index++;
            right++;
        }

        //temp[] => arr[]
        for(int i=0;i<temp.length;i++){
            arr[i+low]=temp[i];
        }
    }
}
