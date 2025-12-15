package Basics;
import java.util.*;
public class sumofeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
      /*for(int i=0;i<=num;i++){                             //for loop
           if(i%2==0){
            sum=sum+i;  
           }//i++;
        }System.out.println(sum); */  


       int i=0;
        while(i<=num){                                  //while loop
           if(i%2==0){
            sum=sum+i;  
           }i++;  
        }System.out.println(sum);
    }
}
