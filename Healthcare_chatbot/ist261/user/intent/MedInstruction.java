package ist261.user.intent;

import java.util.*;

public class MedInstruction extends AbstractUserIntent {
    public MedInstruction(String userMsg) {
        super(userMsg);
    }

    @Override
    Hashtable<String, Object> extractSlotValuesFromUserMsg(String userMsg) {
        Hashtable<String, Object> result = new Hashtable<String, Object>();

        if (userMsg.toLowerCase().contains("adhd")) {
            System.out.println(userMsg);
            result.put("illness", "ADHD");
        }
        else if (userMsg.toLowerCase().contains("alzheimer")) {
            System.out.println(userMsg);
            result.put("illness", "Alzheimer's");
        }
        else if (userMsg.toLowerCase().contains("arthritis")) {
            System.out.println(userMsg);
            result.put("illness", "Arthritis");
        }
        else if (userMsg.toLowerCase().contains("asthma")) {
            System.out.println(userMsg);
            result.put("illness", "Asthma");
        }
        else if (userMsg.toLowerCase().contains("cancer")) {
            System.out.println(userMsg);
            result.put("illness", "Cancer");
        }
        else if (userMsg.toLowerCase().contains("chest cold") || userMsg.toLowerCase().contains("acute bronchitis")) {
            System.out.println(userMsg);
            result.put("illness", "Chest Cold");
        }
        else if (userMsg.toLowerCase().contains("chickenpox")) {
            System.out.println(userMsg);
            result.put("illness", "Chickenpox");
        }
        else if (userMsg.toLowerCase().contains("chronic")) {
            System.out.println(userMsg);
            result.put("illness", "Chronic Pain");
        }
        else if (userMsg.toLowerCase().contains("cold")) {
            System.out.println(userMsg);
            result.put("illness", "Cold");
        }
        else if (userMsg.toLowerCase().contains("depression")) {
            System.out.println(userMsg);
            result.put("illness", "Depression");
        }
        else if (userMsg.toLowerCase().contains("diabetes")) {
            System.out.println(userMsg);
            result.put("illness", "Diabetes");
        }
        else if (userMsg.toLowerCase().contains("flu")) {
            System.out.println(userMsg);
            result.put("illness", "Flu");
        }
        else if (userMsg.toLowerCase().contains("blood") && userMsg.toLowerCase().contains("pressure")) {
            System.out.println(userMsg);
            result.put("illness", "High Blood Pressure");
        }
        else if (userMsg.toLowerCase().contains("insomnia")) {
            System.out.println(userMsg);
            result.put("illness", "Insomnia");
        }
        else if (userMsg.toLowerCase().contains("rheumatoid")) {
            System.out.println(userMsg);
            result.put("illness", "Rheumatoid Arthritis");
        }
        else if (userMsg.toLowerCase().contains("sinus")) {
            System.out.println(userMsg);
            result.put("illness", "Sinus Infection");
        }
        else if (userMsg.toLowerCase().contains("sore") && userMsg.toLowerCase().contains("throat")) {
            System.out.println(userMsg);
            result.put("illness", "Sore Throat");
        }

        return result;
    }
}