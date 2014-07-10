/* File: GuessNumListener.java
 * -------------------------------
 */
package Lect06_GuessName;

public interface GuessNumListener {
    void guessTooHigh(int guess);
    void guessTooLow(int guess);
    void guessRight(int guess);
    void gameStarted();
}
