/* File: GuessNumModel.java
 * -------------------------
 * This part serves as "Subject" in Observer Pattern. 
 * It holds registered observers in a list, can add, 
 * delete and notify observers. It has some operation
 * methods as well.
 */

package Lect06_GuessName;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessNumModel {

    private int number;
    private List<GuessNumListener> listeners = 
        new ArrayList<GuessNumListener>();

    public enum CheckStatus {
        LOW, HIGH, JUST_RIGHT;
    }

    public void startGame() {
        number = new Random().nextInt(100);
        fireGameStartEvent();
    }

    public CheckStatus checkGuess(int guess) {
        if (guess < number) {
            fireTooLowEvent(guess);
            return CheckStatus.LOW;
        } else if (guess > number) {
            fireTooHighEvent(guess);
            return CheckStatus.HIGH;
        } else {
            fireRightEvent(guess);
            return CheckStatus.JUST_RIGHT;
        } 
    }

    private void fireGameStartEvent() {
        for (GuessNumListener listener : listeners) {
            listener.gameStarted();
        }
    }

    private void fireTooLowEvent(int guess) {
        for (GuessNumListener listener : listeners) {
            listener.guessTooLow(guess);
        }
    }

    private void fireTooHighEvent(int guess) {
        for (GuessNumListener listener : listeners) {
            listener.guessTooHigh(guess);
        }
    }

    private void fireRightEvent(int guess) {
        for (GuessNumListener listener : listeners) {
            listener.guessRight(guess);
        }
    }

    public void addGuessNumListener(GuessNumListener listener) {
        listeners.add(listener);
    }

    public void removeGuessNumListener(GuessNumListener listener) {
        listeners.remove(listener);
    }
}
