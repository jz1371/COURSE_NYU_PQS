/* File: GuessNumLogger.java
 * -----------------------------
 * This file serves as "Observer" in Observer Pattern, which
 * implements GuessNumListener interface and display in console.
 */
package lec06_guessnumber;


public class GuessNumLogger implements GuessNumListener {
  
  //	private GuessNumModel model;
  
  public GuessNumLogger(GuessNumModel model) {
    model.addGuessNumListener(this);
  }
  
  @Override
  public void guessTooHigh(int guess) {
    // TODO Auto-generated method stub
    System.out.println("Guess too high " + guess);
  }
  
  @Override
  public void guessTooLow(int guess) {
    // TODO Auto-generated method stub
    System.out.println("Guess too low " + guess);
  }
  
  @Override
  public void guessRight(int guess) {
    // TODO Auto-generated method stub
    System.out.println("Correct " + guess);
    
  }
  
  @Override
  public void gameStarted() {
    // TODO Auto-generated method stub
    System.out.println("Game started.");
  }
  
}
