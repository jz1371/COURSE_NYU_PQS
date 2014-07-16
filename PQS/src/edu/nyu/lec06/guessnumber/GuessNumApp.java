/* File: GuessNumApp.java
 * ----------------------
 */

package edu.nyu.lec06.guessnumber;

public class GuessNumApp {
  
  public static void main(String[] args) {
    
    GuessNumModel model  = new GuessNumModel();
    
    // add two observers.
    new GuessNumView(model);
    new GuessNumView(model);
    
    // add a console observer.
    new GuessNumLogger(model);
    model.startGame();
  }
}
