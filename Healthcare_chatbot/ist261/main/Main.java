package ist261.main;

import ist261.chatbot.infra.*;

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot("User", "MedBot");
        ChatbotGUI chatbotGUI = new ChatbotGUI(chatbot);
    }
}