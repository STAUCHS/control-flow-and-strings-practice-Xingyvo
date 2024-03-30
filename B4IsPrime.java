class B4IsPrime extends ConsoleProgram {

  /**
  * A program that lets you enter an integer, and that will print appropriately "is a
  * prime number" or "is a composite number". A number n is a prime number, if it has no divisors d
  * @author: B. Yu
  */
  
  public void run() {
    
    // Declare variables
    int intNumber;

    // Receive input from user
    intNumber = readInt("Enter an integer: ")

    // Determine if the number is a prime number or is a composite number 
    if (isPrime(intNumber)) {
      System.out.println("It is a prime number");
    } else {
      System.out.println("It is a composite number");
    }
  }
}
