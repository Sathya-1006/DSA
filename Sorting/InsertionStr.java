import java.util.*;

public class InsertionStr {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextLine();

        }

        for(int i=0;i<=n-1;i++){
            int j=i;
            while((j>0) && arr[j-1].compareTo(arr[j])>0){
                String temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;

            }
        }
        for(String i:arr){
            System.out.print(i+" ");
        }


    }
}
