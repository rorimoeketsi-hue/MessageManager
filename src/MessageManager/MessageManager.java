/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MessageManager;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MessageManager{
    
    //Required Arrays/ ArrayList (No hard-coding)
    private static final ArrayList<String> sentMessages = new ArrayList<>();
    private static final ArrayList<String> disregardedMessages = new ArrayList<>();
    private static final ArrayList<String> storedMessages = new ArrayList<>();
    private static final ArrayList<String> messageHashes = new ArrayList<>();
    private static final ArrayList<String> messageIds = new ArrayList<>();
    private static final ArrayList<String> recipients = new ArrayList<>(); 
    
    public static void main(String[] args){
        initializeTestData();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do{
                System.out.println("\n==== MAIN MENU ====");
                System.out.println("1. Send a Message");
                System.out.println("2. Show Recently Sent Messages");
                System.out.println("3. View Disregarded Messages");
                System.out.println("4. Stored Messages Menu");
                System.out.println("5. Exit");
                System.out.println("Choose an option");
                
                while (!scanner.hasNextInt()){
                    System.out.println("Invalid input. Enter a number (1-5): ");
                    scanner.next();
                }
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice){
                    case 1:
                        System.out.println("Feature handled in previous POE parts.");
                        break;
                    case 2:
                        displaySentMessages();
                        break;
                    case 3:
                        displayDisregardedMessages();
                        break;
                    case 4:
                        runStoredMessagesMenu();
                        break;
                    case 5:
                        System.out.println("Exiting application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 5.");
                }
                
                
            } while (choice != 5);
        }
    }
    
    //  ---Initialize Test Data ---
    public static void initializeTestData(){
        // Test Data 1: Sent
        recipients.add("+27834557896");
        sentMessages.add("Did you get the cake?");
        messageHashes.add("HASH001");
        messageIds.add("ID001");
        
        // Test Data 2: Stored
        recipients.add("+27834557896");
        storedMessages.add("Where are you? You are late! I have asked you to be on time. ");
        messageHashes.add("Test Message 2");
        messageIds.add("ID002");
        
        // Test Data: Disregarded
        recipients.add("+27834557896");
        disregardedMessages.add("Yohoooo, I am at your gate. ");
        messageHashes.add("HASH003");
        messageIds.add("ID003");
        
        // Test Data 4: Sent (Developer entry)
        recipients.add("0838884567");
        sentMessages.add("It is dinner already");
        messageHashes.add("HASH004");
        messageIds.add("0838884567");
        
        // Test Data 5: Stored
        recipients.add("+27834557896");
        storedMessages.add("Ok, I am leaving without you. ");
        messageHashes.add("HASH005");
        messageIds.add("ID005");
        
    }
        // ---Fourth Main Menu Option: Stored Messages Sebmenu ---
    public static void runStoredMessagesMenu(){
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do{
            System.out.println("\n--- Stored Messages Menu ---" );
            System.out.println("a. Display the sender and recipient off all stored messages" );
            System.out.println("b. Display the longest stored message" );
            System.out.println("c. Search for a message ID and display corresponding recipient and message" );
            System.out.println("d. Search for all messages stored for a particular recipient" );
            System.out.println("e. Delete a message using the message hash");
            System.out.println("f. Display a report that lists full details of all stored messages" );
            System.out.println("0. Return to Main Menu" );
            System.out.println("Enter your Choice (a-f): "); 
            
            input = scanner.nextLine().toLowerCase();
            
            switch (input){
                case "a":
                    displayStoredSendersAndRecipients();
                    break;
                case "b":
                    displayLongestStoredMessage();
                    break;
                case "c":
                    System.out.println("Enter Message ID to search: ");
                    String searchId = scanner.nextLine();
                    searchByMessageId(searchId);
                    break;
                case "d":
                    System.out.println("Enter Recipient number to seach: ");
                    String searchRecipient = scanner.nextLine();
                    searchByRecipient(searchRecipient);
                    break;
                case "e":
                    System.out.println("Enter Message Hash to delete: ");
                    String hashToDelete = scanner.nextLine();
                    deleteByMessageHash(hashToDelete);
                    break;
                case "f":
                    displayFullReport();
                    break;
                case "0":
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between a, b, c, d. e, f, or 0. ");
            }        
            }while (input.equals("0"));
        }   
    
        // ---Submenu Function Implementations ---
public static void displaySentMessages(){
            System.out.println("\n--- Sent Message ---");
            for (String msg : sentMessages){
                System.out.println("-" + msg);
            }
        }
public static void displayDisregardedMessages(){
    System.out.println("\n--- Disregarded Messages ---");
    for (String msg : disregardedMessages){
        System.out.println("-" + msg);
    }
}
    
public static void displayStoredSendersAndRecipients(){
    System.out.println("\n--- Stored Message (Senders & Recipients) ---");
    for (int i = 0; i < storedMessages.size(); i++){
        System.out.println("Recipient: " + recipients.get(i) + " | Message: " + storedMessages.get(i));
    }
}
public static String displayLongestStoredMessage(){
    if (storedMessages.isEmpty()){
        System.out.println("No stored messages available. ");
        return "";
    }
    String longest = storedMessages.get(0);
    for (String msg : storedMessages){
        if (msg.length() > longest.length()){
            longest = msg;
        }
    }
    System.out.println("Longest Stored Message:\n" + longest);
    return longest;
}
public static void searchByMessageId(String targetId){
    boolean found = false;
    for (int i = 0; i < messageIds.size(); i++){
        if (messageIds.get(i).equals(targetId)){
            System.out.println("Found -> Recipient: " + recipients.get(i) + " | Message: " + (storedMessages.size() > i ? storedMessages.get(i) :
                    sentMessages.get(0)));
            found = true;
        }
}
  if (!found) {
      System.out.println("No message found with ID: " + targetId);
  } 
}
public static void searchByRecipient(String targetRecipient){
    System.out.println("\n--- Messages for Recipient: " + targetRecipient
    + "---");
    boolean found = false;
    for (int i = 0; i < recipients.size(); i++){
        if (recipients.get(i).equals(targetRecipient)){
            String msg = (i < storedMessages.size()) ? storedMessages.get(i) :
         "Sent/Other message content";
            System.out.println("-" + msg);
            found = true;
        }
    }
    if (!found) {
        System.out.println("No messages found for this recipient.");
    }
}
public static void deletedByMessageHash(String hash){
    int index = messageHashes.indexOf(hash);
    if (index != -1) {
        String msg = (index < storedMessages.size()) ? storedMessages.get(index) :
       "Message";
        messageHashes.remove(index);
        if (index < storedMessages.size()) {
               storedMessages.remove(index);
        }
        System.out.println("Message: \"" + msg + "\" successfully deleted.");
    }else{
        System.out.println("Message has not found.");
    }
}
public static void displayFullReport(){
    System.out.println("\n============= FULL STORED MESSAGE REPORT =============");
    for (int i = 0; i < storedMessages.size(); i++) {
        System.out.println("Message Hash: " + messageHashes.get(i));
        System.out.println("Recipient: " + recipients.get(i));
        System.out.println("Message: " + storedMessages.get(i));
        
        System.out.println("--------------------------------------------------------");
    }
          
}

    public static void deleteByMessageHash(String hashToDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static String displayLongestStoredMesssage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     */
    public static void initalizeTestData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    