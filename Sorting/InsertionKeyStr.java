import java.util.*;


public class InsertionKeyStr {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        obj.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextLine();
        }

        for(int i =1;i<n;i++){
            String key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareToIgnoreCase(key)>0){
                arr[j+1]=arr[j];
                j--;
            }
            //shift
            arr[j+1]=key;
        }
        System.out.println("Sorted array: ");
        for(String i:arr){
            System.out.println(i);
        }
    }
}
