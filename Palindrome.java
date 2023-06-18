import java.util.Scanner;
class Solution {
    static boolean isPalindrome(int x) {
        int rev=0, t=x;
        while(x>0)
        {
            rev = rev*10 +x%10;
            x =x/10;
        }
        return t==rev;
        
    }
    public static void main(String args[]){
       // System.out.println("Enter the number:");
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     if(isPalindrome(x))
     {
         System.out.println("true");
     }
     else{
         System.out.println("false");
     }

    }
}