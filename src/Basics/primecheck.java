package Basics;
import java.util.*;
public class primecheck {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number:");
        int n= sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            if(n==1||n==0){
                System.out.println("1 or 0  neither prime nor composite");
            }else{
                System.out.println("prime number");
            } 
        }else{
            System.out.println("not prime");
        }
    }
}
