package ist261.chatbot.infra;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class ChatbotGUI extends JFrame {
    private Chatbot chatbot;
    private JFrame frame;
    private JTextPane chatPane;
    private JTextField inputTextBox;
    private JButton nameButton;
    private JButton resetButton;

    public ChatbotGUI(Chatbot chatbot) {
        this.chatbot = chatbot;

        // Create the frame of the chatbot
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(600, 575);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setTitle("MedBot");

        // Create chat pane for the user and chatbot
        chatPane = new JTextPane();
        frame.add(chatPane);
        chatPane.setSize(500, 400);
        chatPane.setLocation(42, 10);
        
        // Create input textbox
        inputTextBox = new JTextField();
        frame.add(inputTextBox);
        inputTextBox.setSize(540, 30);
        inputTextBox.setLocation(21, 420);
        inputTextBox.setText("Insert text here");
        inputTextBox.setEditable(true);
        inputTextBox.addActionListener(new InputTextListener(this, inputTextBox, chatPane));
        
        nameButton = new JButton("Change name");
        frame.add(nameButton);
        nameButton.setBounds(160, 475, 130, 40);
        nameButton.addActionListener(new NameButtonListener(chatbot, chatPane, inputTextBox));

        resetButton = new JButton("Reset");
        frame.add(resetButton);
        resetButton.setBounds(300, 475, 130, 40);
        resetButton.addActionListener(new ResetButtonListener(chatPane));
    }

    public ChatbotGUI() {
    }

    public Chatbot getChatbot() {
        return chatbot;
    }

    public static void appendToPane(JTextPane chatPane, String senderName, String text, Color color) {
        String message = senderName + ": " + text + "\n";
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.FontSize, 16);
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = chatPane.getDocument().getLength();
        chatPane.setCaretPosition(len);
        chatPane.setCharacterAttributes(aset, false);
        chatPane.replaceSelection(message);
    }
}

class NameButtonListener implements ActionListener {
    private Chatbot chatbot;
    private JTextPane chatPane;
    private JTextField inputTextBox;

    public NameButtonListener(Chatbot chatbot, JTextPane chatPane, JTextField inputTextBox) {
        this.chatbot = chatbot;
        this.chatPane = chatPane;
        this.inputTextBox = inputTextBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inputTextBox.getText().equals("") || inputTextBox.getText().equals("Insert text here")) {
            ChatbotGUI.appendToPane(chatPane, "Name Change", "Unable to change name for user", Color.BLUE);
        }
        else {
            chatbot.setUserName(inputTextBox.getText());
            ChatbotGUI.appendToPane(chatPane, "Name Change", "Successfully changed user name to: " + chatbot.getUserName(), Color.BLUE);
        }

        inputTextBox.setText("");
    }
}

class ResetButtonListener implements ActionListener {
    private JTextPane chatPane;

    public ResetButtonListener(JTextPane chatPane) {
        this.chatPane = chatPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        chatPane.setText("");
    }
}

class InputTextListener implements ActionListener {
    private ChatbotGUI chatbotGUI;
    private JTextField inputTextBox;
    private JTextPane chatPane;

    public InputTextListener(ChatbotGUI chatbotGUI, JTextField inputTextBox, JTextPane chatPane) {
        this.chatbotGUI = chatbotGUI;
        this.inputTextBox = inputTextBox;
        this.chatPane = chatPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = inputTextBox.getText();
        ChatbotGUI.appendToPane(chatPane, chatbotGUI.getChatbot().getUserName(), inputText, Color.BLACK);

        String chatbotResponse = chatbotGUI.getChatbot().getResponse(inputText);
        ChatbotGUI.appendToPane(chatPane, chatbotGUI.getChatbot().getBotName(), chatbotResponse, Color.RED);

        inputTextBox.setText("");
    }
}