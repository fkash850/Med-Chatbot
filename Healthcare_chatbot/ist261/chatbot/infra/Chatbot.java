package ist261.chatbot.infra;

import ist261.chatbot.comp.*;
import ist261.user.intent.*;

public class Chatbot {
    private String userName = "User";
    private String botName = "Bot";

    private DialogManager dm;
    private LanguageUnderstander lu;
    private ResponseGenerator rg;

    public Chatbot(String userName, String botName) {
        this.userName = userName;
        this.botName = botName;

        this.dm = new DialogManager(this);
        this.lu = new LanguageUnderstander(this);
        this.rg = new ResponseGenerator(this);
    }

    public String getResponse(String inputText) {
        AbstractUserIntent userIntent = lu.getUserIntent(inputText);
        if (userIntent != null) {
            System.out.println("Current User Intent: " + userIntent.getIntentName());
        }
        else {
            System.out.println("Current User Intent: No intent has been detected");
        }

        String conversationalAction = dm.getConversationalAction(userIntent);
        System.out.println("ConversationalAction: " + conversationalAction);

        String finalResponse = rg.getResponse(userIntent, conversationalAction, inputText);

        if (finalResponse.contains("null")) {
            if (inputText.toLowerCase().contains("hello") || inputText.toLowerCase().contains("hi")) {
                return "Hello " + userName + "!";
            }
            else if (inputText.toLowerCase().contains("your name")) {
                return "My name is " + botName + "!";
            }
            else if (inputText.toLowerCase().contains("how are you")) {
                return "I\'m doing good thank you for asking!";
            }
            else if (inputText.toLowerCase().contains("thank")) {
                return "You\'re welcome!";
            }
            else if (inputText.toLowerCase().contains("bye")) {
                return "Goodbye!";
            }
            else {
                return "Cool!";
            }
        }
        else {
            return finalResponse;
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBotName() {
        return botName;
    }
}