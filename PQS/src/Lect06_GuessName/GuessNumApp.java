/* File: GuessNumApp.java
 * ----------------------
 */

package Lect06_GuessName;

public class GuessNumApp {
  public static void main(String[] args) {
    GuessNumModel model  = new GuessNumModel();
    
    new GuessNumView(model);
    new GuessNumView(model);
    
    new GuessNumLogger(model);
    model.startGame();
  }
}
