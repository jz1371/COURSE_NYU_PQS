package lec07_chatroom;

public class ChatApp {
  
  public static void main(String[] args) {
    ChatModel model = new ChatModel();
    new ChatView(model);
    new ChatView(model);
    new ChatView(model);
  }
}
