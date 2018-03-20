/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofigura;

import Domain.Circle;
import Domain.Figure;
import Domain.Square;

/**
 *
 * @author Gabriela Hernández
 */
public class EjemploFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figure figure = new Circle(3, 5, 4);
        Figure figure2 = new Square(5, 5, 5, 5);
        
        System.out.println(figure.toString());
        System.out.println(figure2.toString());
        
    }
    
}
