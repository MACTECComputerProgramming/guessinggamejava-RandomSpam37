package chap4challenge;
import java.util.Scanner;
import java.util.Random;
public class Chap4Challenge{

    public static void main(String[] args) {
      Random rndNum = new Random();
      int randomNum = rndNum.nextInt(100);
      int guess = 0;
      boolean correct = false;
      Scanner keyboard = new Scanner(System.in);      
      System.out.print("Give me a Number between 1 and 100: ");
      guess = keyboard.nextInt();                
      while (correct){
          guess = keyboard.nextInt();         
    }
          if (randomNum == guess){          
              System.out.println("You are right!");
          }
           if (guess < randomNum){
              System.out.println("Higher!");  
               guess = keyboard.nextInt();
          }
           if (guess > randomNum){
              System.out.println("Lower!");
              guess = keyboard.nextInt();
           
        }
      }             
    }
    
    
