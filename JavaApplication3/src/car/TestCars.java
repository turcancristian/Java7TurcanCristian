/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Cristi
 */
public class TestCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mertzanul = new Car(Car.Marca.Mercedes, Car.Culoare.BLACK, 230, 460, 50000);
        Car renaultul = new Car(Car.Marca.Renault, Car.Culoare.YELLOW, 180, 120, 2300);  
        Car dacie = new Car(Car.Marca.Dacia, Car.Culoare.RED, 60, 60, 999);
        
        
    }
}
