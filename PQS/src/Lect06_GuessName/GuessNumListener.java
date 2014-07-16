/* File: GuessNumListener.java
 * -------------------------------
 * This interface declare methods, which are used in 
 * GuessNumModel and implemented in GuessNumView.
 */
package Lect06_GuessName;

public interface GuessNumListener {
  void guessTooHigh(int guess);
  void guessTooLow(int guess);
  void guessRight(int guess);
  void gameStarted();
}
