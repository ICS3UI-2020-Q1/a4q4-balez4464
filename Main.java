import java.util.Scanner;

/**
 *This program asks user for their number and give them their fizz buzz seqeunce
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user for a number
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");

    //users number
    int usersNumber = input.nextInt();
    //number for seqeunce
    int countUp = 1;

    //while loop for fizzbuzz seqeunce
    while(countUp <= usersNumber){
      if(countUp %3 == 0 && countUp %5 == 0){
        System.out.println("FizzBuzz");
      }else if(countUp %3 == 0){
        System.out.println("Fizz");
      } else if(countUp %5 == 0){
        System.out.println("Buzz"); 
      } else{
        System.out.println(countUp);
      }
      countUp = countUp + 1;
    }

      

    
  }  
  
}
