/* File: GuessNumListener.java
 * -------------------------------
 * This file is the basic interface to be implemented
 * by all kinds of Observers. These declared methods 
 * are used by GuessNumModel and implemented by GuessNumView
 * and GuessNumLogger. 
 */
package edu.nyu.lec06.guessnumber;

public interface GuessNumListener {
  void guessTooHigh(int guess);
  void guessTooLow(int guess);
  void guessRight(int guess);
  void gameStarted();
}
