import java.lang.*;
import java.util.*;


// An Amrstrong number is a number that is equal to the sum of its own digits 
// each raised to the power of the number of digits.

// Example 1:
// Input:N = 153
// Output:True
// Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
                                        
// Example 2:
// Input:N = 371                
// Output: True
// Explanation: 3^3+7^3+1^3 = 27 + 343 + 1 = 371

 //Example 3:
// Input:N = 12              
// Output: False
// Explanation: 1^2 + 2^2 = 2+4 = 6 

public class ArmStrong
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		int cnt=0;
		int temp = n;
		while(n!=0){
		    //no.of digits
		    cnt++;
		    n/=10;
		    
		}
		n=temp;
		int sum=0;
		//extraction + power calc
		while(n!=0){
		    int last= n%10;
		    int pow = (int) Math.pow(last,cnt);
		    sum += pow;
		    n/=10;
		    
		}
		if(sum == temp){
		    System.out.println("Armstrong number");
		    
		}
		else{
		     System.out.println("Not an Armstrong number");
		}
	}
}