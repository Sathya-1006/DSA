

import java.util.Scanner;

public class Hash {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("Enter number to check: ");
        int num=obj.nextInt();

        //WithoutHash(arr,n,num);
        WithHash(arr,n,num);

        obj.close();
        
    }

    public static void WithoutHash(int[] arr,int n,int num){
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                cnt++;
            }
        }
        System.out.println(num+" occurs "+cnt+" times");
        //TC => O(theta * N) => theta => unknown
    }

    public static void WithHash(int[] arr, int n, int num){
        int[] hash=new int[n];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1 ;
        }
        System.out.println(num+" occurs "+hash[num]+" times");

    
        //TC => O(N)
    }
}