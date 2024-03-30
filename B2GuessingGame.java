import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * A program GuessingGAME that lets the computer generate a secret 
  * number (an integer between 1 and 100, for your friend to guess.
  * @author: B. Yu
  */
  
  public void run() {

    // Generate a secret integer between 1-100
    Random myRandom = new Random();
    int intRandom = myRandom.nextInt(1, 100);      

    // Ask the user to guess the integer
    int intGuess = readInt("Guess the secret integer between 1-100: ");

    // Declare a variable to record the number of attempts
    int intTotalTries = 0;

    // Loop and a half to continually prompt the user for more guesses
    while (true) {
      if (intTotalTries == 4) {
        // If they've guessed incorrectly after 5 attempts, print "Nice Try"
        System.out.println("Nice Try");
        break;
      } else if (intGuess > intRandom) {
        // If they guess too high, print: "too high, guess again."
        intGuess = readInt("Too high, guess again: ");
      } else if (intGuess < intRandom) {
        // If they guess too low, print: "too low, guess again".
        intGuess = readInt("Too low, guess again: ");
      } else {
        // If they guess the number, let the program stop and print "congratulations".
        System.out.println("Congratulations");
        break;
      }
      // Update the intTotalTries to record the number of attempts
      intTotalTries++;
    }
  }
}
