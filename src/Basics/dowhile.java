  /*Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
 */ 
package Basics;
import java.util.*;
public class dowhile {
    public static void main(String args[]){                 
        Scanner sc= new Scanner(System.in);
        int choice;
             do{ 
                System.out.print("Enter student marks:");
                int marks=sc.nextInt();
              if(marks>=90&&marks<=100){
                System.out.println("this is good"); 
               }
               else if(marks>=60&&89>=marks){
                System.out.println("this is also good");
               } 
               else if(marks>=0&&marks<=59){
                System.out.println("this is good as well because marks dont matter but our effort does. ");
               }
               else{
                System.out.println("invalid");
               }
                System.out.print("Do you want continue?? Enter your choice 1(yes)&0(no):");
                 choice=sc.nextInt();
               }while(choice==1);
    }
}
