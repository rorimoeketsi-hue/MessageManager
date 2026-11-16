/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;

import static registrationloginapp.Messaging.Messaging.message;
import static registrationloginapp.RegistrationLoginApp.message;

/**
 *
 * @author Student
 */
public class TestMessaging {

    public static void main(String[] args){
        System.out.println("=== Testing messaging with ARRAYS ===");
        
    }
    String[] vaildNumber = {"+27831234567", "+2781234567", "+2783,",""};
}
String[] invalidNumbers = {"083123567", "27831234567", "+2783",""};
String[] messages = {"Hi there", "a".repeat(100), "a".repeat(260)};

  System.out.printIn("\n-- Test Recipient Cell --");
  for (int i = 0; i < validNumbers.length; i++){

  System.out.println(validNumbers[i] + "->" + "PASS expected true");
}
  for (int i = 0; i < invalidNumbers.length; i++){
   
  System.out.println(invalidNumbers[i] + "-> " + messaging.checkRecipientCell(invaildNumbers[i]
  + message[i].length() + "->" + ok));
}
  
System.out.printIn("\n-- Test Recipient Cell --");
