package Tests.StackTest;

import javax.swing.JOptionPane;

import Stack.Stack;

public class Client {

    /*
     * Implement an String inversor using a Stack.
     */

     public static void main(String[] args) {
        
        // Initializing variables.
        String msg = JOptionPane.showInputDialog("Type a message: ");
        int size = msg.length();
        Stack stack = new Stack(size);
        StringBuilder result = new StringBuilder();

        // For each character in the message, if it is not a space, push it to the stack.
        // If it is a space, pop all the characters from the stack and append them to the result.
        for (int i = 0; i < size; i++) {
            if(msg.charAt(i) != ' '){
                stack.push(msg.charAt(i));
            } else{
                while(stack.top >= 0){
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }

        // Add the last inverted word to the result.
        while (stack.top >= 0) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
    
}
