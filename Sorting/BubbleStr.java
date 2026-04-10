import java.util.*;


public class BubbleStr {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int len=obj.nextInt();

        obj.nextLine();

        String arr[]=new String[len];

        for(int i=0;i<len;i++){
            arr[i]=obj.nextLine();

        }

        for(int i=0;i<len-1;i++){
            
            for(int j=0;j<len-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    //swap
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(String i:arr){
            System.out.println(i);
        }
    }
}
