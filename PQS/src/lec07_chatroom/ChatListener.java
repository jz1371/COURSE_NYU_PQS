package lec07_chatroom;

public interface ChatListener {
  
  /* Instead of 
   *    void join(ChatListener listener, String name);
   * using the following pattern.
   */
  void userJoined(boolean isMe, String name);
  void userLeft(boolean isMe, String name);
  void messageSent(boolean isMe, String name, String message);
  
}
