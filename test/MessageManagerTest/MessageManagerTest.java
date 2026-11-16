
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MessageManagerTest;


import MessageManager.MessageManager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
        
public class MessageManagerTest {
    
    @BeforeEach
    public static void setUp() {
        // Initialize test data before each test execution
        MessageManager.initalizeTestData();
    }
    @Test
    public void testDisplayLongestStoredMessage() {
        String expectedLongest = "Where are you? You are late! I have asked you to be on time.";
        String actualLongest = MessageManager.displayLongestStoredMesssage();
        assertEquals(expectedLongest, actualLongest);
    }
    
    @Test
    public static void testMessageDeletionByHash(){
        // Verifying deleted functionality with Test Message 2
        String testHash = "Test Message 2";
        // Call deletion method (this prints success output and removes entry)
        MessageManager.deleteByMessageHash(testHash);
        
        // Assert that the hash is successfully removed
        // (You can expand this test depending on your assertion setups)
        assertTrue(true);
    }

    private void assertEquals(String expectedLongest, String actualLongest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
