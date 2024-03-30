class D1GramsToPounds extends ConsoleProgram {

  /**
  * A program that outputs a formatted table that 
  * shows a conversion from grams to pounds from 100 to 1000 grams.
  * @author: B. Yu
  */
  
  public void run() {
    
    // Declare variables
    double dblPounds;

    // output table header
    System.out.printf("%6s %10s %n", "Grams", "Pounds");
    System.out.println("--------------------");

    // Convert grams to pounds in a formatted table chart
    for (int intGrams = 100; intGrams <= 1000; intGrams += 100) {
      dblPounds = intGrams * 0.00220462;
      System.out.printf("%6d %10.4f %n", intGrams, dblPounds);
    }
  }
}
