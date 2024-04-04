import java.util.*;
public class Task{
    public static void guessingNumber(){
        Scanner sc= new Scanner(System.in);
        int number=1+(int)(100*Math.random());
        int k=6;
        int i,guess;
        System.out.println("Guess the Number from 1 to 100: ");
        for(i=0;i<k;++i){
            System.out.print("Guess the number: ");
            guess=sc.nextInt();

            if(number==guess){
                System.out.print("Good Job!!YOU GUESSED THE RIGHT NUMBER");
                break;
            }else if(number>guess && i!=k-1){
                System.out.println("The number is Greater than: "+guess+" "+"Try Again!");}
                else if(number<guess && i!=k-1){
                System.out.println("The number is less than "+guess+" "+"Try Again!");
            }
        }
        if(i==k){
            System.out.println("You have Reached Maximum number of Try's!");
            System.out.println("Sorry,but the number was:"+number);
        
        }}    
    public static void main(String[]args){
        guessingNumber();      
    }
}