import java.util.*;

public class GCD {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();//9 => 1,3,9
        int n2=obj.nextInt();//12 => 1,2,3,4,6,12 === COMMON = 1,3
        //GCD  = 3
        int gcd=1;
        int min=Math.min(n1,n2);
        for(int i=1;i<=min;i++){ //TC => O(N)
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.print(gcd);

        
    }
}
