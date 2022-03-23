package messages;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MessageService {

    private List<Message> messages = new ArrayList<>();

    public List<Message> getMessages() {
        return new ArrayList<>(messages);
    }

    public void readFromFile(Path inputfile) {
        String sender = null;
        LocalTime time = null;
        String messageText = null;

        int rowNumber = 0;
        try (
                BufferedReader br = Files.newBufferedReader(inputfile)) {
            String line;
            while ((line = br.readLine()) != null) {
                switch (rowNumber % 3) {
                    case 0:
                        sender = parseMessageHeaderSender(line);
                        time = parseMessageHeaderTime(line);
                        break;
                    case 1:
                        messageText = parseMessageHeaderSender(line);
                        messages.add(new Message(sender, time, messageText));

                }
                rowNumber++;
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: " + inputfile);
        }
    }

    private String parseMessageHeaderSender(String line) {
        String[] tempStr = line.split(" ");
        return tempStr[0];
    }

    private LocalTime parseMessageHeaderTime(String line) {
        String[] tempStr = line.split(" ");
        return LocalTime.parse(tempStr[1]);
    }

    private String parseMessageLine(String line) {
        return line;
    }

    public boolean isMessagesInOrder() {
        for (int i = 1; i < messages.size(); i++) {
            if (messages.get(i - 1).getTime().isAfter(messages.get(i).getTime())) {
                return false;
            }
        }
        return true;
    }

}
