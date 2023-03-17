import java.util.*;

class assignment__1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t=n;
        int r,sum=0;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(t==sum){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}