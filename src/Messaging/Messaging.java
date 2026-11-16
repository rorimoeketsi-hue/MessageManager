package registrationloginapp;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import registrationloginapp.RegistrationLoginApp;

import java.util.Scanner;
import java.util.Scanner;
    private static int totalMessagesSent;

    private String recipient;
    private String messageText;
    private String messageHash;
    private final String messageID;
    private final int messageNumber;
    private int n;
    private String MessageId;
    private String MessageHash;
    private CharSequence[] storedMessages;

    private static class scan {

        private static int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public scan() {
        }
    }

    private static class storedMessages {

        public storedMessages() {
        }
    }
/**
 *
 * @author Student
 */

public class Messaging {
    
    
      private String messageID;
       private int messageNumber;
       private String recipient;
       private String messageText;
       private String messageHash;
       
       //Shared across all messages
       private static int totalMessagesSent = 0;
       private static ArrayList<String> storedMessage = new ArrayList<>();
       
    
    public static void main(String[] args){
        int choice ;
        
        System.out.println("Welcome to QuickChat");
        do{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Option 1: ");
        System.out.println("Option 2: ");
        System.out.println("Option 3: ");
        System.out.println("Enter ");
        choice = scanner.nextInt();
        
       
    if (choice ==1){
        System.out.println("SendMessage");
    }   
      else if(choice ==2){
        System.out.println("Coming Soon");
    }
            else if(choice ==3){
               System.out.println("Quit"); 
            }          

            else{
               System.out.println("error: incorrect value"); 
            }
        }
    while(choice!=3);
}


   public static void message(){
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       Random ran = new Random();
       int recipientNo = scanner.nextInt();
       
       RegistrationLoginApp key = new RegistrationLoginApp();
       if (key.CheckCellPhoneNumber(recipientNo)){
           
       }else
           System.out.println("");
       recipientNo = scan.nextInt();
    }
     for (int i = 0; i < n; i++){
      int messageID = ran.nextInt();
         // Constructor: generates the ID and Hah automatically
       public Messaging(int messageNumber, String recipient, String messageText) {
           this.messageNumber = messageNumber;
           this.recipient = recipient;
           this.messageText = messageText;
           this.messageID = generateMessageID();
           this.messageHash = createMessageHash();
           
       }
       public String getMessageID(){
    String messageID = null;
           return messageID;
       }
       public int getMessageNumber(){ 
    int messageNumber = 0;
           return messageNumber;
       }
       public String getRecipient(){
           return recipient;
       }
       
       public String getMessageText(){
           return messageText;
       }
       
       public String getMessageHash(){
           return messageHash;
       }

   // Must start with + (international code) and contain digits only, max 10 digits the code
   public static boolean checkRecipientCell(String number){
       return number.matches("^\\+\\d(2,13) $");
   }
   
// Message must not exceed 250 characters
   public static boolean checkMessageLength(String text){
       return text.length() <= 250;
   }
   // ------------- Generating -----------
   // Random ten-digit number
   private String generateMessageID(){
       Random ran = new Random();
       StringBuilder ID = new StringBuilder();
       
       // first digit 1-9 so the ID is always ten digit long
       ID.append(ran.nextInt(9) +1);
       
      // Add 9 more random digits (0-9) using a do-while loop
      int digitsAdded = 0;
      do{
          ID.append(ran.nextInt(10));
          digitsAdded++;
      } while (digitsAdded < 9);
      
      return ID.toString();
   }
   
// Format: Firsttwo digits of ID : message number : FIRSTLAST (e.g. 00:0:HITTHANKS)
   public final String createMessageHash(){
       String[] words = messageText.trim().split("\\s+");
       String first = words[0];
       String last = words[words.length - 1];
       return (messageID.substring(0, 2) + ":" + messageNumber + ":" + first + last).toUpperCase();
   }
   
   public String sendMessage(){
        int totalMessageSent = 0;
       totalMessageSent++;
       return "Message successfully sent";
       
} 
   public String disregardMessage(){
       return "Press 0 to delete the message"; 
       
} 
public String storedMessages(){
            try (FileWriter writer = new FileWriter("message.json")){
                writer.write("[\n" + String.join(",\n", storedMessages) + "\n]");
            }catch(IOException e){
                return "Could not save to file: " + e.getMessage();
            }
        

// --------Display--------
// Message ID, Message Hash, Recioient, Message (in that order)
    public String printMessage(){
    return "Message ID:    " + MessageId + "\n"
            + "Message Hash:  " + MessageHash + "\n"
            + "Recipient:    " + recipient + "\n"
            + "Message:    " + messageText;
    }

public static int returnTotalMessages(){
    return totalMessagesSent;
}





}
