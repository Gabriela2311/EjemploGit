/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Gabriela Hernández
 */
public class Figure {
    
     private int sides; 

    public Figure() {
    }

    public Figure(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Figure{" + "sides=" + sides + '}';
    }
}
    
