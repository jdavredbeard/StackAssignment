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
public class Stack {
    //top pointer for stack
    private StackElement top;
    //initialize stack size at 0
    private int size = 0;
              
    public Stack (StackElement top) {
        this.top = top;
        //if you initialize the stack with an element that contains data, increment the stack size
        if (top != null) size++;
    }
    //method to add elements to the top of the stack
    public void push(String x) {
        //increment stack size
        size++;
        //if the stack is empty, make a new element that points to null and point top at it
        if (this.top == null) {
            this.top = new StackElement(x, null);
            return;
        }
        //else, make a new element that points at (old) top, then point top at this new element
        this.top = new StackElement(x, this.top);

    }

   // -------
    //method to remove and return elements from the top of the stack
    public String pop() {
        //decrement size
            size--;
            
            if (this.top == null) {
                return "Stack is empty";
            }
            //set return variable to top
            StackElement rtn = this.top;
            //set top to the next element
            this.top = this.top.next;
            //return data from return variable
            return rtn.data;

    }
    
    public int getSize() {
        return size;
    }
    
    public void printStack() {
        StackElement current = this.top;
        //iterate through stack and print data from each element
        //end while when we reach null (end)
        while (current != null) {
                System.out.println(current.data);
                current = current.next;
        }
    }
}
