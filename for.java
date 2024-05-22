// This program demonstrates the usage of the for loop with conditional statements in Java.
class loop {
    public static void main(String[] args) {
        int hi = 1;  // Initialize the counter for "Hi" messages
        int bye = 1;  // Initialize the counter for "Bye" messages
        
        // Loop from n=1 to n=6
        for (int n = 1; n <= 6; n++) {
            // Check if n is odd
            if (n % 2 != 0) {
                System.out.println("Hi" + hi);  // Print "Hi" followed by the current value of hi
                hi++;  // Increment the counter for "Hi" messages
            } else {
                System.out.println("Bye" + bye);  // Print "Bye" followed by the current value of bye
                bye++;  // Increment the counter for "Bye" messages
            }
        }
    }
}

    
        
        
        
        
        
        