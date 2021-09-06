/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import ec.edu.espol.model.items.Vehiculo;
import java.util.Comparator;

/**
 *
 * @author Leon
 */
public class CompareVehiculoByPrecio implements Comparator<Vehiculo> {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return (int) (o1.getPrecio()-o2.getPrecio());
    }
    
}
