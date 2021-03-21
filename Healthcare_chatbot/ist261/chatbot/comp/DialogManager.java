package ist261.chatbot.comp;

import ist261.chatbot.infra.*;
import ist261.user.intent.*;

public class DialogManager {
    private Chatbot chatbot;

    public DialogManager(Chatbot chatbot) {
        this.chatbot = chatbot;
    }

    public String getConversationalAction(AbstractUserIntent userIntent) {
        if (userIntent == null) {   // No user intent detected yet
            return "ask-intent";
        }
        else {
            if (userIntent.getLastestSlotValue("illness") != null) {
                return "answer";
            }
            else {
                return "ask-illness";
            }
        }
    }
}