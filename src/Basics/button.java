package Basics;
import java.util.*;
public class button{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice:");
        int button=sc.nextInt();

        //if-else if-else
      /* if(button==1){                                                     
          System.out.println("mango shake");
        }else if(button==2){
          System.out.println("strawberry shake");
        }else if(button==3){
         System.out.println("banana shake");
        }else{
            System.out.println("invalid");
        } */  

            //SWITCH 
        switch (button) {
            case 1: System.out.println("mango shake");
            break;
            case 2:System.out.println("strawberry shake");
            break;
            case 3:System.out.println("banana shake");
            break;    
            default: System.out.println("invalid");
                break;
        }    
    }
}