package Searching;

import java.util.*;

public class BinarySearch {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter target element: ");
        int t=obj.nextInt();

        int res= Binary(arr,n,t);
        if(res == -1){
            System.out.println("Target not found error!");
        }
        else{
            System.out.println("Target found at index: "+res);
        }
        
    }

    public static int Binary(int arr[],int n,int t){
        int left=0;
        int right= n-1;
        
        while(left<=right){
            int mid = (left + right)/2;
            if(t == arr[mid]){
                return mid;
            }
            else if(t<arr[mid]){
                right=mid-1;

            }
            else if(t>arr[mid]){
                left=mid +1;
            }
        }
        return -1;
    }
}
