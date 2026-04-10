
import java.util.*;
public class SelectionSort{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int len=obj.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<=len - 1;i++){
            arr[i]=obj.nextInt();
        }

        //sorting
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j= i+1;j<len;j++){
                if(arr[j]<arr[min]){
                    min=j; //change minimum

                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            
        }
        System.out.println("Sorted array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }

}