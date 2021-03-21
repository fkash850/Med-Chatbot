package ist261.chatbot.comp;

import ist261.chatbot.infra.*;
import ist261.user.intent.*;

public class LanguageUnderstander {
    private Chatbot chatbot;
    private AbstractUserIntent userIntent;

    public LanguageUnderstander(Chatbot chatbot) {
        this.chatbot = chatbot;
    }

    public AbstractUserIntent getUserIntent(String inputText) {
        detectUserIntent(inputText);
        return userIntent;
    }

    public void detectUserIntent(String inputText) {
        if (isUserIntent(inputText, "MedInformation")) {
            System.out.println("Detected User Intent: MedInformation");

            if (userIntent != null && userIntent.getIntentName().equals("MedInformation")) {
                userIntent.updateSlotValues(inputText);
            }
            else {
                System.out.println("Updated User Intent: MedInformation");
                userIntent = new MedInformation(inputText);
            }
        }
        else if (isUserIntent(inputText, "MedicalInstruction")) {
            System.out.println("Detected User Intent: MedInstruction");

            if (userIntent != null && userIntent.getIntentName().equals("MedInstruction")) {
                userIntent.updateSlotValues(inputText);
            }
            else {
                System.out.println("Updated User Intent: MedInstruction");
                userIntent = new MedInstruction(inputText);
            }
        }
        else {
			System.out.println("Detected User Intent: Else");

			if (userIntent != null && userIntent.getIntentName().equals("MedInformation")) { // Intent continues
				userIntent.updateSlotValues(inputText);
			}
			else if (userIntent != null && userIntent.getIntentName().equals("MedInstruction")) { // Intent continues
				userIntent.updateSlotValues(inputText);
			}
		}
    }

    private boolean isUserIntent(String inputText, String intentName) {
        if ((inputText.toLowerCase().contains("information") || inputText.toLowerCase().contains("understand") || inputText.toLowerCase().contains("detail") ||
                inputText.toLowerCase().contains("fact") || inputText.toLowerCase().contains("mean") || inputText.toLowerCase().contains("enlighten") ||
                inputText.toLowerCase().contains("what is")) && intentName.toLowerCase().contains("information")) {
            return true;
        }
        else if ((inputText.toLowerCase().contains("instruction") || inputText.toLowerCase().contains("treat") || inputText.toLowerCase().contains("advice") ||
        		inputText.toLowerCase().contains("guide") || inputText.toLowerCase().contains("recommend") || inputText.toLowerCase().contains("suggest"))
        		&& intentName.toLowerCase().contains("instruction")) {
            return true;
        }
        
        if (inputText.contains(intentName)) {
        	return true;
        }

        return false;
    }
}