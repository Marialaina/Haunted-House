import java.util.Scanner;

public class hauntedHouse{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Haunted House!");
        
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        if (age < 5){
         System.out.println("Can't go in!");   
        }
        else if (age < 18){
         System.out.println("Need permission or must need an adult!");
        }
        else if (age > 18){
            System.out.println("Welcome to the house!");
        }
        
        
        
    }
}
