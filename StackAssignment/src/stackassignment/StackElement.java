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
//This class defines nodes in the stack
public class StackElement {
    String data;
    StackElement next;
        
    public StackElement (String data, StackElement next) {
            this.data = data;
            this.next = next;
    }
}
