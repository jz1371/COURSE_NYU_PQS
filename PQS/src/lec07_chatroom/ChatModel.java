package lec07_chatroom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChatModel {

    private List<ChatListener> listeners = 
        new ArrayList<ChatListener>();
    private Set<String> users = 
        new HashSet<String>();

    public ChatModel() {

    }

    public void sendMessage(ChatListener messageSender, String username,
            String message) {
        for (ChatListener listener: listeners) {
            boolean isMe = listener == messageSender;
            listener.messageSent(isMe, username, message);
        }
    }

    public boolean addChatListener(ChatListener listener, String username) {
        if (listener == null) {
            throw new NullPointerException("No nulls!");
        }
        if (!users.add(username)) {
            return false;
        }
        if (listeners.contains(listener)) {
            throw new IllegalStateException(""); 
        }
        listeners.add(listener);
        fireUserJoinedEvent(listener, username);
        return true;
    }
    
//    public Collection<String> getUsernames() {
//      return users;s
//    }

    public void removeChatListener(ChatListener listener, String username) {
        if (listener == null) {
            throw new NullPointerException("No Nulls!");
        }
        listeners.remove(listener);
        users.remove(username);
        fireUserLeftEvent(listener, username);
    }

    private void fireUserJoinedEvent(ChatListener joinedListener, String username) {
        for (ChatListener listener: listeners) {
            boolean isMe = listener == joinedListener;
            listener.userJoined(isMe, username);
        }
    }

    private void fireUserLeftEvent(ChatListener joinedListener, String username) {
        for (ChatListener listener: listeners) {
            boolean isMe = listener == joinedListener;
            listener.userLeft(isMe, username);
        }
    }

}
