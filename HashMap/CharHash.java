import java.util.*;


public class CharHash {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=obj.nextLine();

        System.out.println("Enter Target character: ");
        char ch=obj.next().charAt(0);//b

        // OnlySmall(s,ch);
        // OnlyCaps(s,ch);
        Mixed(s,ch);
        


    }

    public static void OnlySmall(String s, char ch){

        int hash[]=new int[26];

        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.print(hash[ch - 'a']);
    }

    public static void OnlyCaps(String s, char ch){
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'A']++;
        }
        System.out.print(hash[ch-'A']);
    }

    public static void Mixed(String s, char ch){
        int hash[]=new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        System.out.println(hash[ch]);
    }
    
}
