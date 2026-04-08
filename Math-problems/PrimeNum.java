import java.util.*;


public class PrimeNum {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int cnt=0;
        for(int i=1;i<=n;i++){ //TC = O(N)
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 2){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not a Prime");
        }
    }
}
