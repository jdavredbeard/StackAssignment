/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackassignment;

/**
 *
 * @author jonathandavenport
 */
public class StackAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initially the stack is empty so the top node should be null
        StackElement top = null;
        //instantiate stack with top node
        Stack stack = new Stack(top);
        //array of strings
        String[] strings = {"What", "a","lovely","bunch","of","coconuts"};
        
        int length = strings.length;
        
        //iterate through array and push each word onto the stack
        for (int i = 0; i < length; i++) {
            stack.push(strings[i]);
            System.out.println(stack.getSize());
        }
        //instantiate array to hold words in reverse order, same size as original array
        String[] reversed = new String[length];
        
        //iterate through new array popping words off the stack into the slots
        for (int i = 0; i < length; i++) {
            reversed[i] = stack.pop();
            System.out.println(stack.getSize());
        }
        
        //join the array of reversed order words into a single string
        String reversedString = String.join(" ", reversed);
        
        System.out.println(reversedString);
        
        
    }
    
}
