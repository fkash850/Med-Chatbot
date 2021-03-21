package ist261.chatbot.comp;

import java.util.*;
import ist261.chatbot.infra.*;
import ist261.user.intent.*;

public class ResponseGenerator {
    private Chatbot chatbot;
    private Random rand = new Random();

    public ResponseGenerator(Chatbot chatbot) {
        this.chatbot = chatbot;
    }

    public String getResponse(AbstractUserIntent userIntent, String conversationalAction, String inputText) {
        if (userIntent != null && userIntent.getIntentName().equals("MedInformation")) {
            if (conversationalAction.equals("answer")) {
            	if (inputText.toLowerCase().contains("adhd") && userIntent.getLatestSlotValues().contains("ADHD")) {
            		return "ADHD stands for Attention-deficit/hyperactivity disorder. It\'s a chronic condition including attention difficulty, "
            				+ "hyperactivity, and impulsiveness. ADHD often begins in childhood and can persist into adulthood. It may contribute "
            				+ "to low self-esteem, troubled relationships, and difficulty at school or work.Symptoms include limited attention and hyperactivity.";
            	}
            	else if (inputText.toLowerCase().contains("alzheimer") && userIntent.getLatestSlotValues().contains("Alzheimer's")) {
            		return "Alzheimer\'s disease is a progressive disease that destroys memory and other important mental functions. Brain cell "
            				+ "connections and the cells themselves degenerate and die, eventually destroying memory and other important mental "
            				+ "functions. Memory loss and confusion are the main symptoms.";
            	}
            	else if (inputText.toLowerCase().contains("arthritis") && userIntent.getLatestSlotValues().contains("Arthritis")) {
            		return "Arthritis is the swelling and tenderness of one or more joints, causing pain and stiffness that can worsen with age. "
							+ "Different types of arthritis exist, each with different causes including wear and tear, infections, and underlying "
							+ "diseases. Symptoms include pain, swelling, reduced range of motion, and stiffness.";
				}
				else if (inputText.toLowerCase().contains("asthma") && userIntent.getLatestSlotValues().contains("Asthma")) {
					return "Asthma is a condition in which a person's airways become inflamed, narrow and swell, and produce extra mucus, which makes it "
							+ "difficult to breathe. Asthma can be minor or it can interfere with daily activities. In some cases, it may lead to a life"
							+ "-threatening attack. Asthma may cause difficulty breathing, chest pain, cough, and wheezing. The symptoms may sometimes flare-up.";
				}
				else if (inputText.toLowerCase().contains("cancer") && userIntent.getLatestSlotValues().contains("Cancer")) {
					return "Cancer is a disease in which abnormal cells divide uncontrollably and destroy body tissue. It is caused by changes to DNA. "
							+ "Most cancer-causing DNA changes occur in the genes. Types of cancer include breast cancer, lung cancer, leukemia, and melanoma. "
							+ "I am currently in the process of researching the other types of cancer.";
				}
				else if ((inputText.toLowerCase().contains("chest cold") || inputText.toLowerCase().contains("acute bronchitis")) && userIntent.getLatestSlotValues().contains("Chest Cold")) {
					return "The chest cold involves inflammation of the lining of bronchial tubes, which carry air to and from the lungs. It\'s often caused by "
							+ "a viral respiratory infection and improves by itself. Symptoms include coughing up thickened mucus and shortness of breath.";
				}
				else if (inputText.toLowerCase().contains("chickenpox") && userIntent.getLatestSlotValues().contains("Chickenpox")) {
					return "Chickenpox is a highly contagious viral infection causing an itchy, blister-like rash on the skin. It\'s highly contagious to "
							+ "those who haven't had the disease or been vaccinated against it. The most characteristic symptom is an itchy, blister-like "
							+ "rash on the skin.";
				}
				else if (inputText.toLowerCase().contains("chronic") && userIntent.getLatestSlotValues().contains("Chronic Pain")) {
					return "Chronic pain is persistent pain that lasts weeks to years. The pain may be caused by inflammation or dysfunctional nerves. The "
							+ "primary symptom is persistent pain that lasts weeks to years.";
				}
				else if (inputText.toLowerCase().contains("cold") && userIntent.getLatestSlotValues().contains("Cold")) {
					return "The common cold is a common viral infection of the nose and throat. It can be caused by many different types of viruses. The "
							+ "condition is usually harmless and symptoms usually resolve within two weeks. Symptoms include a runny nose, sneezing, and "
							+ "congestion. High fever or severe symptoms are reasons to see a doctor, especially in children.";
				}
				else if (inputText.toLowerCase().contains("depression") && userIntent.getLatestSlotValues().contains("Depression")) {
            		return "Depression is a mental health disorder characterized by persistently depressed mood or loss of interest in activities, "
							+ "causing significant impairment in daily life. Possible causes include a combination of biological, psychological, and "
							+ "social sources of distress. Increasingly, research suggests these factors may cause changes in brain function, "
							+ "including altered activity of certain neural circuits in the brain.";
				}
				else if (inputText.toLowerCase().contains("diabetes") && userIntent.getLatestSlotValues().contains("Diabetes")) {
					return "Diabetes is a disease in which your blood glucose, or blood sugar, levels are too high. Glucose comes from the foods you eat. "
							+ "Insulin is a hormone that helps the glucose get into your cells to give them energy. With type 1 diabetes, your body does "
							+ "not make insulin. Type 2 diabetes affects the way your body processes glucose.";
				}
				else if (inputText.toLowerCase().contains("flu") && userIntent.getLatestSlotValues().contains("Flu")) {
					return "The flu is a common viral infection that can be deadly, especially in high-risk groups. The flu attacks the lungs, nose, "
							+ "and throat. Young children, older adults, pregnant women, and people with chronic disease or weak immune systems are at "
							+ "high risk. Symptoms include fever, chills, muscle aches, cough, congestion, runny nose, headaches, and fatigue.";
				}
				else if ((inputText.toLowerCase().contains("blood") || inputText.toLowerCase().contains("pressure")) && userIntent.getLatestSlotValues().contains("High Blood Pressure")) {
					return "High blood pressure is a condition in which the force of the blood against the artery walls is too high. Usually hypertension "
							+ "is defined as blood pressure above 140/90, and is considered severe if the pressure is above 180/120. High blood pressure "
							+ "often has no symptoms. Over time, if untreated, it can cause health conditions, such as heart disease and stroke.";
				}
				else if (inputText.toLowerCase().contains("insomnia") && userIntent.getLatestSlotValues().contains("Insomnia")) {
					return "Insomnia involves persistent problems falling and staying asleep. Most cases of insomnia are related to poor sleep habits, "
							+ "depression, anxiety, lack of exercise, chronic illness, or certain medications. Symptoms may include difficulty falling or "
							+ "staying asleep and not feeling well-rested.";
				}
				else if (inputText.toLowerCase().contains("rheumatoid") && userIntent.getLatestSlotValues().contains("Rheumatoid Arthritis")) {
					return "Rheumatoid arthritis is a chronic inflammatory disorder affecting many joints, including those in the hands and feet. The body's "
							+ "immune system attacks its own tissue, including joints. In severe cases, it attacks internal organs. It also affects joint "
							+ "linings, causing painful swelling. Over long periods of time, the inflammation associated with rheumatoid arthritis can cause "
							+ "bone erosion and joint deformity.";
				}
				else if (inputText.toLowerCase().contains("sinus") && userIntent.getLatestSlotValues().contains("Sinus Infection")) {
					return "Sinusitis is a condition in which the cavities around the nasal passages become inflamed. Acute sinusitis can be triggered by a "
							+ "cold or allergies and may resolve on its own. Chronic sinusitis lasts up to eight weeks and may be caused by an infection or "
							+ "growths. Symptoms include headache, facial pain, runny nose, and nasal congestion.";
				}
				else if (inputText.toLowerCase().contains("sore throat") && userIntent.getLatestSlotValues().contains("Sore Throat")) {
					return "Sore throats involve pain or irritation in the throat that can occur with or without swallowing, often accompanies infections, "
							+ "such as a cold or flu. It can have causes that aren't due to underlying disease. Examples include overuse of voice, a burn "
							+ "from hot food, very dry mouth, or sleeping with the mouth open.";
				}
            	else {
					return "My apologies. I don\'t have information on that illness in my database.";
				}
            }
            else if (conversationalAction.equals("ask-illness")) {
            	int response = 1 + rand.nextInt(3);
            	
            	if (response == 1) {
            		return "What illness would you like to know about?";
            	}
            	else if (response == 2) {
            		return "What is the name of the disease you\'re looking into?";
            	}
            	else {
            		return "What is the sickness want to get information on called?";
            	}
            }
            else {
                return "[Intent = MedInformation, Action = ?]";
            }
        }
        else if (userIntent != null && userIntent.getIntentName().equals("MedInstruction")) {
        	if (conversationalAction.equals("answer")) {
        		if (inputText.toLowerCase().contains("adhd") && userIntent.getLatestSlotValues().contains("ADHD")) {
            		return "ADHD treaments may include medication and talk therapy. Options include stimulants, cognition-enhancing medications, "
            				+ "cognitive behavioral therapy, counseling, and anger management.";
            	}
            	else if (inputText.toLowerCase().contains("alzheimer") && userIntent.getLatestSlotValues().contains("Alzheimer's")) {
            		return "Unfortunately there is no cure for Alzheimer\'s disease, but medications and management strategies may temporarily "
            				+ "improve symptoms. I recommend a cognition-enhancing medication and physical exercise.";
            	}
            	else if (inputText.toLowerCase().contains("arthritis") && userIntent.getLatestSlotValues().contains("Arthritis")) {
					return "Medications, physical therapy, or sometimes surgery helps reduce symptoms and improve quality of life. Some options "
							+ "I recommend are hydrotherapy, stretching, physical exercise, yoga, and joint replacement surgery!";
				}
				else if (inputText.toLowerCase().contains("asthma") && userIntent.getLatestSlotValues().contains("Asthma")) {
					return "Asthma can usually be managed with rescue inhalers to treat symptoms and controller inhalers that prevent symptoms. "
							+ "Severe cases may require longer-acting inhalers that keep the airways open, as well as oral steroids. I strongly "
							+ " advise to never smoke and receive oxygen therapy.";
				}
				else if (inputText.toLowerCase().contains("cancer") && userIntent.getLatestSlotValues().contains("Cancer")) {
					return "Cancer treatments may include surgery, chemotherapy, radiation therapy, bone marrow transplant, immunotherapy, hormone "
							+ "therapy, targeted drug therapy, and cryoablation.";
				}
				else if ((inputText.toLowerCase().contains("chest cold") || inputText.toLowerCase().contains("acute bronchitis")) && userIntent.getLatestSlotValues().contains("Chest Cold")) {
					return "Chest cold treatments usually includes soothing remedies to help with coughing, which may last weeks. Antibiotics are "
							+ "not usually recommended.";
				}
				else if (inputText.toLowerCase().contains("chickenpox") && userIntent.getLatestSlotValues().contains("Chickenpox")) {
					return "Chickenpox can be prevented by a vaccine. Treatment usually involves relieving symptoms although high-risk groups "
							+ "may receive antiviral medications.";
				}
				else if (inputText.toLowerCase().contains("chronic") && userIntent.getLatestSlotValues().contains("Chronic Pain")) {
					return "Depending on the severity, treatments would include medications, acupuncture, electrical stimulation, cognitive behavioral "
							+ "therapy, and surgery. I would recommend options like physical exercise and a nerve pain medication.";
				}
				else if (inputText.toLowerCase().contains("cold") && userIntent.getLatestSlotValues().contains("Cold")) {
					return "Treatment consists of anti-inflammatories and decongestants. Most people recover on their own within two weeks. "
							+ "Over-the-counter products and home remedies can help control symptoms.";
				}
				else if (inputText.toLowerCase().contains("depression") && userIntent.getLatestSlotValues().contains("Depression")) {
					return "The mainstay of treatment is usually medication, talk therapy, or a combination of the two. Increasingly, research "
							+ "suggests these treatments may normalize brain changes associated with depression.";
				}
				else if (inputText.toLowerCase().contains("diabetes") && userIntent.getLatestSlotValues().contains("Diabetes")) {
					return "Controlling blood sugar through diet, oral medications, or insulin is the main treatment. Regular screening for "
							+ "complications is also required.";
				}
				else if (inputText.toLowerCase().contains("flu") && userIntent.getLatestSlotValues().contains("Flu")) {
					return "The flu is treated primarily with rest and fluid to let the body fight the infection on its own. Over-the-counter "
							+ "anti-inflammatory pain relievers may help with symptoms. It\'s always best to get a flu shot once a year.";
				}
				else if ((inputText.toLowerCase().contains("blood") || inputText.toLowerCase().contains("pressure")) && userIntent.getLatestSlotValues().contains("High Blood Pressure")) {
					return "Treatment consists of self care and diuretics. Eating a healthier diet with less salt, exercising regularly, and "
							+ "taking medications can help lower blood pressure. I strongly suggest physical exercise and stress management.";
				}
				else if (inputText.toLowerCase().contains("insomnia") && userIntent.getLatestSlotValues().contains("Insomnia")) {
					return "Treatment for insomnia consists of improving sleep habits, behavior therapy, and identifying and treating underlying "
							+ "causes. Sleeping pills may also be used, but should be monitored for side effects.";
				}
				else if (inputText.toLowerCase().contains("rheumatoid") && userIntent.getLatestSlotValues().contains("Rheumatoid Arthritis")) {
					return "While there's no cure for rheumatoid arthritis, physiotherapy and medication can help slow the disease's progression. "
							+ "Most cases can be managed with a class of medications called anti-rheumatic drugs (DMARDS). It would be really nice "
							+ "to use a heating pad and also do physical therapy.";
				}
				else if (inputText.toLowerCase().contains("sinus") && userIntent.getLatestSlotValues().contains("Sinus Infection")) {
					return "Acute sinusitis usually doesn't require any treatment beyond symptomatic relief with pain medications, nasal "
							+ "decongestants, and nasal saline rinses. Chronic sinusitis may require antibiotics.";
				}
				else if (inputText.toLowerCase().contains("sore throat") && userIntent.getLatestSlotValues().contains("Sore Throat")) {
					return "Drinking plenty of liquids, gargling with warm salt water, and if over 4 years old, sucking on lozenges may ease a "
							+ "sore throat. Taking an over-the-counter pain medication such as ibuprofen, naproxen or acetaminophen may also help.";
				}
        		else {
					return "My apologies. I don\'t have information on that illness in my database.";
				}
        	}
        	else if (conversationalAction.equals("ask-illness")) {
        		int response = 1 + rand.nextInt(2);
        		
        		if (response == 1) {
        			return "You will need to specify the name of the sickness you wish to get help on.";
        		}
        		else {
        			return "Which illness do you need help learning how to treat?";
        		}
        	}
        	else {
        		return "[Intent = MedInstruction, Action = ?]";
        	}
        }
        else {
            return "null";
        }
    }
}