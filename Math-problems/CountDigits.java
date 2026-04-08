import java.util.*;

class CountDigits{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        //extraction
        int cnt=0;
        while(n!=0){
            cnt++;
            n/=10;
        }
        System.out.print(cnt);
    }
}