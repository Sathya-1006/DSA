import java.util.*;


public class BubbleSort {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int len=obj.nextInt();

        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=obj.nextInt();
        }

        for(int i=0;i<len-1;i++){
            //to move largest element to end, to leave the sorted part
            for(int j=0;j<len-1-i;j++){
            
                if(arr[j] > arr[j+1]){ //comparing adjacent elem
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }
}
