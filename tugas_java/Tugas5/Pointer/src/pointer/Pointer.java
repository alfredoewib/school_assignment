/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointer;

/**
 *
 * @author Alfredo
 */
public class Pointer {

    /**
     * @param args the command line arguments
     */
    class IntObj {
        public int value;
    }

    public class Binky() {
    public static void main(String[] args) {
        IntObj  x;  // Allocate the pointers x and y
        IntObj  y;  // (but not the IntObj pointees)

        x = new IntObj();   // Allocate an IntObj pointee
                            // and set x to point to it

        x.value = 42;   // Dereference x to store 42 in its pointee

        y.value = 13;   // CRASH -- y does not have a pointee yet

        y = x;  // Pointer assignment sets y to point to x's pointee

        y.value = 13;   // Deference y to store 13 in its (shared) pointee
    }
} 
    
}
