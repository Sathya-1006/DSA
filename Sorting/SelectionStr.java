import java.util.*;

public class SelectionStr {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int len=obj.nextInt();
        obj.nextLine();

        String arr[]=new String[len];
        for(int i=0;i<len;i++){
            arr[i]=obj.nextLine();
        }

        //sorting
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(arr[j].compareToIgnoreCase(arr[min]) < 0){
                    min =j;
                }
            }
            //arr[j].compareToIgnoreCase(arr[min]) < 0  => Ascending order
            //arr[j].compareToIgnoreCase(arr[min]) > 0  => Descending order

            //swap
            String temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        for(String i:arr){
            System.out.print(i+" ");
        }

        
    }
}
