/* File: GuessNumView.java
 * -----------------------
 * This view serves as "Observer" in Observer Pattern, 
 * which implements details of GuessNumListener interface
 * and is responsible for program's UI layout.
 */

package lec07_chatroom;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatView implements ChatListener{
  
  private ChatModel model;
  private String username = "" + this.hashCode();
  private JTextField field = new JTextField();
  private JTextArea textArea = new JTextArea();
  private JButton button = new JButton("Guess");
  
  public ChatView(ChatModel model) {
    this.model  = model;
    
    JFrame frame = new JFrame("GuessNum");
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    
    JPanel bottomPanel = new JPanel();
    bottomPanel.setLayout(new BorderLayout());
    bottomPanel.add(field, BorderLayout.CENTER);
    bottomPanel.add(button, BorderLayout.EAST);
    
    panel.add(bottomPanel, BorderLayout.SOUTH);
    panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
    frame.getContentPane().add(panel);
    frame.setSize(200, 200);
    // CLOSE when frame is close.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        sendMessage();
      }
    });
    
    frame.setVisible(true);
    
    model.addChatListener(this, this.username);
    
  }
  
  
  private void sendMessage() {
    model.sendMessage(this, username, field.getText());
    field.setText("");
  }

  @Override
  public void userJoined(boolean isMe, String name) {
    // TODO Auto-generated method stub
    textArea.append((isMe ? "You" : name) + " joined.\n");
  }

  @Override
  public void userLeft(boolean isMe, String name) {
    // TODO Auto-generated method stub
    textArea.append((isMe ? "You" : name) + " left.\n");
  }

  @Override
  public void messageSent(boolean isMe, String name, String message) {
    // TODO Auto-generated method stub
    textArea.append((isMe ? "You" : name) + ": " + message + ".\n");
    
  }
  
}
