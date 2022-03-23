package messages;

import java.time.LocalTime;

public class Message {

    private String sender;
    private LocalTime time;
    private String messageText;

    public Message(String sender, LocalTime time, String message) {
        this.sender = sender;
        this.time = time;
        this.messageText = message;
    }

    public String getSender() {
        return sender;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getMessageText() {
        return messageText;
    }
}
