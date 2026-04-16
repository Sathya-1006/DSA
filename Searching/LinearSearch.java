package Searching;


import java.util.*;

public class LinearSearch {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int len=obj.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=obj.nextInt();
        }

        boolean flag=false;

        System.out.println("Enter target element: ");
        int t=obj.nextInt();

        for(int i=0;i<len;i++){
            if(t == arr[i]){
                System.out.println("Target found at index: "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
        System.out.println("Target not found!");
        }
        obj.close();
    }
}
